public class Aluno extends Pessoa02{
    private int matricula;
    private String curso;

    public void cancelarMat(){
        System.out.println("Matrícula cancelada...");
    }
    public void pagarMensalidade(){
        System.out.println( getNome()+" é bolsista. Pagamento facilitado!");
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int mat){
        this.matricula = mat;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){

    }
}
