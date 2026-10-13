package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {

    static void main(String[] args) {

        Estudante estudante = new Estudante();
        //new estudante é o objeto, entidade real criada na memoria, é ele quem guarda nome,idade e sexo
        //variavel estudante é a caixinha que esta guardada na pilha, guarda o endereço que indica onde o obj esta

        //colocar valores

        estudante.nome = "Joao";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante); //saida é um endereço
        System.out.println("----------");
        System.out.println(estudante.nome + " "+ estudante.idade + " "+ estudante.sexo);

    }

}
