package academy.devdojo.maratonajava.ListasDeExercicios.lista2.test;

import academy.devdojo.maratonajava.ListasDeExercicios.lista2.dominio.Ex1;

public class Ex1Test {
    public static void main(String[] args) {
        Ex1 retangulo = new Ex1(new double[] {5,10},new double[] {5,5},new double[] {10,5},new double[] {10,10});
        if (retangulo.verificaRetangulo() == 0){
            System.out.println("Não configura um retangulo!");
        }else if (retangulo.verificaRetangulo() == 2){
            System.out.println("É um quadrado!");
        }else {
            System.out.println("É um retangulo!");
        }
        System.out.println("-----------------------");
        retangulo.calculaComprimento();
        System.out.println("-----------------------");
        retangulo.calculaLargura();
        System.out.println("-----------------------");
        retangulo.calculaPerimetro();
        System.out.println("-----------------------");
        retangulo.calculaArea();
    }
}
