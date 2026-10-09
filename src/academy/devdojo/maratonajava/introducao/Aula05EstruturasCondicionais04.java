package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    static void main(String[] args) {
        //ver o quanto de texa preciso pagar de acordo com o meu salario anual

//        double salarioAnual = 34713;
//
//        if (salarioAnual <= 37712){
//            System.out.println("Pague 9.7%");
//        } else if (salarioAnual <= 68507) {
//            System.out.println("Pague 37.37%");
//        }
//        else System.out.println("Pague 49.5%");

        double salarioAnual2 = 45000;

        double primeiraFaixa = 9.7 / 100;
        double segundaFaixa = 37.37 / 100;
        double terceiraFaixa = 49.5 / 100;

        if (salarioAnual2 <= 37712){
            salarioAnual2 = salarioAnual2 * primeiraFaixa;
        } else if (salarioAnual2 <= 68507) {
            salarioAnual2 = salarioAnual2 * segundaFaixa;
        }
        else salarioAnual2 = salarioAnual2 * terceiraFaixa;

        System.out.println("Voce deve pagar "+salarioAnual2+ " de imposto");



        

    }
}
