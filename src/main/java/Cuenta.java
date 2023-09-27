class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void depositar(double cantidad) {
        saldo += cantidad;
    }

    public synchronized void retirar(double cantidad) {
        saldo -= cantidad;
    }

    public synchronized double obtenerSaldo() {
        return saldo;
    }
}
