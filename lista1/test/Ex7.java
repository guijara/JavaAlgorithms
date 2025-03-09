package academy.devdojo.maratonajava.ListasDeExercicios.lista1.test;

public class Ex7 {
    public static void main(String[] args) {
        boolean result1 = false;
        boolean result2 = false;
        if (result1 == result2 && result1){
            System.out.println("Ambos são iguais e VERDADEIROS");
        }else if(result1 == result2 && !result1){
            System.out.println("Ambos são iguais e FALSOS");
        }else{
            System.out.println("São diferentes");
        }

    }
}
