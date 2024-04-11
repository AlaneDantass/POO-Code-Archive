public class Funcionario extends Pessoa02 {
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){
        setTrabalhando(false);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
