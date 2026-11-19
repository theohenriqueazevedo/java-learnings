package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");

        System.out.println("Digite sua pergunta e eu responderei sim ou nao");

        String pergunta = entrada.nextLine();

        if (pergunta.charAt(0) == ' '){
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

    }
}
