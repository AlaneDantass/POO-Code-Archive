public class MotoristaOnibus extends Operario{
    private String numeroHabilitacao;
    
    public MotoristaOnibus(String nome, String cpf, String numeroHabilitacao){
        super(String numeroHabilitacao);
        this.numeroHabilitacao = numeroHabilitacao;
    }

    public String exibirOperario(){
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nNumero de Habilitação: " + getNumeroHabilitacao()
    }

    public String getNumeroHabilitacao() {
        return numeroHabilitacao;
    }

    public void setNumeroHabilitacao(String numeroHabilitacao) {
        this.numeroHabilitacao = numeroHabilitacao;
    }


}

