package academy.devdojo.maratonajava.ListasDeExercicios.lista1.test;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = input.nextInt();
        System.out.print("Digite um número: ");
        int num2 = input.nextInt();
        if (num1 == num2){
            int soma = num1 + num2;
            System.out.println("A soma entre "+num1+" e "+num2+" é "+soma);
        }else{
            int produto = num1 * num2;
            System.out.println("A multiplicação entre "+num1+" e "+num2+" é "+produto);
        }
    }
}
