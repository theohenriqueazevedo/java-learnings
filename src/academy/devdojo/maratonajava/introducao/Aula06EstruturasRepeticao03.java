package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao03 {
    static void main(String[] args) {

        //dado um num de 0 a 50, imprimir primeiros 25

//        int num = 50;
//
//        for (int i = 0; i < 25; i++) {
//            System.out.println(num);
//            num++;
//        }

        int valorMax = 50;
        for (int i = 0; i < valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);

        }

    }
}
