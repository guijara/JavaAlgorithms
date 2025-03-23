package academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2a.dominio;

public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString(){
        return "Nome: "+this.nome+"\nPreço: "+this.preco+"R$";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
