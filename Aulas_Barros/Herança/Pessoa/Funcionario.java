public class Funcionario extends Pessoa {
    private double salario;
    public Funcionario(String nome, int idade, double salario){
        super(nome, idade);
        this.salario = salario;
    }

    public void Funcao(){
        System.out.println("Trabalhar");
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
