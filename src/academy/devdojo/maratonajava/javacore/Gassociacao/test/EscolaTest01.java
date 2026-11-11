package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    static void main(String[] args) {

        Professor professor01 = new Professor("Kleber");
        Professor professor02 = new Professor("joao");
        Professor professor03 = new Professor("dani");
        Professor[] professores = {professor01, professor02, professor03};
        Escola escola01 = new Escola("Unifei", professores);
        escola01.imprime();

    }
}
