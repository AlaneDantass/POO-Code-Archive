public class ClienteOuroVip extends Cliente {
    private String endereco;
    private String numeroCartao;

    public ClienteOuroVip(String nome, double valorDaCompra, String numeroCartao, String endereco) {
        super(nome, valorDaCompra);
        this.numeroCartao = numeroCartao;
        this.endereco = endereco;
    }

    @Override
    public double calcularPagamento() {
        return valorDaCompra - (valorDaCompra * 15 / 100);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
