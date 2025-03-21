package academy.devdojo.maratonajava.ListasDeExercicios.lista2.test;

import academy.devdojo.maratonajava.ListasDeExercicios.lista2.dominio.Ex9;

public class Ex9Test {

//    Crie uma classe com um método estático converte(), que recebe um argumento do tipo float
//    e retorna o mesmo como double utilizando apenas a promoção de argumentos.

    public static void main(String[] args) {
        Ex9 ex9 = new Ex9();
        float num = 300.5F;
        System.out.println(Ex9.converteFloatEmDouble(num));
    }

}
