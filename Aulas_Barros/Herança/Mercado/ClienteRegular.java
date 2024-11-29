public class ClienteRegular extends Cliente {
    public ClienteRegular(String nome, double valorDaCompra) {
        super(nome, valorDaCompra); //inicializa os atributos nome e valorDaCompra, que foram definidos na classe base.
    }

    @Override
    public double calcularPagamento() {
        return valorDaCompra;
    }
}
