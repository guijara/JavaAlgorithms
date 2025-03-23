package academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex2c.dominio;

import javax.print.DocFlavor;

public class Cd extends Produto {
    private int numero_faixas;

    public Cd(String nome, String preco, int numero_faixas, String codigo_de_barras){
        this(nome, preco, numero_faixas);
        this.codigo_de_barras = codigo_de_barras;
    }

    public Cd(String nome, String preco, int numero_faixas){
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
