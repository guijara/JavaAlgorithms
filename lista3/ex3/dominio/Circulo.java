package academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex3.dominio;

public class Circulo extends FormaGeometrica implements Geometria {
    protected double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calculaPerimetro() {
        return 2*Math.PI*raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI*(raio*raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
