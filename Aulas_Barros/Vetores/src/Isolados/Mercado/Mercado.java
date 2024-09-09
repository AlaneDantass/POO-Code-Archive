// Crie uma classe chamada Mercado com um atributo para armazenar até 20 produtos. Além disso, na classe Mercado devem existir métodos para adicionar, pesquisar e excluir produtos.

//Crie uma classe Principal para instanciar objetos das classes Produto e Mercado e, em seguida, utilize os métodos disponíveis na classe Mercado.

package Isolados.Mercado;

public class Mercado {
    private Produto[] produto;
    private int qtd;

    public Mercado(){
        this.qtd = 0;
        this.produto = new Produto[20];
    }

    public boolean adicionar(Produto pd){
        if(qtd == this.produto.length){
            System.out.println("Lista completa");
            return false;
        }else{
            this.produto[this.qtd++] = pd;
            System.out.println("Adicionado com sucesso");
            return true;
        }
    }

    public Produto pesquisar(String pesquisa) {
        for (int i = 0; i < qtd; i++) {
            if (produto[i].getNome().equalsIgnoreCase(pesquisa)) {
                System.out.println("Produto encontrado: " + produto[i].getNome() + " - R$ " + produto[i].getValor());
                return produto[i];
            }
        }
        System.out.println("Produto não encontrado");
        return null;
    }

    public boolean excluir(String excluir){  //não pode existir lacunas no arrays
        for (int i = 0; i < qtd; i++){
            if (produto[i].getNome().equals(excluir)){
                produto[i] = produto[qtd-1]; //substitui o espaço do produto que foi excluído pelo último elemento da lista. O que eu quis excluir recebeu o último produto, logo o último produto está repetido.
                produto[qtd-1]=null; //aqui, o último elemento que estava repetido foi excluído
                qtd--; 
                System.out.println("O produto [" + produto[i].getNome() +  "] foi excluído com sucesso");
                return true;
            }
        }
        System.out.println("Produto não encontrado");
        return false;
    }
}
