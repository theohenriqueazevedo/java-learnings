package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

import java.util.Scanner;

public class GerenciaSeminariosTest01 {
    static void main(String[] args) {

        int escolha = 0;
        String endereco;
        String nome;
        String especialidade;
        Scanner entrada = new Scanner(System.in);
        int idade;


        System.out.println("Bem vindo ao sistema que gerencia seminarios");
        System.out.println("Escolha o que deseja cadastrar:");


        escolha = 1;
        while (escolha !=0) {
            System.out.println("1 - local");
            System.out.println("2 - profesor");
            System.out.println("3 - estudante");
            System.out.println("4 - seminario");
            System.out.println("0 - sair");

            escolha = entrada.nextInt();
            entrada.nextLine(); // Consome a quebra de linha

            if (escolha == 1) {
                System.out.println("Digite o endereço do local");
                endereco = entrada.nextLine();
                if (endereco != null){
                    System.out.println("Local salvo com sucesso!");
                    Local local = new Local(endereco);
                }

            } else if (escolha == 2) {
                System.out.println("Digite o nome do professor:");
                nome = entrada.nextLine();
                System.out.println("Digite a especialidade do professor:");
                especialidade = entrada.nextLine();
                if (nome == null || especialidade == null){
                    Professor professor = new Professor(nome, especialidade);
                    System.out.println("Professor salvo com sucesso!");
                }
            } else if (escolha == 3) {
                System.out.println("Digite o nome do aluno:");
                nome = entrada.nextLine();
                System.out.println("Digite a idade do aluno:");
                idade = entrada.nextInt();
                if (!nome.isEmpty() && idade > 0){
                    Estudante estudante =  new Estudante(nome, idade);
                    System.out.println("Aluno salvo com sucesso!");
                }
            } else if(escolha == 4) {

            }
        }
    }
}
