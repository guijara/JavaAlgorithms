package academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2a.dominio;

public class Cd extends Produto{
    private int numero_faixas;

    public Cd(String nome, double preco, int numero_faixas){
        super(nome, preco);
        this.numero_faixas = numero_faixas;
    }

    @Override
    public String toString(){
        return super.toString()+"\nNumero de faixas: "+this.numero_faixas+"\n-------------";
    }

    public int getNumero_faixas() {
        return numero_faixas;
    }

    public void setNumero_faixas(int numero_faixas) {
        this.numero_faixas = numero_faixas;
    }
}
