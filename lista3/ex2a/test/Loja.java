package academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2a.test;

import academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2a.dominio.Cd;
import academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2a.dominio.Dvd;
import academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2a.dominio.Livro;
import academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2a.dominio.Produto;

public class Loja {

//    Crie uma hierarquia de classes de domínio para uma loja que venda livros, CDs e DVDs. Sobrescreva o
//    método toString() para que imprima:
//    • Para livros: nome, preço e autor;
//    • Para CDs: nome, preço e número de faixas;
//    • Para DVDs: nome, preço e duração.
//    Evite ao máximo repetição de código utilizando a palavra super no construtor e no método sobrescrito. Em
//    seguida, crie uma classe Loja com o método main() que adicione 5 produtos diferentes (a sua escolha) a
//    um vetor e, por fim, imprima o conteúdo do vetor.

    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", 69.99, "Machado de Assis");
        Livro livro2 = new Livro("Quarto de Despejo", 59.99, "Carolina Maria de Jesus");
        Cd cd1 = new Cd("As Canções Que Você Fez pra Mim", 19.99, 8);
        Dvd dv1 = new Dvd("Galinha Pintadinha Vol 4", 50.00, 20);
        Dvd dv2 = new Dvd("Ao Vivo - 10 anos - Ivete Sangalo", 70.00, 22);
        Produto[] produtos = new Produto[] {livro1, livro2, cd1, dv1, dv2};

        for (Produto i:produtos){
            System.out.println(i);
        }
    }
}
