package academy.devdojo.maratonajava.ListasDeExercicios.lista2.dominio;

public class Ex7 {

    public static int max(int num1, int num2, int num3){
        int maior = num1;
        if (maior < num2) maior = num2;
        if (maior < num3) maior = num3;
        return maior;
    }

    public static double max(double num1, double num2, double num3){
        double maior = num1;
        if (maior < num2) maior = num2;
        if (maior < num3) maior = num3;
        return maior;
    }
}
