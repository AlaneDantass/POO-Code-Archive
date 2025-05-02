public class Aluno {
    private String nomeEstudante;
    private String curso;
    private int serie;
    private String email;

    public Aluno( String nomeEstudante, String curso, int serie, String email){
        this.nomeEstudante = nomeEstudante;
        this.curso = curso;
        this.serie = serie;
        this.email = email;
    }

    @Override
    public String toString(){
        return "Nome do Aluno:"+ nomeEstudante + 
                "\nCurso: " +curso+ 
                "\nSerie: " + serie+ 
                "\nEmail: "+email;
    }

    public String getNomeEstudante(){
        return nomeEstudante;
    }

    public void setNomeEstudante(String nomeEstudante){
        this.nomeEstudante= nomeEstudante;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }


}
