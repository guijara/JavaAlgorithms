package academy.devdojo.maratonajava.ListasDeExercicios.lista2.test;

import academy.devdojo.maratonajava.ListasDeExercicios.lista2.dominio.Ex3;

public class Ex3Test {
    public static void main(String[] args) {
        Ex3 poupador1 = new Ex3(2000, "Guilherme");
        Ex3 poupador2 = new Ex3(3000, "Alessandra");
        System.out.println("Saldo atual de "+poupador1.getNome()+" = "+poupador1.getSaldoDaPoupança());
        System.out.println("Saldo atual de "+poupador2.getNome()+" = "+poupador2.getSaldoDaPoupança());
        System.out.println("------------------------");
        poupador1.calculaRendimentoMensal();
        poupador2.calculaRendimentoMensal();
        System.out.println("------------------------");
        Ex3.modificaTaxaDeJurosAnual(0.08);
        poupador1.calculaRendimentoMensal();
        poupador2.calculaRendimentoMensal();
        System.out.println("------------------------");
    }
}

