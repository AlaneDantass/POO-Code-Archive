public class Aluno {
    private String nomeEstudante;
    private String curso;
    private int serie;
    private String email;
    private int matricula;

    public Aluno( String nomeEstudante,int matricula, String curso, int serie, String email){
        this.nomeEstudante = nomeEstudante;
        this.curso = curso;
        this.serie = serie;
        this.email = email;
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        return "Nome do Aluno:"+ nomeEstudante +
                "/Matrícula: "+matricula+ 
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }


}