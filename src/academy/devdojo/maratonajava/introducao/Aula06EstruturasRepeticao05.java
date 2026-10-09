package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao05 {
    static void main(String[] args) {
        //dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        //cond valor da parcela >= 1000 ex: 40000 posso parcelar em 40x de 1000
        //quero as opções de parcelas que estao acima de 1000, seja 1x de 40000, 2x de 20000...

        double valorCarro = 30000;


        for (int parcela = (int)valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) continue;
            System.out.println(parcela+" Parcelas de "+ valorParcela);
        }

    }
}
