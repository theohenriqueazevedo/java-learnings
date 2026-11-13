package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");

        Time time1 = new Time("Seleção Br");

        Jogador[] jogadores = {jogador01};

        jogador01.setTime(time1);
        time1.setJogadores(jogadores);
        time1.imprime();
    }
}
