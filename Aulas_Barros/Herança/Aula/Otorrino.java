public class Otorrino extends Medico{
    public Otorrino(String nome, String CRM, String email){
        super(nome, CRM, email);
    }

    public String atenderPaciente(){
        System.out.println("Atendendo paciente com o otorrino...");
        return "Paciente atendido pelo otorrino";
    }
}
