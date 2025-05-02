
import java.util.ArrayList;


public class Disciplina {
    private int codDisciplina;
    private String nomeDisciplina;
    private String nomeProfessor;
    ArrayList<Aluno> alunosCadastrados = new ArrayList<>();

    public Disciplina(int codDisciplina, String nomeDisciplina, String nomeProfessor){
        this.codDisciplina = codDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.nomeProfessor = nomeProfessor;
    }
    @Override
    public String toString(){
        return "Código da Disciplina: "+codDisciplina+
            "\nNome da Disciplina: " + nomeDisciplina+
            "\nNome do Professor: " + nomeProfessor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunosCadastrados;
    }

    public String addAlunoDisc(Aluno al){
        alunosCadastrados.add(al);
        return "Estudante "+ al.getNomeEstudante() + " cadastrado na disciplina de "+ getNomeDisciplina() ;
    }

    public int getCodDisciplina(){
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    //adiciona estudante na disciplina
    
}
