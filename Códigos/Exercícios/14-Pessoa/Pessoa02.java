public class Pessoa02 {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniver(){
        idade++;
    }

    public String toString() {
        return "Pessoa02 [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void receberAum(float d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receberAum'");
    }

    public void mudarTrabalho() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mudarTrabalho'");
    }

    public void cancelarMat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelarMat'");
    }

    
}
