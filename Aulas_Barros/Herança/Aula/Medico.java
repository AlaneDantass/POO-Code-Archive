public class Medico{
    private String nome;
    private String CRM;
    private String email;

    public Medico(String nome, String CRM, String email){
        this.nome = nome;
        this.CRM = CRM;
        this.email = email;
    }

    public String atenderPaciente(){
        System.out.println("Atendendo paciente geral...");
        return "Paciente atendido pelo Clínico geral";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String cRM) {
        CRM = cRM;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}