package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main() {
        // int double, float, char, byte, short, long, boolean

        int age = 10;
        int idadeCasting = (int) 10000000000L;

        long bigNumber = 10000;
        double salaryDouble = 2000;
        float salaryFloat = 2500;
        byte ageByte = 10;
        short ageShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        char caractere2 = 65;

        var nome2 = "Theo";

        String nome = "Theo";

        System.out.println("a idade é " + age + " anos");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println(caractere2);
        System.out.println(salaryFloat);
        System.out.println(idadeCasting);

        System.out.println(nome);

        System.out.println("teste versionamento de codigo");

    }
}