public class Dermato extends Medico {
    public Dermato(String nome, String CRM, String email){
        super(nome, CRM, email);
    }

    public String atenderPaciente(){
        System.out.println("Atendendo paciente com o dermato...");
        return "Paciente atendido pelo dermato";
    }
}