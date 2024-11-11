public class ClienteOuroVip extends Cliente{
    private String endereco;
    public ClienteVip( String nome, double valorDaCompra, String endereco){
        super(nome, valorDaCompra);
        this.endereco = endereco;
    }

    public double calcularPagamento(){
        return valorDaCompra - (valorDaCompra*15/100);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}

