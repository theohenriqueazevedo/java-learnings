package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 categoria juvenil
        //idade >= 18 categoria adulto

        int idade = 18;
        String categoria;
        if (idade >= 18){
            categoria = "adulto";
        } else if (idade >= 15) {
            categoria = "juvenil";
        }else{
            categoria = "infantil";
        }
        System.out.println(categoria);




    }
}
