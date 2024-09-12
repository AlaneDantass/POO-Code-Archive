package Isolados.Concessionaria;

public class Veiculo {
    private String modelo;
    private String marca;
    private double preco;
    private int qtd_Estoque;

    public Veiculo(String modelo,String marca, double preco, int qtd_Estoque){
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.qtd_Estoque = qtd_Estoque;
    }


    public String getInfoVeiculo(){
        return "Modelo: "+modelo+"\nMarca: "+marca+"\nPreco: "+preco+"\nQuantidade em estoque: "+qtd_Estoque;
    }

    public double calcularValorTotalEstoque(){
        double totV = preco * qtd_Estoque;
        System.out.println("O valor total do estoque do veículo é "+totV);
        return totV;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    public int getQtd_Estoque() {
        return qtd_Estoque;
    }


    public void setQtd_Estoque(int qtd_Estoque) {
        this.qtd_Estoque = qtd_Estoque;
    }
}
