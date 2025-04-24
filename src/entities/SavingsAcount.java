package entities;

public class SavingsAcount extends Conta {
    private double interestRate;

    public SavingsAcount(int numero, String titular, double balance, double interestRate) {
        super(numero, titular, balance);
        this.interestRate = interestRate;
    }    
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void atualizarSaldo(){
        balance += balance * interestRate;
    }
}
