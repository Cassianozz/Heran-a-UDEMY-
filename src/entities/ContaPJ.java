package entities;

public class ContaPJ extends Conta {

    public ContaPJ(int numero, String titular, double balance) {
        super(numero, titular, balance);
    }
    private double limiteEmprestimo;
    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }
    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    public ContaPJ(int numero, String titular, double balance, double limiteEmprestimo) {
        super(numero, titular, balance);
        this.limiteEmprestimo = limiteEmprestimo;
    }
    public void limiteEmprestimo(double valor) {
        if (valor <= limiteEmprestimo) {
            balance += valor - 10.0; // taxa de 10 reais
            
}
}
}
