package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setCep("35");
        endereco.setRua("Rua");

        Pessoa pessoa01 = new Pessoa();

        pessoa01.setCpf("123");
        pessoa01.setNome("Joao");
        pessoa01.setEndereco(endereco);

        pessoa01.imprime();

        Funcionario funcionario01 = new Funcionario();
        funcionario01.setCpf("456");
        funcionario01.setNome("Maria");
        funcionario01.setEndereco(endereco);
        funcionario01.setSalario(1200);

        funcionario01.imprime();

    }
}
