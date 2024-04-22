public class Desenvolvedor extends Funcionario03 implements Bonificavel {

    public Desenvolvedor(String nome, int idade, String cargo, double salario) {
        super(nome, idade, cargo, salario);
    }

    //Desenvolvedor, super(nome, idade, cargo, salario); está chamando o construtor da classe Funcionario, a superclasse de Desenvolvedor, e passando os parâmetros necessários para inicializar os atributos herdados da classe Funcionario. Isso é necessário porque a classe Funcionario não possui um construtor padrão (sem argumentos), então é preciso chamar explicitamente o construtor que recebe os argumentos necessários.

    @Override
    public String mostarInformacoes() {
        return "--------Informações do Funcionário---------"+
        "\nNome: "+ getNome() + 
        "\nIdade: "+ getIdade() +
        "\nCargo: "+ getCargo() +
        "\nSalário" + getSalario();
    }

    @Override
    public void calcularBonificacao() {
        double bonificacao = (getSalario()+0.15);
        setSalario(getSalario()+bonificacao);
        System.out.println(nome+" recebeu uma bonificação de R$"+bonificacao);
        
    }
    
}
