package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {

    static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "gol biturbo";
        carro1.modelo = "1.6";
        carro1.ano = 2021;

        carro2.nome = "saveiro media";
        carro2.modelo = "sport";
        carro2.ano = 2026;

        System.out.println("primeiro carro e o mais fera: "+ carro1.nome +" "+ carro1.modelo + " " +carro1. ano);
        System.out.println("primeiro carro e o mais medio: "+ carro2.nome + " "+carro2.modelo +" "+ carro2. ano);

        System.out.println("============");
        carro1 = carro2;
        //agora carro1 faz referencia para o mesmo objeto que o carro2, agora ja era a referencia de carro1, antes da linha ate daria

        System.out.println("primeiro carro e o mais fera: "+ carro1.nome +" "+ carro1.modelo + " " +carro1. ano);
        System.out.println("primeiro carro e o mais medio: "+ carro2.nome + " "+carro2.modelo +" "+ carro2. ano);

    }

}
