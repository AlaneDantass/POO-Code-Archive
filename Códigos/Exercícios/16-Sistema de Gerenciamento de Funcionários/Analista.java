public class Analista extends Funcionario03 implements Bonificavel{
    
    public Analista(String nome, int idade, String cargo, double salario) {
        super(nome, idade, cargo, salario);

    }

    @Override
    public void calcularBonificacao() {
        double bonificacao = (getSalario()+0.10);
        setSalario(getSalario()+bonificacao);
        System.out.println(nome+" recebeu uma bonificação de R$"+bonificacao);
    }

    @Override
    public String mostarInformacoes() {
        return super.mostarInformacoes();
    }
    
}
