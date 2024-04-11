public class Aluno extends Pessoa02{
    private int mat;
    private String curso;

    public void cancelarMat(){
        System.out.println("Matrícula cancelada...");
    }

    public int getMat(){
        return mat;
    }

    public void setMat(int mat){
        this.mat = mat;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){

    }
}
