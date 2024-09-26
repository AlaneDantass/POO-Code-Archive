public class Livraria {
    private Livro[] livros; //está declarando um atributo chamado livro que é um vetor do tipo Livro, no entanto não foi inicializado
    private int qtd;

    public Livraria(){
        this.qtd = 0;
        this.livros = new Livro[5]; // Inicialização capacidade de 5 livros
    }

    public boolean adicionarLivro(Livro livro){
        if (this.qtd == this.livros.length){
            System.out.println("Lista completa");
            return false;
        }
        this.livros[this.qtd] = livro;
        qtd++;
        System.out.println("Livro adicionado com sucesso!");
        return true;
    }

    public void listarLivros(){
        System.out.println("Lista de livros:\n");
        for(int i = 0; i < qtd; i++){
            System.out.println(livros[i].getInfoLivro()); 
        }
    }

    public Livro buscarLivroPorTitulo(String titulo){
        for (int i = 0; i < this.qtd; i++){
            if(livros[i].getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("Livro " + livros[i].getTitulo() + " foi encontrado.");
                return livros[i];
            }
        }
        System.out.println("Livro não encontrado.");
        return null;
    }

    public void Vtot(String titulo){
        for(int i = 0; i < this.qtd; i++){
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)){
                livros[i].calcularValorTotalEstoque();
            }
        }  
    }
}