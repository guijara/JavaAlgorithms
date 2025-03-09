package academy.devdojo.maratonajava.ListasDeExercicios.lista1.test;

import java.util.Locale;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Digite seu peso em Kg`s: ");
        double peso = input.nextDouble();
        while (peso < 10) peso = input.nextDouble();
        System.out.print("Digite sua altura em metros: ");
        double altura = input.nextDouble();
        while (altura < 0.5) altura = input.nextDouble();
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println(imc+", Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println(imc+", Peso ideal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println(imc+", Levemente acima do peso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println(imc+", Obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println(imc+", Obesidade grau II (severa)");
        } else if (imc >= 40) {
            System.out.println(imc+", Obesidade grau III (mórbida)");
        }
    }
}
