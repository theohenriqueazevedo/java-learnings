package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    static void main(String[] args) {


        if(true){
            System.out.println("Dentro do if");
        }
        System.out.println("fora");

        int idade = 17;
        boolean isAutorizado = idade >= 18;

        if(isAutorizado){
            System.out.println("Pode beber");
        }

        if(!isAutorizado){
            System.out.println("Nao pode beber");
        }
        if(isAutorizado){
            System.out.println("Pode beber");
        }
        else{
            System.out.println("Nao pode");
        }








    }
}
