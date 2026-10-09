package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao04 {
    static void main() {
        //dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        //cond valor da parcela >= 1000 ex: 40000 posso parcelar em 40x de 1000
        //quero as opções de parcelas que estao acima de 1000, seja 1x de 40000, 2x de 20000...

        double valorCarro = 60000;


        for (int i = 1; i < valorCarro; i++) {
            double valorParcela = valorCarro / i;
            if (valorParcela < 1000) break;
            System.out.println(i+" Parcelas de "+ valorParcela);
        }



    }
}
