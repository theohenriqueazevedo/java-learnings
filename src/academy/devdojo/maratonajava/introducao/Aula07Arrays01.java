package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    static void main(String[] args) {

        //guardar 3 nomes de pessoas
//        int idade1 = 18;
//        int idade2 = 19;
//        int idade3 = 20;
        //feio

        int [] idades = new int[3];
        //parte a esquerda tipo reference parte a direita tipo objeto
        //tipo reference
        //byte, short, int, long, loat, double inicializa com 0
        //char inicializa com /u00
        idades[0] = 21;
        idades[1] = 21;
        idades[2] = 21;

        System.out.println(idades[1]);
        System.out.println(idades[3]);
        System.out.println(idades[2]);

    }
}
