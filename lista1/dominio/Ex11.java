package academy.devdojo.maratonajava.ListasDeExercicios.lista1.dominio;

public class Ex11 {
    private String nome;
    private double[] notas = new double[4];

    public Ex11(String nome, double[] nota){
        this.nome = nome;
        this.notas = nota;
    }

    public void verificaAprovacao(){
        double media = 0;
        for (double nota: this.notas){
            media += nota;
        }
        media = media / 4;
        System.out.println("Sua media é: "+media);
        if (media >= 7){
            System.out.println("Aprovado");
        }else System.out.println("Reprovado");
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String nome(){
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
