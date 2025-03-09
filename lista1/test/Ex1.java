package academy.devdojo.maratonajava.ListasDeExercicios.lista1.test;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int a = input.nextInt();
        System.out.print("Digite um número: ");
        int b = input.nextInt();
        System.out.print("Digite um número: ");
        int c = input.nextInt();
        if (a + b > c) {
            System.out.println("A soma entre " + a + " e " + b + " é " + (a + b));
        } else {
                System.out.println("A soma de A e B é "+(a+b)+" e é menor que "+c);
        }
    }
}
