package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {

    static void main() {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Messi");
        Jogador jogador03 = new Jogador("Cristiano");

        Jogador[] jogadores = {jogador01, jogador02, jogador03};
        for (Jogador jogador: jogadores){
            jogador.imprime();
        }
    }

}
