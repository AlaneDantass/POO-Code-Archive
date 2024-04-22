public abstract class Funcionario03 {
    protected String nome;
    private int idade;
    private String cargo;
    private double salario;

    public Funcionario03(String nome, int idade, String cargo, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
    }


    public String mostarInformacoes(){
        return "--------Informações do Funcionário---------"+
        "\nNome: "+ getNome() + 
        "\nIdade: "+ getIdade() +
        "\nCargo: "+ getCargo() +
        "\nSalário" + getSalario();
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    

}
