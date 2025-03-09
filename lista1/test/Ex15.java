package academy.devdojo.maratonajava.ListasDeExercicios.lista1.test;

import java.util.Locale;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Digite seu ano de nascimento: ");
        int ano = input.nextInt();
        while (ano < 1900 || ano > 2024){
            System.out.println("Digite um ano válido!");
            ano = input.nextInt();
        }
        ano = (2025 - ano) * 365;
        ano += 117;
        int anos = ano / 365;
        ano = ano - (anos * 365);
        int meses = ano / 30;
        ano = ano - (meses * 30);
        int dias = ano;
        System.out.println("Voce viveu "+anos+" anos, "+meses+" meses, "+dias+" dias");
    }
}
