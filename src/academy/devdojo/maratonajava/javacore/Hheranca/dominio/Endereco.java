package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Endereco {
    private String rua;
    private String cep;
    
    public void imprime(){
//        Pessoa p = new Pessoa();
//        p.setNome("joao");
//        System.out.println(p.nome);
        //isso quebra o encapsulamento
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
