package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimeDadosFunc(Funcionario funcionario){
        System.out.println("=========");
        System.out.println("Dados do Funcionario");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);

        System.out.println("Salarios:");
        for (double salarioAtual : salarios)
            System.out.println(salarioAtual);
        tirarMedia(funcionario);
    }

    public void tirarMedia(Funcionario funcionario){

        double soma = 0;
        for (double salario : salarios){
            soma += salario;
        }
        media = soma / salarios.length;
        System.out.println("Media dos salarios:");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}

