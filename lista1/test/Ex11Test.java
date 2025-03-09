package academy.devdojo.maratonajava.ListasDeExercicios.lista1.test;

import academy.devdojo.maratonajava.ListasDeExercicios.lista1.dominio.Ex11;

public class Ex11Test {
    public static void main(String[] args) {
        Ex11 aluno = new Ex11("Guilherme", new double[]{9.2,7.8,6.5,10});
        aluno.verificaAprovacao();
    }
}
