package academy.devdojo.maratonajava.ListasDeExercicios.lista2.dominio;

public class Ex9 {
    private static double num;

    public static double converteFloatEmDouble(float num){
        Ex9.num = num;
        return Ex9.num;
    }

    public static double getNum() {
        return num;
    }

    public static void setNum(double num) {
        Ex9.num = num;
    }
}
