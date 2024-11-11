public class Cadastro{
    private Pessoa[] pessoas = new Pessoa[3];
    private int indice = 0;

    public void adicionar(Pessoa p){
        if (indice < pessoas.length){
            pessoas[indice] = p;
            indice++;
        }
    }

    public void cadastrados(){
        for (int i = 0; i < indice; i++){
            System.out.println("Nome: "+ pessoas[i].getNome() +"Idade: "+ pessoas[i].getIdade());
        }
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
}

