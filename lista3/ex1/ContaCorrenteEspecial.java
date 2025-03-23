package academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex1;

public class ContaCorrenteEspecial extends ContaCorrente{

    public void sacaSaldo(double saldo){
        if (saldo <= this.saldo){
            System.out.println("-----------------");
            System.out.println("Saldo Atual: "+getSaldo());
            this.saldo -= saldo + (saldo * 0.001);
            System.out.println("Saldo sacado: "+saldo);
            System.out.println("Novo Saldo: "+this.saldo);
            System.out.println("-----------------");
        }else {
            System.out.println("Requisição maior que o disponível");
        }
    }
}
