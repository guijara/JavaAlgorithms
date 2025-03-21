package academy.devdojo.maratonajava.ListasDeExercicios.lista2.test;

public class Ex4Test {
    public static void main(String[] args) {
        int[] vetor = new int[] { 2, 4, 6, 8, 10, 12 };
        for (int i = 0; i <= 12; i++) {
            if (i >= vetor.length){
                System.out.println("O vetor Acabou!");
                break;
            }
            System.out.println(vetor[i]);
        }
    }
}
