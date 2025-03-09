package academy.devdojo.maratonajava.ListasDeExercicios.lista1.test;

public class Ex16 {
    public static void main(String[] args) {
        int l1 = 27;
        int l2 = 57;
        int l3 = 30;
        boolean existe = true;
        if (l1 + l2 < l3 || l1 + l3 < l2 || l2 + l3 < l1){
            existe = false;
            System.out.println("O triangulo não existe!");
        }
        if (existe && l1 == l2 && l1 == l3){
            System.out.println("O triangulo é equilatero!");
        }else if (existe && l1 == l2 || l2 == l3 || l1 == l3){
            System.out.println("O triangulo é isósceles!");
        }else if (existe){
            System.out.println("O triangulo é escaleno!");
        }

    }
}
