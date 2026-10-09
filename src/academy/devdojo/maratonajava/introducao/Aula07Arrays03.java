package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    static void main(String[] args) {
        int[] numeros = new int[3];

        int[] numeros2 = {1, 2, 4, 5};
        int[] numeros3 = new int[]{1, 2, 4, 5};

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        for (int numero : numeros3) {
            System.out.println(numero);
            // é como se numero = numeros3[0], numero = numeros3[1]...
        }


    }
}
