public class Agenda {
    private Pessoa[] pessoas; //lista estática de pessoas que serão armazenadas
    private int qtdP; //Vai servir como um contador de pessoas já adicionadas

    public Agenda(int tamanho){ //vai receber ovalor máximo de pessoas dentro da agenda
        this.qtdP = 0; //Começa em zero porque ninguém foi adicionado
        this.pessoas = new Pessoa[tamanho]; //inicializador da lista de pessoas com o tamanho especificado
    }
    
    //Adiciona mais 1 pessoa ao vetor enquanto houver espaço  

    public boolean adicionar(Pessoa p) {
        if (qtdP == this.pessoas.length) {
            // Se a quantidade de pessoas na lista estiver completa, ele retorna "FALSO"
            System.out.println("Lista completa.");
            return false;
        } else {
            // No vetor "pessoas", vai acessar o valor atual de qtdP, então "pessoas[qtdP]" será a posição onde a nova pessoa será armazenada. Em seguida, qtdP é incrementado e P recebe a nova pessoa.
            this.pessoas[this.qtdP++] = p;
            return true; // Retorna "VERDADEIRO" porque a pessoa foi adicionada com sucesso.
        }
    }
    
    //Porque usar o boolean? Porque ele está servindo para retornar sucesso(true) ou falha(false)

    public String GetMaisNova(){
        if (this.qtdP == 0) return null; // Verifica se a agenda tá vazia
        Pessoa menor = this.pessoas[0];
        for(Pessoa p: this.pessoas){
            if (p.getIdade() < menor.getIdade())
                menor = p;
        }
        return menor.getNome();
    }
}

