package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 12;
        int num2 = 13;

        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("-------------");
        System.out.println("dentro de CalculadoraTest04");
        System.out.println(num1);
        System.out.println(num2);

        //conclusao: quando vc passa para um metodo variaveis do tipo prmitivo, ele faz cópias do valor dela, nao altera a variavel em si, voce nao passa a referencia dela na memoria
    }
}
