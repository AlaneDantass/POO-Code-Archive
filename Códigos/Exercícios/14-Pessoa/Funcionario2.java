public class Funcionario2 extends Pessoa02 {
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){
        setTrabalhando(false);
        System.out.println(getNome()+" não está trabalhando mais.");
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
