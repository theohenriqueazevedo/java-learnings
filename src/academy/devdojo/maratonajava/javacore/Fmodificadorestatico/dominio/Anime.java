package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicialização estático é executado quando a JVM inicializa a classe.
    // 1 - Espaço em memória é alocado para o objeto.
    // 2 - Cada atributo de instância é criado e inicializado com valores default.
    // 3 - Atributos de instância são inicializados (incluindo inicializadores de declaração).
    // 4 - Blocos de inicialização de instância são executados.
    // 5 - Construtor é executado.

    static {
        //.nome nao é possivel pois nem esta na memoria ainda
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i=0; i< episodios.length; i++){
            episodios[i] = i +1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao 2");
    }
    {
        System.out.println("Bloco de inici nao estatico");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int ep:episodios){
//            System.out.print(ep+" ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
