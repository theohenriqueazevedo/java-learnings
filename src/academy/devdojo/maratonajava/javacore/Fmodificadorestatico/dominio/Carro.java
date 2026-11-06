package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {

    private String nome;
    private double velocidadeMax;
    public static double velocidadeLim = 250;

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime(){
        System.out.println("--------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Velocidade maxima; "+ this.velocidadeMax);
        System.out.println("Velocidade limite; "+ Carro.velocidadeLim);
    }
    public static void setVelocidadeLim(double velocidadeLim){
        //this nao existe para public, pois ele se refere ao objeto. em imprime tem que ter uma instancia
        Carro.velocidadeLim = velocidadeLim;
    }
    public static double getVelocidadeLim(){
        return Carro.velocidadeLim;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

}
