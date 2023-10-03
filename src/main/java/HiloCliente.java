import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class HiloCliente implements Runnable {
    private Cuenta cuenta;
    private double cantidad;
    private boolean deposito;

    public HiloCliente(Cuenta cuenta, double cantidad, boolean deposito) throws IOException {
        this.cuenta = cuenta;
        this.cantidad = cantidad;
        this.deposito = deposito;
    }

    @Override
    public void run() {
        if (deposito) {
            cuenta.depositar(cantidad);
        } else {
            cuenta.retirar(cantidad);
        }
    }
}

