package academy.devdojo.maratonajava.ListasDeExercicios.lista1.test;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        System.out.println("Número: "+num);
        if (num % 2 == 0){
            System.out.println("O número é par");
        } else{
            System.out.println("O número é impar");
        }
        if (num < 0){
            System.out.println("O número é negativo");
        }else{
            System.out.println("O número é positivo");
        }
    }
}
