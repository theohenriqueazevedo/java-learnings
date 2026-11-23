package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

//
//    super.metodo()	Chama a implementação do método na classe pai.
//    super()	        Chama o construtor da classe pai.

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
