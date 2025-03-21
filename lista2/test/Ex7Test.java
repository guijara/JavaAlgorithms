package academy.devdojo.maratonajava.ListasDeExercicios.lista2.test;

import academy.devdojo.maratonajava.ListasDeExercicios.lista2.dominio.Ex7;

public class Ex7Test {

//    Crie uma classe com um método estático max3(), que recebe três valores inteiros como argumentos
//    e retorna o valor do maior. Adicione a esta classe uma sobrecarga do método anterior, que faz a
//    mesma operação com valores do tipo double

    public static void main(String[] args) {
        Ex7 ex7 = new Ex7();
        System.out.println("O maior valor é : "+Ex7.max(2.5, 4.7, 6));
    }
}
