public class Livraria {
    private Livro[] livro;// está declarando um atributo chamado livro que é um vetor do tipo Livro, no entanto não foi inicializado
    private int qtd;

    public Livraria(){
        this.qtd = 0;
        this.livro = new Livro[5];// Aqui o vetor livro é inicializado com capacidade de 5 índices.

        //Isso significa que a livraria pode armazenar até 5 objetos do tipo Livro.
    }

    public boolean adicionarLivro(Livro livro){
        if (this.qtd == this.livro.length){
            System.out.println("Lista completa");
            return false;
        }else{
            this.livro[this.qtd] = livro;
            qtd++;
            System.out.println("Livro adicionado com sucesso!");
            return true;
        }
    }

    public void listarLivros(){
        System.out.println("Lista completa:\n");
        for(int i = 0; i < this.qtd; i++){
            System.out.println(livro[i]);
        }
    }

    public Livro buscarLivroPorTitulo(String titulo){
        for (int i = 0; i< this.qtd; i++){
            if(livro[i].getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("Livro "+livro[i].getTitulo()+" foi encontrado.");
                return livro[i];
            }
        }
        return null;
    }

    public void Vtot(String titulo){
        for(int i = 0; i < this.qtd; i++){
            if (livro[i].getTitulo().equalsIgnoreCase(titulo)){
                livro[i].calcularValorTotalEstoque();
            }
        }  
    }    
}

