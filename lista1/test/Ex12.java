package academy.devdojo.maratonajava.ListasDeExercicios.lista1.test;

import java.util.Locale;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Digite o valor do produto: ");
        double valor = input.nextDouble();
        System.out.println("Formas de pagamento -> PIX (OPÇÃO 1), CARTÃO (OPÇÃO 2) E DINHEIRO (OPÇÃO 3)");
        int opcao = input.nextInt();
        while (opcao < 1 || opcao > 3){
            System.out.println("Formas de pagamento -> PIX (OPÇÃO 1), CARTÃO (OPÇÃO 2) E DINHEIRO (OPÇÃO 3)");
            opcao = input.nextInt();
        }
        if (opcao == 1 || opcao == 3){
            System.out.println("Valor final: "+(valor - valor*0.15));
        }else if (opcao == 2){
            System.out.println("À Vista (opção1), Parcelado 2x (opção2), Parcelado 3x ou mais (opção3)");
            opcao = input.nextInt();
            while (opcao < 1 || opcao > 3){
                System.out.println("À Vista (opção1), Parcelado 2x (opção2), Parcelado 3x ou mais (opção3)");
                opcao = input.nextInt();
            }
            if (opcao == 1){
                System.out.println("Valor final: "+(valor - valor*0.1));
            }else if(opcao == 2){
                System.out.println("Valor Final: "+valor);
            }else{
                System.out.println("Valor Final :"+(valor + valor*0.1));
            }
        }


    }
}
