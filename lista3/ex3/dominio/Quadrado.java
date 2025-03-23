package academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex3.dominio;

public class Quadrado extends Quadrilateros {

    public Quadrado(double lado) {
        super(lado, lado, lado, lado);
    }

    @Override
    public double calculaArea() {
        return l1*l1;
    }
}
