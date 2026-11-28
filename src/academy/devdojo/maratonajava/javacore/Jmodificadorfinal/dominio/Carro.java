package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {

    private static String nome;
    public static final double VELOCIDADE_LIMITE = 200;


    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Carro.nome = nome;
    }
}
