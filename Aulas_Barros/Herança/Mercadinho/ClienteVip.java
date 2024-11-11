public class ClienteVip extends Cliente{
    private String numeroCartao;
    public ClienteVip( String nome, double valorDaCompra, String numeroCartao){
        super(nome, valorDaCompra);
        this.numeroCartao = numeroCartao;
    }
    public double calcularPagamento(){
        return valorDaCompra - (valorDaCompra*10/100);
    }
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
