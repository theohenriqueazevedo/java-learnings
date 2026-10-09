package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao02 {
    static void main(String[] args) {
        //imprimir todos os pares de 0 ate 1.000.000


//        for (int i = 0; i <= 100000; i = i + 2) {
//            System.out.println(i);
//        }


        for (int i = 0; i <= 100000; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }



    }
}
