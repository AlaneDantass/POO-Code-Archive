public class ClienteRegular extends Cliente{
    public ClienteRegular(String nome, double valorDaCompra){
        super(nome, valorDaCompra);
    }

    public double calcularPagamento(){
        return valorDaCompra;
    }
}
