public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor("Marina", "74123698");

        //Aluno aluno1 = new Aluno("Gabriela", 1305,"B");
        //Aluno aluno2 = new Aluno("Leticia",2114,"B");


        Disciplina disciplina = new Disciplina("POO", professor);

        Aluno aluno = new Aluno("Gabriela",211005,"BES");

        disciplina.matricularAluno(aluno);
        //disciplina.matricularAluno(aluno);
        //disciplina.matricularAluno(aluno);
        //disciplina.matricularAluno(aluno);
        //disciplina.matricularAluno(aluno);
        //disciplina.matricularAluno(aluno);
        //disciplina.matricularAluno(aluno);
        //disciplina.matricularAluno(aluno);
        //disciplina.matricularAluno(aluno);

        disciplina.matricularAluno(new Aluno("Leticia", 562445,"BES"));
        disciplina.matricularAluno(new Aluno("Laura", 560875,"BES"));


        EscolaPolitecnica politecnica = new EscolaPolitecnica(new Professor("Marina", "74123698"));




        disciplina.imprimirInfo();

        System.out.println("Professor da politécnica: " + politecnica.getProfessor().getNome() + "\n");


        disciplina.substituirProfessor("852963741", "Sheila");


        //System.out.println("Nome do professor na classe Main: " + professor.getNome());

        disciplina.imprimirInfo();

        System.out.println("Professor da politécnica: " + politecnica.getProfessor().getNome());
    }
}