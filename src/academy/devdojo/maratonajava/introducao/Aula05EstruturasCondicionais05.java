package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {

    static void main(String[] args) {
        //imprima o dia da semana, considerando 1 como domingo, 2 como segunda...

        byte dia = 5;

//        if (dia == 1){
//            System.out.println("Domingo");
//        } else if (dia == 2) {
//            System.out.println("Segunda");
//        }

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("seg");
                break;
            case 3:
                System.out.println("ter");
                break;
            case 4:
                System.out.println("qua");
                break;
            case 5:
                System.out.println("qui");
                break;
            default:
                System.out.println("Op invalida");
        }


    }

}
