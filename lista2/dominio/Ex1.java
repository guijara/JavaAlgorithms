package academy.devdojo.maratonajava.ListasDeExercicios.lista2.dominio;

public class Ex1 {
    private double[] primeiraCoordenada = new double[2];
    private double[] segundaCoordenada = new double[2];
    private double[] terceiraCoordenada = new double[2];
    private double[] quartaCoordenada = new double[2];

    public Ex1(double[] primeiraCoordenada, double[] segundaCoordenada, double[] terceiraCoordenada, double[] quartaCoordenada){
        this.primeiraCoordenada = primeiraCoordenada;
        this.segundaCoordenada = segundaCoordenada;
        this.terceiraCoordenada = terceiraCoordenada;
        this.quartaCoordenada = quartaCoordenada;
    }

    public int verificaRetangulo(){
        if (primeiraCoordenada[0] != segundaCoordenada[0] || primeiraCoordenada[1] != quartaCoordenada[1]) return 0;
        if (segundaCoordenada[1] != terceiraCoordenada[1] || terceiraCoordenada[0] != quartaCoordenada[0]) return 0;
        if ((quartaCoordenada[0] - primeiraCoordenada[0] == primeiraCoordenada[1] - segundaCoordenada[1]) && (quartaCoordenada[1] - terceiraCoordenada[1] ==
                terceiraCoordenada[0] - segundaCoordenada[0]) && (quartaCoordenada[0] - primeiraCoordenada[0] == terceiraCoordenada[0] - segundaCoordenada[0])) return 2;
        return 1;
    }

    public void calculaComprimento(){
        if (verificaRetangulo() != 0){
            System.out.println("O comprimento do retangulo é: "+(quartaCoordenada[0] - primeiraCoordenada[0]));
        }
    }

    public void calculaLargura(){
        if (verificaRetangulo() != 0){
            System.out.println("A largura do retangulo é: "+(primeiraCoordenada[1] - segundaCoordenada[1]));
        }
    }

    public void calculaPerimetro(){
        if (verificaRetangulo() != 0){
            System.out.println("O perimetro do retangulo é : "+(((quartaCoordenada[0] - primeiraCoordenada[0]) * 2)+((primeiraCoordenada[1] - segundaCoordenada[1])*2)));
        }
    }

    public void calculaArea(){
        if (verificaRetangulo() != 0){
            double area = (quartaCoordenada[0] - primeiraCoordenada[0]) * (primeiraCoordenada[1] - segundaCoordenada[1]);
            System.out.println("A área do retangulo é: "+area);
        }
    }

    public void setPrimeiraCoordenada(double[] primeiracoordenada){
        this.primeiraCoordenada = primeiracoordenada;
    }

    public double[] getPrimeiraCoordenada(){
        return this.primeiraCoordenada;
    }

    public double[] getSegundaCoordenada() {
        return segundaCoordenada;
    }

    public void setSegundaCoordenada(double[] segundaCoordenada) {
        this.segundaCoordenada = segundaCoordenada;
    }

    public double[] getTerceiraCoordenada() {
        return terceiraCoordenada;
    }

    public void setTerceiraCoordenada(double[] terceiraCoordenada) {
        this.terceiraCoordenada = terceiraCoordenada;
    }

    public double[] getQuartaCoordenada() {
        return quartaCoordenada;
    }

    public void setQuartaCoordenada(double[] quartaCoordenada) {
        this.quartaCoordenada = quartaCoordenada;
    }
}
