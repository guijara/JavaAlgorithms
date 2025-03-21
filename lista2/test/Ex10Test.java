package academy.devdojo.maratonajava.ListasDeExercicios.lista2.test;

import academy.devdojo.maratonajava.ListasDeExercicios.lista2.dominio.Ex10;

public class Ex10Test {

//    Crie uma classe Tempo com três atributos: horas, minutos e segundos. Crie dois construtores:
//    um para inicializar os atributos com valor zero e outro para inicializar os atributos com valores
//    passados como argumentos. Crie métodos para:
//            (a) Funcionar como getter e setter.
//            (b) Imprimir os atributos no formato hh:mm:ss.
//            (c) Subtrair dois objetos e colocar o resultado no objeto que o chamou.
//            (d) Somar dois objetos e colocar o resultado no objeto que o chamou.
//            (e) Sobrecarregue este último método para que retorne um objeto com o resultado da operação.

    public static void main(String[] args) {
        Ex10 primeiroObjeto = new Ex10(3,15,90);
        Ex10 segundoObjeto = new Ex10(1,70,1800);
        Ex10 terceiroObjeto = new Ex10(1,900,500);

        primeiroObjeto.imprimeTempo();
        segundoObjeto.imprimeTempo();

        primeiroObjeto.subtraiObjetos(segundoObjeto);
        primeiroObjeto.somaObjetos(2,50,13);
        primeiroObjeto.somaObjetos(terceiroObjeto);


    }
}
