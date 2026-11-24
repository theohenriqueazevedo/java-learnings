package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

//
//    super.metodo()	Chama a implementação do metodo na classe pai.
//    super()	        Chama o construtor da classe pai.

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
