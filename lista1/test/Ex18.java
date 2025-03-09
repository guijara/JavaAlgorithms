package academy.devdojo.maratonajava.ListasDeExercicios.lista1.test;

public class Ex18 {
    public static void main(String[] args) {
        double franscisco = 1.5;
        double sara = 1.1;
        int i;
        for (i = 0; franscisco >= sara; i++){
            franscisco += 0.02;
            sara += 0.03;
        }
        System.out.println("Serão necessários "+i+" anos para Sara ser maior que Francisco");
        System.out.println("Altura de Francisco após "+i+" anos: "+franscisco);
        System.out.println("Altura de Sara após "+i+" anos: "+sara);
    }
}
