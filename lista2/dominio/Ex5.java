package academy.devdojo.maratonajava.ListasDeExercicios.lista2.dominio;

public class Ex5 {
    public int[] vetor;
    public int item;

    public int pesquisaBinaria(int[] vetor, int item){
        int menor = 0;
        int maior = vetor.length - 1;
        int meio;
        while (menor <= maior){
            meio = (menor + maior)/2;
            if (vetor[meio] == item){
                System.out.println(meio);
                return meio;
            }else if (vetor[meio] < item){
                menor = meio + 1;
            }else{
                maior = meio - 1;
            }
        }
        System.out.println("Não encontrado!");
        return -1;
    }

}
