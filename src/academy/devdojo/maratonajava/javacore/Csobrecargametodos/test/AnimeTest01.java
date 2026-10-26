package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime01 = new Anime();

//        anime01.setEpisodios(200);
//        anime01.setNome("Akudama Drive");
//        anime01.setTipo("TV");

        anime01.init("Akudama Drive", "TV", 200, "Ação");
        anime01.imprime();



    }
}
