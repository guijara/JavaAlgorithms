package academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2b.test;

import academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2b.dominio.Cd;
import academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2b.dominio.Dvd;
import academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2b.dominio.Livro;
import academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2b.dominio.Produto;

public class Loja {

//    Modifique o código do programa anterior, da seguinte forma:
//    a) Adicione um atributo que represente o código de barras do produto (é um valor obrigatório e,
//                                                                          portanto, deve ser pedido no construtor);
//    b) Sobrescreva o método equals() retornando true se dois produtos possuem o mesmo código de
//    barras;
//    c) Na classe Loja, implemente um simples procedimento de busca que, dado um produto e um vetor
//    de produtos, indique em que posição do vetor se encontra o produto especificado ou imprima que o
//    mesmo não foi encontrado;
//    d) No método Loja.main(), após a impressão do vetor (feita na questão 2a), escolha um dos 5
//    produtos e crie duas novas instâncias idênticas a ele: uma com o mesmo código de barras e outra
//    com o código diferente. Efetue a busca deste produto no vetor utilizando as duas instâncias e
//    verifique o resultado.

    public static void encontraProdutoNoVetor(Produto[] produtos, Produto produto){
        boolean encontrou = false;
        for (int i = 0; i < produtos.length; i++) {
            if (produto.getCodigo_de_barras() == produtos[i].getCodigo_de_barras()){
                System.out.println("O produto se encontra na posição " + i);
                encontrou = true;
                break;
            }
        }
        if (!encontrou){
            System.out.println("Produto não encontrado");
        }
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", 69.99, "Machado de Assis", "7bC90");
        Livro livro2 = new Livro("Quarto de Despejo", 59.99, "Carolina Maria de Jesus", "242g3g");
        Cd cd1 = new Cd("As Canções Que Você Fez pra Mim", 19.99, 8, "29040n2f");
        Dvd dv1 = new Dvd("Galinha Pintadinha Vol 4", 50.00, 20, "9fafJF7");
        Dvd dv4 = new Dvd("Ao Vivo - 10 anos - Ivete Sangalo", 70.00, 22, "IFA882nM");
        Produto[] produtos = new Produto[] {livro1, livro2, cd1, dv1, dv4};

        java.util.Arrays.sort(produtos);
        for (Produto produto:produtos){
            System.out.println(produto);
        }

    }
}
