package academy.devdojo.maratonajava.ListasDeExercicios.lista2.dominio;

public class Ex10 {
    private int horas;
    private int minutos;
    private int segundos;

    public Ex10(){
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Ex10(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.formataTempo();
    }

    public void imprimeTempo(){
        System.out.println(getHoras()+":"+getMinutos()+":"+getSegundos());
    }

    public void formataTempo(){
        System.out.println("-----------------");
        System.out.println("Antes -> "+this.horas+":"+this.minutos+":"+this.segundos);
        //se negativo;
        while (segundos < 0){
            if (horas > 0){
                minutos += 60;
                segundos += 60;
                minutos = minutos - 1;
                horas -= 1;
            }
        }
        //se maior que 60;
        while (segundos >= 60){
            minutos += 1;
            segundos = segundos - 60;
        }
        while (minutos >= 60){
            horas += 1;
            minutos = minutos - 60;
        }
        System.out.println("Depois -> "+this.horas+":"+this.minutos+":"+this.segundos);
        System.out.println("-----------------");
    }

    public Ex10 subtraiObjetos(Ex10 objeto){
        System.out.println("-----------------");
        this.horas -= objeto.horas;
        this.minutos -= objeto.minutos;
        this.segundos -= objeto.segundos;
        System.out.println(getHoras()+":"+getMinutos()+":"+getSegundos());
        return new Ex10(this.horas, this.minutos, this.segundos);
    }

    public Ex10 somaObjetos(int horas, int minutos, int segundos){
        System.out.println("-----------------");
        this.horas += horas;
        this.minutos += minutos;
        this.segundos += segundos;
        System.out.println(getHoras()+":"+getMinutos()+":"+getSegundos());
        return this;
    }

    public Ex10 somaObjetos(Ex10 objeto){
        System.out.println("-----------------");
        this.horas += objeto.horas;
        this.minutos += objeto.minutos;
        this.segundos += objeto.segundos;
        System.out.println(getHoras()+":"+getMinutos()+":"+getSegundos());
        return new Ex10(this.horas, this.minutos, this.segundos);
    }

    public void setHoras(int horas){
        this.horas = horas;
    }

    public int getHoras(){
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
}
