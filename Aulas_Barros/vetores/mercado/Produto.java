package exercicios.mercado;

//Escreva uma classe chamada Produto contendo o nome e o valor do produto.

public class Produto{
    private String nome;
    private double valor;

    public Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}