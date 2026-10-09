package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    static void main() {
        // dado os valores de 1 a 7, imprima se é dia util ou final de semana
        //considerando 1 como domingo


        byte dia = 1;

        if (dia == 1 || dia == 7){
            System.out.println("Final de semana FDS!!");
        }else System.out.println("Dia de semana :( ");


    }
}
