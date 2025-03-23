package academy.devdojo.maratonajava.ListasDeExercicios.lista3.ex1;

public class ContaCorrente {
    protected double saldo;

    public void imprimeSaldo(){
        System.out.println("-----------------");
        System.out.println("Saldo atual: "+getSaldo());
        System.out.println("-----------------");
    }

    public void depositaSaldo(double saldo){
        System.out.println("-----------------");
        System.out.println("Saldo Atual: "+getSaldo());
        this.saldo += saldo;
        System.out.println("Saldo depositado: "+saldo);
        System.out.println("Novo Saldo: "+this.saldo);
        System.out.println("-----------------");
    }

    public void sacaSaldo(double saldo){
        if (saldo <= this.saldo){
            System.out.println("-----------------");
            System.out.println("Saldo Atual: "+getSaldo());
            this.saldo -= saldo + (saldo * 0.005);
            System.out.println("Saldo sacado: "+saldo);
            System.out.println("Novo Saldo: "+this.saldo);
            System.out.println("-----------------");
        }else {
            System.out.println("Requisição maior que o disponível");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
