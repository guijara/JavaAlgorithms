package academy.devdojo.maratonajava.ListasDeExercicios.lista1.test;

public class Ex19 {
    public static void main(String[] args) {
        System.out.println("A tabuada de 1 à 10");
        System.out.println("-----------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("-----------------------------------");
        }
    }
}