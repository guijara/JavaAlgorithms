package academy.devdojo.maratonajava.ListasDeExercicios.lista1.test;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int maior = input.nextInt();
        int auxiliar;
        System.out.println("Digite um número: ");
        int menor = input.nextInt();
        while (menor == maior){
            System.out.println("Digite um número diferente de "+maior);
            menor = input.nextInt();
        }
        if (menor > maior){
            auxiliar = maior;
            maior = menor;
            menor = auxiliar;
        }
        System.out.println("Digite um número: ");
        int num = input.nextInt();
        while (num == maior || num == menor){
            System.out.println("Digite um número diferente de "+maior+" e "+menor);
            num = input.nextInt();
        }
        if (num > maior){
            auxiliar = maior;
            maior = num;
            num = auxiliar;
        }else if(num < menor){
            auxiliar = menor;
            menor = num;
            num = auxiliar;
        }
        System.out.println("Ordem Decrescente: "+maior+" "+num+" "+menor);
    }
}
