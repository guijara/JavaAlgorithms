package academy.devdojo.maratonajava.ListasDeExercicios.lista2.test;

import academy.devdojo.maratonajava.ListasDeExercicios.lista2.dominio.Ex8;

public class Ex8Test {

//    Crie uma classe com um método estático maioria(), que recebe três argumentos do tipo boolean
//    e retorna true se pelo menos dois argumentos tiverem o valor true, ou retorna false caso
//    contrário. Não utilize a instrução if.

    public static void main(String[] args) {
        Ex8 ex8 = new Ex8();
        System.out.println(Ex8.maioria(true, false, true));
    }
}
