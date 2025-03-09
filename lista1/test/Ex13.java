package academy.devdojo.maratonajava.ListasDeExercicios.lista1.test;

import java.util.Locale;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Digite seu nome: ");
        String nome = input.next();
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        if (idade >= 18){
            System.out.println(nome+" é uma pessoa maior de idade!");
        }else{
            System.out.println(nome+" é uma pessoa menor de idade!");
        }
    }
}
