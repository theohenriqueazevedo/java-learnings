package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprimeEstudante(Estudante estudante){
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        //Quando o metodo imprimir finaliza, a variável local do parâmetro (`estudante`) deixa de existir[3][10]
    }
}
