package academy.devdojo.maratonajava.ListasDeExercicios.lista1.test;

public class Ex23 {
    public static void main(String[] args) {
        int valor_hora = 50;
        int num_horas = 90;
        double salario = (valor_hora * num_horas);
        if (salario <= 1518){
            salario -= (salario * 0.075);
        }else if (salario <= 2793.88 && salario > 1518){
            salario -= (salario * 0.09);
        }else if (salario > 2793.88 && salario <= 4190.83){
            salario -= (salario * 0.012);
        }else if (salario > 4190.83){
            salario -= (salario * 0.015);
        }
        System.out.println(salario);
    }
}
