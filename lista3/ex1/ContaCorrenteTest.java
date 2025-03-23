package academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex1;

public class ContaCorrenteTest {

//    Crie uma classe para representar uma conta corrente, com métodos para depositar uma quantia, sacar
//    uma quantia e obter o saldo. Para cada saque será debitada também uma taxa de operação equivalente à
//    0,5% do valor sacado. Crie, em seguida, uma subclasse desta classe anterior para representar uma conta
//    corrente de um cliente especial. Clientes especiais pagam taxas de operação de apenas 0,1% do valor
//    sacado. Faça testes com as duas classes e verifique seus resultados.

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial();

        contaCorrente.depositaSaldo(6000);
        contaCorrente.sacaSaldo(2000);

        contaCorrenteEspecial.depositaSaldo(6000);
        contaCorrenteEspecial.sacaSaldo(2000);

        contaCorrente.imprimeSaldo();
        contaCorrenteEspecial.imprimeSaldo();
    }
}
