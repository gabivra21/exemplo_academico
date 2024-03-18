public class Professor {

    private String codRh;
    private String nome;


    public Professor(String nome, String codRh) {
        this.nome = nome;
        this.codRh = codRh;
    }


    public String getCodRh() {
        return codRh;
    }

    public void setCodRh(String codRh) {
        this.codRh = codRh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
