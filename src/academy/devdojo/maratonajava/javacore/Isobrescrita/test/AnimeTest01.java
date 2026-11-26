package academy.devdojo.maratonajava.javacore.Isobrescrita.test;

import academy.devdojo.maratonajava.javacore.Isobrescrita.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime1 = new Anime("One Piece");
        //anime é um object, entao herda metodos como .clone, .toString, .hashCode

        System.out.println(anime1);
        //Anime@8efb846 pois
        // metodo .toString da classe Object(getClass().getName() + '@' + Integer.toHexString(hashCode()))
    }
}
