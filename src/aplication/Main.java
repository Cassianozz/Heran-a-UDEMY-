package aplication;

import entities.Conta;
import entities.ContaPJ;
import entities.SavingsAcount;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1001, "Alex", 0.0);
        ContaPJ contaPJ = new ContaPJ(1002, "Maria", 0.0, 500.0);
        
        //upCasting
        Conta conta1 = contaPJ; // upcasting
        Conta conta2 = new ContaPJ(1003, "João", 0.0, 500.0); // upcasting
        Conta conta3 = new SavingsAcount(1004, "Ana", 0.0, 0.01);
        

        //downCasting
        ContaPJ conta4 = (ContaPJ) conta2;
        conta4.limiteEmprestimo(100.0); // chamando o método da classe ContaPJ

        //ContaPJ conta5 = (ContaPJ) conta3; // downcasting
        if(conta3 instanceof ContaPJ){
            ContaPJ conta5 = (ContaPJ) conta3;
            conta5.limiteEmprestimo(100.0); // chamando o método da classe ContaPJ
            System.out.println("Emprestimo!");
    }
    if(conta3 instanceof SavingsAcount){
        SavingsAcount conta5 = (SavingsAcount) conta3;
        conta5.atualizarSaldo(); // chamando o método da classe SavingsAcount
        System.out.println("Atualizado saldo!");
    }
}
}