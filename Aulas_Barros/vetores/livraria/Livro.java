public class Livro {
    private String titulo;
    private String autor;
    private double preco;
    private int quantidade;

    public Livro(String titulo, String autor, double preco, int quantidade){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getInfoVeiculo(){
        return "Título: "+titulo+"\nAutor: "+autor+"\nPreço: "+preco+"\nQuantidade em estoque: "+ quantidade;
    }

    public double calcularValorTotalEstoque(){
        return preco*quantidade;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
