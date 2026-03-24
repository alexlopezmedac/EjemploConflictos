public class CuentaBancaria {

    private double balance;

    public CuentaBancaria() {
        balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 1000) {
            System.out.println("No puedes, corrupto");
        } else {
                this.balance += cantidad;
        }
    }

}
