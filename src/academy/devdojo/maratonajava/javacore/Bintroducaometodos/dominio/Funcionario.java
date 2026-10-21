package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

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
        System.out.println("Media dos salarios:");
        System.out.println(soma / salarios.length);
    }

}

