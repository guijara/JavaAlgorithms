package academy.devdojo.maratonajava.ListasDeExercicios.lista1.test;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioMinimo = 1293.20;
        System.out.print("Digite um numero: ");
        double salario = input.nextInt();
        System.out.print("Digite um nome: ");
        String nome = input.next();
        if (salario > salarioMinimo){
            System.out.println("O usuário "+nome+" recebe "+salario+", o equivalente à "+((salario / salarioMinimo))+" salários mínimos");
        }else{
            System.out.println("O usuário"+nome+" recebe menos de um salário mínimo");
        }
    }
}
