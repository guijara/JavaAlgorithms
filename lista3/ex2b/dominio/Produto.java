package academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2b.dominio;

public class Produto{
    protected String nome;
    protected double preco;
    protected String codigo_de_barras;

    public Produto(String nome, double preco, String codigo_de_barras){
        this(nome, preco);
        this.codigo_de_barras = codigo_de_barras;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public static boolean equals(Produto[] produtos){
        for (Produto i: produtos){
            for (Produto j: produtos){
                if (i == j){
                    continue;
                }else if (i.codigo_de_barras == j.codigo_de_barras){
                    return true;
                }
            }
        }
        return false;
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

    public String getCodigo_de_barras() {
        return codigo_de_barras;
    }

    public void setCodigo_de_barras(String codigo_de_barras) {
        this.codigo_de_barras = codigo_de_barras;
    }
}
