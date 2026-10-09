package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    static void main(String[] args) {

        int [][] arrayInt = new int[3][];
//        int [][] arrayInt2 = new int[][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1,2,3};
        arrayInt[2] = new int[6];

        int[][] arrayInt2 ={{0}, {1,1}, {2,2,2}};

        for (int[] arrayBase : arrayInt){
            for (int elemento : arrayBase){
                System.out.println( elemento );
            }
            System.out.println("--------");
        }

        System.out.println("segundo array");
        for (int[] arrayBase : arrayInt2){
            for (int elemento : arrayBase){
                System.out.println( elemento );
            }
            System.out.println("--------");
        }


    }
}
