package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    static void main(String[] args) {

        double salario = 600;
        String mensagemDoar ="Eu vou doar 500 reais para o devdojo";
        String mensagemNaoDoar ="Eu nao vou doar 500 reais para o devdojo, mas um dia vou ter condições!";
        String resultado;

        if (salario > 500){
            resultado = mensagemDoar;
        }
        else resultado = mensagemNaoDoar;

        System.out.println(resultado);

        //operador ternario
        //sintaxe (condicao) ? verdadeiro : falso

        String resultado2 = salario > 500 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado2);

        //ou

        System.out.println(salario > 500 ? mensagemDoar : mensagemNaoDoar);



    }
}
