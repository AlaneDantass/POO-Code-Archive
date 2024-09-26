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

    public String getInfoLivro(){
        return "Título: "+titulo+"\nAutor: "+autor+"\nPreço: "+preco+"\nQuantidade em estoque: "+ quantidade+"\n\n";
    }

    public double calcularValorTotalEstoque(){
        double totV = preco * quantidade;
        System.out.println("O valor total do estoque do livro é "+totV);
        return totV;
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
