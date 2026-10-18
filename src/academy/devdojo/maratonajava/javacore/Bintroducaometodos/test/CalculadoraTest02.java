package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        //new Calculadora cria um obj da classe Calculadora
        //calculadora é a var de referencia do objeto

        calculadora.multiplicaDoisNumeros(2,3);

        System.out.println("finalizando calctest02");

    }
}
