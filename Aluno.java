public class Aluno {
    private String nomeA;
    private int codMatricula;
    private String turma;

    public Aluno(String nomeA,int codMatricula, String turma){
        this.nomeA = nomeA;
        this.codMatricula = codMatricula;
        this.turma = turma;
    }

    public String getNomeA(){
        return nomeA;
    }


}
