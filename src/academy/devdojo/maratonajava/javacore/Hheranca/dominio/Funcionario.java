package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    // 0 - Bloco de inicialização estático da superclasse é executado quando a JVM carregar a superclasse
    // 1 - Bloco de inicialização estático da classe filha é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaço em memória para o objeto da superclasse
    // 3 - Cada atributo da superclasse é criado e inicializado com valores default ou o que for passado na superclasse
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Construtor da superclasse é executado
    // 6 - Alocado espaço em memória para o objeto da classe filha
    // 7 - Cada atributo da classe filha é criado e inicializado com valores default ou o que for passado na classe filha
    // 8 - Bloco de inicialização da classe filha é executado na ordem em que aparece
    // 9 - Construtor da classe filha é executado

    static {
        System.out.println("Dentro do bloco ini estatico de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco ini nao estatico de Funcionario 2");
    }

//
//    super.metodo()	Chama a implementação do metodo na classe pai.
//    super()	        Chama o construtor da classe pai.

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+ this.nome+ " recebi o salario de: "+this.salario);
        //usar o getNome aqui nao é o ideal
        //protected

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
