package academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2c.dominio;

public class Dvd extends Produto {
    private double duracao;

    public Dvd(String nome, String preco, double duracao, String codigo_de_barras){
        this(nome, preco, duracao);
        this.codigo_de_barras = codigo_de_barras;
    }

    public Dvd(String nome, String preco, double duracao){
        super(nome, preco);
        this.duracao = duracao;
    }

    @Override
    public String toString(){
        return super.toString()+"\nDuração do Dvd: "+this.duracao+" minutos"+"\n-------------";
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
