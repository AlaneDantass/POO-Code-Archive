/*Uma determinada empresa deseja controlar a folha de pagamentos de seus funcionários. Para isso, você deverá implementar um programa Java com as seguintes características: 

Construa a classe Funcionário, onde cada objeto criado a partir dela tenha os seguintes atributos: código, nome, CPF, endereço, telefone, idade e salário. Esta classe possui os seguintes métodos: 

-Deve haver um método para acessar e outro para modificar os valores de cada atributo. 
-Deve haver um método para retornar o “estado” do objeto.
-Deve haver um método para calcular o salário líquido do funcionário, exemplo: float calculaSalarioLiquido(). O cálculo é o salário bruto descontado 11% do INSS.
 */

public class Funcionario {
    private int cod;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private double salario;

    public Funcionario(int cod,String nome,String cpf,String endereco,String telefone,int idade,double salario){
        this.cod = cod;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    public int get_Cod() {
        return cod;
    }

    public void set_Cod(int cod) {
        this.cod = cod;
    }

    public String get_Nome() {
        return nome;
    }

    public void set_Nome(String nome) {
        this.nome = nome;
    }

    public String get_Cpf() {
        return cpf;
    }

    public void set_Cpf(String cpf) {
        this.cpf = cpf;
    }

    public String get_Endereço() {
        return endereco;
    }

    public void set_Endereço(String endereço) {
        this.endereco = endereço;
    }

    public String get_Telefone() {
        return telefone;
    }

    public void set_Telefone(String telefone) {
        this.telefone = telefone;
    }

    public int get_Idade() {
        return idade;
    }

    public void set_Idade(int idade) {
        this.idade = idade;
    }

    public double get_Salario() {
        return salario;
    }

    public void set_Salario(double salario) {
        this.salario = salario;
    }

    public void Estado(){
        System.err.println(get_Cod());
        System.out.println(get_Nome());
        System.out.println(get_Cpf());
        System.out.println(get_Endereço());
        System.out.println(get_Telefone());
        System.out.println(get_Idade());
        System.out.println(get_Salario());
    }
    /*public String toString(){
        return ("Código: "+cod+
            "\nNome: "+
            "\nCPF: "+cpf+
            "\nEndereço: "+ endereco+
            "\nTelefone: "+telefone+
            "\nIdade: "+idade+
            "\nSalário: "+salario); 
    }*/

    public double calculaSalarioLiquido(){
        return salario-((salario*11)/100.0);
    }
}
