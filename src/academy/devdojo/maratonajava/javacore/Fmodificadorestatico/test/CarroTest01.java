package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {

    static void main(String[] args) {
        Carro carro01 = new Carro("Porshe", 300);
        Carro carro02 = new Carro("BMW", 280);
        Carro carro03 = new Carro("Meca", 300);

        Carro.velocidadeLim = 100;

        carro01.imprime();
        carro02.imprime();
        carro03.imprime();

    }
}
