public class Aluno extends Pessoa{
    private String curso;

    public Aluno(String nome, int idade, String curso){
        super(nome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String informacoes(){
        return "Nome: "+ getNome() + "\nIdade: " + getIdade() +"\nCurso: " + getCurso();
    }

    public void Funcao(){
        System.err.println("Estudar");
    }
}
