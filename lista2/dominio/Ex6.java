package academy.devdojo.maratonajava.ListasDeExercicios.lista2.dominio;

public class Ex6 {
    public static int somatorioRecursivo(int n) {
        if (n == 0) {
            return 0;  // Caso base
        } else {
            int somaAnterior = somatorioRecursivo(n - 1);  // Chamada recursiva
            System.out.print(somaAnterior + n);
            if (n > 1) {
                System.out.print(", ");  // Coloca vírgula entre os números, exceto após o último
            }
            return somaAnterior + n;  // Retorna o somatório até n
        }
    }

    //    public int somatorio(int n){
//        if (n == 0){
//            return 0;
//        }
//        System.out.print(somatorio(n-1));
//        if (n > 0){
//            System.out.print(", ");
//        }
//        return n + somatorio(n-1);
//    }
}
