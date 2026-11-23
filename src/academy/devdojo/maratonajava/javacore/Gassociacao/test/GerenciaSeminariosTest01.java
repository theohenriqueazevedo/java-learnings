
package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

import java.util.Scanner;

public class GerenciaSeminariosTest01 {
    static void main(String[] args) {

        //armazenar dados em vetores para consultas posteriores. Dentro dos if sao apenas variaveis locais

        Professor[] professores = new Professor[10];
        Local[] locais = new Local[10];
        Estudante[] estudantes = new Estudante[10];
        Seminario[] seminarios = new Seminario[10];
        Estudante[] estudantesSeminario = new Estudante[10];

        int contadorProfessor = 0;
        int contadorLocal = 0;
        int contadorEstudante = 0;
        int contadorSeminario = 0;

        int escolha = 0;
        String endereco;
        String nome;
        String especialidade;
        Scanner entrada = new Scanner(System.in);
        int idade;
        String titulo;


        System.out.println("\n==============================================");
        System.out.println("       BEM-VINDO AO SISTEMA DE GESTÃO");
        System.out.println("              DE SEMINÁRIOS");
        System.out.println("==============================================");

        escolha = 1;
        while (escolha != 0) {

            System.out.println("\n");
            System.out.println("----------------------------------------------");
            System.out.println("                 MENU PRINCIPAL");
            System.out.println("----------------------------------------------");
            System.out.println("  [1] - Cadastrar Local");
            System.out.println("  [2] - Cadastrar Professor");
            System.out.println("  [3] - Cadastrar Estudante");
            System.out.println("  [4] - Cadastrar Seminário");
            System.out.println("  [0] - Sair");
            System.out.println("----------------------------------------------");
            System.out.print("  Escolha uma opção: ");

            escolha = entrada.nextInt();
            entrada.nextLine(); // Consome a quebra de linha

            if (escolha == 1) {

                System.out.println("\n==============================================");
                System.out.println("                CADASTRO DE LOCAL");
                System.out.println("==============================================");

                System.out.print("\nDigite o endereço do local: ");
                endereco = entrada.nextLine();

                if (endereco != null) {
                    System.out.println("\n[SUCESSO] Local salvo com sucesso!");
                    System.out.println("Endereço: " + endereco);

                    Local local = new Local(endereco);
                    locais[contadorLocal] = local;
                    contadorLocal++;
                }

            } else if (escolha == 2) {

                System.out.println("\n==============================================");
                System.out.println("              CADASTRO DE PROFESSOR");
                System.out.println("==============================================");

                System.out.print("\nDigite o nome do professor: ");
                nome = entrada.nextLine();

                System.out.print("Digite a especialidade do professor: ");
                especialidade = entrada.nextLine();

                if (!nome.isEmpty() && !especialidade.isEmpty()) {
                    Professor professor = new Professor(nome, especialidade);
                    professores[contadorProfessor] = professor;
                    contadorProfessor++;

                    System.out.println("\n[SUCESSO] Professor salvo com sucesso!");
                    System.out.println("Nome: " + nome);
                    System.out.println("Especialidade: " + especialidade);
                }

            } else if (escolha == 3) {

                System.out.println("\n==============================================");
                System.out.println("              CADASTRO DE ESTUDANTE");
                System.out.println("==============================================");

                System.out.print("\nDigite o nome do aluno: ");
                nome = entrada.nextLine();

                System.out.print("Digite a idade do aluno: ");
                idade = entrada.nextInt();

                if (!nome.isEmpty() && idade != 0) {
                    Estudante estudante = new Estudante(nome, idade);
                    estudantes[contadorEstudante] = estudante;
                    contadorEstudante++;

                    System.out.println("\n[SUCESSO] Aluno salvo com sucesso!");
                    System.out.println("Nome: " + nome);
                    System.out.println("Idade: " + idade);
                }

            } else if (escolha == 4) {

                System.out.println("\n==============================================");
                System.out.println("              CADASTRO DE SEMINÁRIO");
                System.out.println("==============================================");

                System.out.print("\nDigite o título do seminário: ");
                titulo = entrada.nextLine();

                Seminario seminario = new Seminario(titulo);

                System.out.println("\n----------------------------------------------");
                System.out.println("             SELEÇÃO DE PROFESSOR");
                System.out.println("----------------------------------------------");

                System.out.println("\nProfessores disponíveis:");

                for (int i = 0; i < contadorProfessor; i++) {
                    System.out.println("  [" + i + "] - " + professores[i].getNome());
                }

                System.out.print("\nEscolha o número do professor desejado: ");
                int indiceProfessorEscolhido = entrada.nextInt();
                entrada.nextLine();

                seminario.setProfessor(professores[indiceProfessorEscolhido]);

                System.out.println("\n[OK] Professor selecionado: "
                        + professores[indiceProfessorEscolhido].getNome());

                System.out.println("\n----------------------------------------------");
                System.out.println("                SELEÇÃO DE LOCAL");
                System.out.println("----------------------------------------------");

                System.out.println("\nLocais disponíveis:");

                for (int i = 0; i < contadorLocal; i++) {
                    System.out.println("  [" + i + "] - " + locais[i].getEndereco());
                }

                System.out.print("\nEscolha o número do local desejado: ");
                int indiceLocal = entrada.nextInt();
                entrada.nextLine();

                seminario.setLocal(locais[indiceLocal]);

                System.out.println("\n[OK] Local selecionado: "
                        + locais[indiceLocal].getEndereco());

                System.out.println("\n----------------------------------------------");
                System.out.println("             SELEÇÃO DE ESTUDANTES");
                System.out.println("----------------------------------------------");

                System.out.print("\nQuantos estudantes participarão? ");
                int quantidade = entrada.nextInt();
                entrada.nextLine();

                for (int i = 0; i < quantidade; i++) {

                    System.out.println("\nEstudantes disponíveis:");

                    for (int j = 0; j < contadorEstudante; j++) {
                        System.out.println("  [" + j + "] - " + estudantes[j].getNome());
                    }

                    System.out.print("\nEscolha o número do estudante " + (i + 1) + ": ");
                    int indiceEstudante = entrada.nextInt();
                    entrada.nextLine();

                    estudantesSeminario[i] = estudantes[indiceEstudante];

                    System.out.println("[OK] Estudante selecionado: "
                            + estudantes[indiceEstudante].getNome());
                }

                seminario.setEstudante(estudantesSeminario);

                //Armazenar o seminário
                seminarios[contadorSeminario] = seminario;
                contadorSeminario++;

                System.out.println("\n==============================================");
                System.out.println("       SEMINÁRIO CADASTRADO COM SUCESSO!");
                System.out.println("==============================================");
                System.out.println("Título: " + titulo);
                System.out.println("Professor: " + professores[indiceProfessorEscolhido].getNome());
                System.out.println("Local: " + locais[indiceLocal].getEndereco());
                System.out.println("Quantidade de estudantes: " + quantidade);
                System.out.println("----------------------------------------------");

            }
        }

        System.out.println("\n==============================================");
        System.out.println("          SISTEMA ENCERRADO");
        System.out.println("       Obrigado por utilizar!");
        System.out.println("==============================================");

    }
}
