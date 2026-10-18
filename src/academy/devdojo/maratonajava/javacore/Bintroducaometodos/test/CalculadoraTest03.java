package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora calculadora3 = new Calculadora();

        double result = calculadora3.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println("----------");
        //nao da pra fazer sout(metodo) pois ele pede um retorno e o metodo é void, entrao basta so chamar
        calculadora3.divideDoisNumeros02(80,2);
        calculadora3.divideDoisNumeros02(80,0);
    }
}
