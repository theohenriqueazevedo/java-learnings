package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    static void main() {
//
//    Crie variaveis para os campos abaixo entre <> e imprima a seguinte mensagem:
//    Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salari de <salario> na data <data>

    String nome = "Theo";

    String endereco = "Rua Doutor Pereira cabral - 55";

    float salario = 1200;

    String data = "31/08/2026";

    String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salario de " +salario+" na data " + data;

    //System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salario de " +salario+" na data " + data);

        System.out.println(relatorio);
    }
}