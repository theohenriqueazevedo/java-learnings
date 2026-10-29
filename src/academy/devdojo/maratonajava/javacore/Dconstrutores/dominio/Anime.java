package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String studio;

    //construtor: permite colocar "regras" para se inicializar uma classe
    public Anime(String nome, String tipo, int episodios, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
        System.out.println("Atributos tirando studio incluidos");
    }
    public Anime(String nome, String tipo, int episodios, String genero, String studio){
        this(nome, tipo, episodios, genero);
        this.studio = studio;
        System.out.println("atributo stduio incluido");
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }




    public void imprime(){
        System.out.println(this.nome);
        System.out.println(episodios);
        System.out.println(tipo);
        System.out.println(studio);
        System.out.println(genero);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
