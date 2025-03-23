package academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2a.dominio;

public class Dvd extends Produto {
    private double duracao;

    public Dvd(String nome, double preco, double duracao){
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
