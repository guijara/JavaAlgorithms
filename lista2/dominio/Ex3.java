package academy.devdojo.maratonajava.ListasDeExercicios.lista2.dominio;

public class Ex3 {
    private static double taxaDeJurosAnual = 0.06;
    private double saldoDaPoupança;
    private String nome;

    public Ex3(double saldoDaPoupança, String nome){
        this.saldoDaPoupança = saldoDaPoupança;
        this.nome = nome;
    }

    public void calculaRendimentoMensal(){
        System.out.println("O rendimento mensal é de "+(saldoDaPoupança * (taxaDeJurosAnual/12)));
        saldoDaPoupança += (saldoDaPoupança * (taxaDeJurosAnual/12));
        System.out.println("O saldo da poupança de "+nome+" é "+saldoDaPoupança);
    }

    public static void modificaTaxaDeJurosAnual(double taxaDeJurosAnual){
        Ex3.taxaDeJurosAnual = taxaDeJurosAnual;
    }

    public double getSaldoDaPoupança() {
        return saldoDaPoupança;
    }

    public void setSaldoDaPoupança(double saldoDaPoupança) {
        this.saldoDaPoupança = saldoDaPoupança;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
