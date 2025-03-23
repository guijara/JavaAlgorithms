package academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex3.dominio;

public class Retangulo extends Quadrilateros{

    public Retangulo(double altura, double base){
        super(altura, base, altura, base);
    }

    @Override
    public double calculaArea() {
        return l1*l2;
    }
}
