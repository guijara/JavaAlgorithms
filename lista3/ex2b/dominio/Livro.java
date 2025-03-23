package academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2b.dominio;

public class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, String autor, String codigo_de_barras){
        this(nome, preco, autor);
        this.codigo_de_barras = codigo_de_barras;
    }

    public Livro(String nome, double preco, String autor){
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public String toString(){
        return super.toString()+"\nAutor: "+this.autor+"\n-------------";
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
