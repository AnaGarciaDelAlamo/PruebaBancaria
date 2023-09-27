public class Lanzador {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(10000);

        Thread[] depositoThreads = new Thread[1200];
        Thread[] retiroThreads = new Thread[1200];

        for (int i = 0; i < 400; i++) {
            depositoThreads[i] = new Thread(new HiloCliente(cuenta, 100, true));
            depositoThreads[i + 400] = new Thread(new HiloCliente(cuenta, 50, true));
            depositoThreads[i + 800] = new Thread(new HiloCliente(cuenta, 20, true));

            retiroThreads[i] = new Thread(new HiloCliente(cuenta, 100, false));
            retiroThreads[i + 400] = new Thread(new HiloCliente(cuenta, 50, false));
            retiroThreads[i + 800] = new Thread(new HiloCliente(cuenta, 20, false));
        }

        for (int i = 0; i < 1200; i++) {
            depositoThreads[i].start();
            retiroThreads[i].start();
        }

        for (int i = 0; i < 1200; i++) {
            try {
                depositoThreads[i].join();
                retiroThreads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        double saldoFinal = cuenta.obtenerSaldo();
        if (saldoFinal == 10000) {
            System.out.println("La simulación ha funcionado correctamente. Saldo final: " + saldoFinal);
        } else {
            System.out.println("La simulación ha fallado. Saldo final: " + saldoFinal);
        }
    }
}