package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    static void main() {
        int numero1 = 10;
        int numero2 = 20;

        int resultado = numero2-numero1;
        int resultado2 = numero2*numero1;
        int resultado3 = numero2/numero1;
        //na divisao int / int da int logo res seria 0, para mudar isso deve mudar para double as var n1 e n2

//        System.out.println(resultado);
//        System.out.println(resultado2);
//        System.out.println(resultado3);




        boolean isDezMaiorVinte = 10 < 20;
        boolean isDezMenorVinte = 10 > 20;
        boolean isDezIgualVinte = 10 == 20;

        System.out.println("isDezMaiorVinte "+ isDezMaiorVinte);
        System.out.println("isDezMenorVinte "+ isDezMenorVinte);
        System.out.println("isDezIgualVinte "+ isDezIgualVinte);

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 4612;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel"+isPlaystationCincoCompravel);


        //operadores de atribuição

        double bonus = 1800;
        bonus += 800;
        bonus*=2;
        System.out.println(bonus);

        int contador = 0;
        contador ++;
        ++contador;
        //diferente, executa depois incrementa ou incrementa e depois executa

        
    }
}
