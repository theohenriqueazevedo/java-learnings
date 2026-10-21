package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    static void main(String[] args) {

        Calculadora calculadora01 = new Calculadora();
        int[] numeros = {1,2,0,0,0};

        calculadora01.somaArray(numeros);
        calculadora01.somaVarArgs(1,2,3,4);

    }
}
