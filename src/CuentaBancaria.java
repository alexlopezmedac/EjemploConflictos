public class CuentaBancaria {

    private double balance;

    public CuentaBancaria() {
        balance = 750;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void retirar(int cantidad) {
        this.balance -= cantidad;
    }

}
