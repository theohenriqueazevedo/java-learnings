package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    static void main(String[] args) {
        String[] nomes = new String[3];
        //tipo String inicializa com null
        //tipo boolean inicializa com false
        nomes[0] = "Maria";
        nomes[1] = "Theo";
        nomes[2] = "Joao";


        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        //modo Enhanced:
        for(String nome : nomes){
            System.out.println(nome);
        }

//        System.out.println(nomes[0]);
//        System.out.println(nomes[1]);
//        System.out.println(nomes[2]);
    }
}
