package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioEx {
    static void main(String[] args) {
        //crie uma classe Fucionario com os atributos: nome, idade, salario(tres valores devem ser guardados
        // crie dois metodos: para imprimir os dados e para tirar a media dos salarios e imprimir o res

        Funcionario funcionario01 = new Funcionario();

//        funcionario01.nome = "Joao";
        funcionario01.setNome("Joao");
//        funcionario01.idade = 20;
        funcionario01.setIdade(20);
//        funcionario01.salarios = new double[]{1344, 1222, 1500};
        funcionario01.setSalarios(new double[]{1000, 1200, 1000});
        funcionario01.imprimeDadosFunc(funcionario01);

    }
}
