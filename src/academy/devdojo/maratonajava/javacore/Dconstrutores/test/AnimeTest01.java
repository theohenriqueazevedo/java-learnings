package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime01 = new Anime("Akudama Drive", "TV", 200, "Ação");
        anime01.imprime();
        Anime anime02 = new Anime();
        System.out.println("=========");
        anime02.imprime();



    }
}
