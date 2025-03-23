package academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex3.test;


import academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex3.dominio.Circulo;
import academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex3.dominio.FormaGeometrica;
import academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex3.dominio.Quadrado;
import academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex3.dominio.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class GeometriaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Quantas formas geométricas deseja criar? ");
        System.out.print("->  ");
        int quantidade_formas = scanner.nextInt();
        for (int i = 0; i < quantidade_formas; i++) {
            System.out.println("Qual forma deseja criar:");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.print("->  ");
            int codigo_forma = scanner.nextInt();
            while (codigo_forma < 1 || codigo_forma > 3) {
                System.out.println("Qual forma deseja criar:");
                System.out.println("1 - Quadrado");
                System.out.println("2 - Retângulo");
                System.out.println("3 - Círculo");
                System.out.print("->  ");
                codigo_forma = scanner.nextInt();
            }
            FormaGeometrica[] formasGeometricas = new FormaGeometrica[quantidade_formas];
            switch (codigo_forma) {
                case 1:
                    System.out.println("Digite o tamanho do lado do Quadrado: ");
                    System.out.print("->  ");
                    double lado = scanner.nextDouble();
                    formasGeometricas[i] = new Quadrado(lado);
                    break;
                case 2:
                    System.out.println("Digite o tamanho da altura do Retângulo: ");
                    System.out.print("->  ");
                    double altura = scanner.nextDouble();
                    System.out.println("Digite o tamanho da base do Retângulo: ");
                    System.out.print("->  ");
                    double base = scanner.nextDouble();
                    formasGeometricas[i] = new Retangulo(altura, base);
                    break;
                case 3:
                    System.out.println("Digite o tamanho do raio do círculo: ");
                    System.out.print("->  ");
                    double raio = scanner.nextDouble();
                    formasGeometricas[i] = new Circulo(raio);
                    break;
                default:
                    System.out.println("Digito inválido");
                    break;
            }
            if (formasGeometricas[i] instanceof Quadrado) {
                System.out.println("Quadrado -> lados = " + ((Quadrado) formasGeometricas[i]).getL1());
                System.out.println("Perimetro -> " + ((Quadrado) formasGeometricas[i]).calculaPerimetro());
                System.out.println("Área -> " + ((Quadrado) formasGeometricas[i]).calculaArea());
                System.out.println("-----------------");
            } else if (formasGeometricas[i] instanceof Retangulo) {
                System.out.println("Retângulo -> Altura = " + ((Retangulo) formasGeometricas[i]).getL1() + " Base = " + ((Retangulo) formasGeometricas[i]).getL2());
                System.out.println("Perimetro -> " + ((Retangulo) formasGeometricas[i]).calculaPerimetro());
                System.out.println("Área -> " + ((Retangulo) formasGeometricas[i]).calculaArea());
                System.out.println("-----------------");
            } else if (formasGeometricas[i] instanceof Circulo) {
                System.out.println("Círculo -> Raio = " + ((Circulo) formasGeometricas[i]).getRaio());
                System.out.println("Perímetro -> " + ((Circulo) formasGeometricas[i]).calculaPerimetro());
                System.out.println("Área -> " + ((Circulo) formasGeometricas[i]).calculaArea());
                System.out.println("-----------------");
            }
        }
    }
}
