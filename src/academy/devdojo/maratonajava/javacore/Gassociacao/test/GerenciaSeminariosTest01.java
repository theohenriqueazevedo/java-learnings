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
        Estudante[] estudantes =  new Estudante[10];
        Seminario[] seminarios = new Seminario[10];

        int contadorProfessor = 0;
        int contadorLocal = 0;
        int contadorEstudante = 0;

        int escolha = 0;
        String endereco;
        String nome;
        String especialidade;
        Scanner entrada = new Scanner(System.in);
        int idade;
        String titulo;


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
                    locais[contadorLocal] = local;
                    contadorLocal++;
                }

            } else if (escolha == 2) {

                System.out.println("Digite o nome do professor:");
                nome = entrada.nextLine();

                System.out.println("Digite a especialidade do professor:");
                especialidade = entrada.nextLine();

                if (!nome.isEmpty() && !especialidade.isEmpty()){
                    Professor professor = new Professor(nome, especialidade);
                    professores[contadorProfessor] = professor;
                    contadorProfessor++;
                    System.out.println("Professor salvo com sucesso!");
                }
            } else if (escolha == 3) {
                System.out.println("Digite o nome do aluno:");
                nome = entrada.nextLine();
                System.out.println("Digite a idade do aluno:");
                idade = entrada.nextInt();
                if (!nome.isEmpty() && idade > 0){
                    Estudante estudante =  new Estudante(nome, idade);
                    estudantes[contadorEstudante] = estudante;
                    contadorEstudante++;
                    System.out.println("Aluno salvo com sucesso!");
                }
            } else if(escolha == 4) {
                System.out.println("Digite o titulo do seminário:");
                titulo = entrada.nextLine();
                Seminario seminario = new Seminario(titulo);
                System.out.println("Escolha o Professor que deseja cadastrar:");
                for (int i = 0; i < contadorProfessor; i++) {
                    System.out.println(i + " - " + professores[i].getNome());
                }
                int indiceProfessorEscolhido = entrada.nextInt();
                entrada.nextLine();
                seminario.setProfessor(professores[indiceProfessorEscolhido]);


            }
        }
    }
}
