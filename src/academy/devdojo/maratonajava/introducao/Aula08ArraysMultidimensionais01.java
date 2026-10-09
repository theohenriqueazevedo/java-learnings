package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {

    static void main(String[] args) {
        //meses
        //dias
        int[][] dias = new int[2][2];


//        for(int[] dia : dias){
//            System.out.println(dia);
//        }
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("----------------");
        for (int[] linha : dias){
            for (int dia : linha){
                System.out.println( dia );
            }
        }
    }

}
