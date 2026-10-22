package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {

    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(idade);
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome){
//        nome = nome;
        //essa linha nao faz sentido pq vc esta refereciando a varaivel nome(que recebeu na chamda do metodo) para ela mesma, vc tem que referenciar o atributo privado, logo, this.nome, que é o atributo "nome" do objeto atual.
        this.nome = nome;
    }
}
