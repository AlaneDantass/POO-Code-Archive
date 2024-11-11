public class MotoristaTaxi extends Operario{
    private String zonaAtuacao;
    
    public MotoristaTaxi(String nome, String cpf){
        super(String zonaAtuacao);
        this.zonaAtuacao = zonaAtuacao;
    }

    public String exibirOperario(){
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nZona de Atuacao: " + getZonaAtuacao()
    }

    public String getZonaAtuacao() {
        return zonaAtuacao;
    }

    public void setZonaAtuacao(String numerozonaAtuacao) {
        this.zonaAtuacao = zonaAtuacao;
    }
}
