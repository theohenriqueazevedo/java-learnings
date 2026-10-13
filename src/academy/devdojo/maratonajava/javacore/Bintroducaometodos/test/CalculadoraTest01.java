package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        //new Calculadora cria um obj da classe Calculadora
        calculadora.somaDoisNumeros();
        System.out.println("finalizando calctest01");
        calculadora.subtraiDoisNumeros();

    }
}
