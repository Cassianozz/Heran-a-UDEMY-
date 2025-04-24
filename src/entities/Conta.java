package entities;

public class Conta {
    private int numero;
    private String titular;
    protected double balance;

    public Conta(int numero, String titular, double balance) {
        this.numero = numero;
        this.titular = titular;
        this.balance = balance;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getBalance() {
        return balance;
    }
    public void sacar(double valor) {
        if (valor > balance) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            balance -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso. Saldo atual: " + balance);
        }
    }
    public void depositar(double valor) {
        balance += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso. Saldo atual: " + balance);
    }
}
