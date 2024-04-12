public final class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override //sobreescrevendo o método pagarMensalidade em Aluno
    public void pagarMensalidade(){
        System.out.println( getNome()+" é bolsista. Pagamento facilitado!");
    }
    
}
