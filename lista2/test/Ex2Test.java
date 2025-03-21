package academy.devdojo.maratonajava.ListasDeExercicios.lista2.test;

import academy.devdojo.maratonajava.ListasDeExercicios.lista2.dominio.Ex2;

public class Ex2Test {
    public static void main(String[] args) {
        Ex2 inteiroGigante = new Ex2(new int[] {2,4,234,8000,50,50,530,53});
        inteiroGigante.imprimeInteiroGigante();
        inteiroGigante.somaInteiroGigante();
    }
}
