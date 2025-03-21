package academy.devdojo.maratonajava.ListasDeExercicios.lista2.dominio;

public class Ex2 {
    private int[] inteiroGigante;

    public Ex2(int[] inteiroGigante){
        this.inteiroGigante = inteiroGigante;
    }

    public void imprimeInteiroGigante(){
        System.out.println("Imprimindo o vetor...");
        for (int i: inteiroGigante){
            System.out.println(i);
        }
    }

    public void somaInteiroGigante(){
        System.out.println("Somando InteiroGigante");
        int soma = 0;
        for (int i: inteiroGigante){
            soma += i;
        }
        System.out.println("A soma é igual à: "+soma);
    }

    public int[] getInteiroGigante() {
        return inteiroGigante;
    }

    public void setInteiroGigante(int[] inteiroGigante) {
        this.inteiroGigante = inteiroGigante;
    }
}
