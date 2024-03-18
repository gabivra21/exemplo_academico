public class Disciplina {
       private String nome;

    private Professor professor;
    //private Aluno aluno1;
    //private Aluno aluno2;
    private Aluno[] alunos = new Aluno[10];

    private int tamanhoAtual = 0;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        //this.aluno1 = aluno1;

    }

    public Disciplina(String nome, String nomeProf, String codRh) {
        this.nome = nome;
        this.professor = new Professor(nomeProf, codRh);
        //this.aluno1 = new Aluno(nomeA,0000,turma);
        alunos = new Aluno[10];
    }

    public void matricularAluno(Aluno aluno) {

        if (tamanhoAtual == 10) {
            System.out.println("Cadastro não concluído");
            System.out.println("TURMA CHEIA!!!");
            return;
        }

        alunos[tamanhoAtual] = aluno;
        tamanhoAtual++;
        //System.out.println(aluno.getNomeA() + " cadastrado com sucesso!");
    }


    public void imprimirInfo() {
        System.out.print("\n--------INFO DISCIPLINA--------\n");
        System.out.print("Disciplina: " + this.nome + "\nProfessor: " + this.professor.getNome() + "\n");
        System.out.print("-------------------------------\n\n");
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + alunos[i].getNomeA());
        }
        System.out.print("-------------------------------\n\n");
    }

    public void substituirProfessor(String codRh, String nome) {
//        this.professor.setCodRh(codRh);
//        this.professor.setNome(nome);
        this.professor = new Professor(nome, codRh);
    }
    public Professor getProfessor() {
        return professor;
    }
}

