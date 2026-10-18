package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    static void main() {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        //ambos estudante0 guardam o endereco de memoria do objeto Estudante
        ImpressoraEstudante imprimeEstudante = new ImpressoraEstudante();

        estudante01.nome = "Joao";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

//        System.out.println(estudante01.nome);
//        System.out.println(estudante01.idade);
//        System.out.println(estudante01.sexo);
//        System.out.println("===========");
//        System.out.println(estudante02.nome);
//        System.out.println(estudante02.idade);
//        System.out.println(estudante02.sexo);

        imprimeEstudante.imprimeEstudante(estudante01);
        imprimeEstudante.imprimeEstudante(estudante02);
        //quando chamar esse meotodo, o metodo recebera uma copia do endereco de memoria estudante0
        //Durante a execução de `imprimir`, tanto a variável `estudante01` quanto a variável parâmetro `estudante` apontam para **o mesmo objeto na memória




    }
}
