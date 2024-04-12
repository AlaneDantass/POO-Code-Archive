public class Tecnico extends Aluno{
    private int registroProficional;
    
    public void praticar(){
        System.out.println("O técnico está realizando a manutenção do equipamento.");
        System.out.println("Registro Profissional: " + getRegistroProficional());
    }

    public int getRegistroProficional() {
        return registroProficional;
    }

    public void setRegistroProficional(int registroProficional) {
        this.registroProficional = registroProficional;
    }

}
