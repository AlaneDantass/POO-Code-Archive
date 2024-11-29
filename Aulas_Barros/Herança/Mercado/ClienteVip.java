public class ClienteVip extends Cliente {
    private String numeroCartao;

    public ClienteVip(String nome, double valorDaCompra, String numeroCartao) {
        super(nome, valorDaCompra); //chama o construtor de Cliente
        this.numeroCartao = numeroCartao;
    }

    @Override
    public double calcularPagamento() {
        return valorDaCompra - (valorDaCompra * 10 / 100);
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
