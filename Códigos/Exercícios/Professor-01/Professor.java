package POO.Exercícios.Professor;
//Classe: Adiciona atributos para os objetos
public class Professor {
    private int matricula;
    private String nome;
    private String nome_dep;


    //Construtor:Cria os objetos
    public Professor (int matricula,String nome,String nome_dep){
        this.nome = nome;
        this.matricula = matricula;
        this.nome_dep = nome_dep;
    }

    //Métodos: Permite que os objetos tenham ações
    public void imprimirConteudo() {
        System.out.println("Matrícula:" + matricula);
        System.out.println("Nome do professor:" + nome);
        System.out.println("Nome do departamento:" + nome_dep);
    }

    public int get_Matricula() {
        return matricula;
    }
    public String get_Nome() {
        return nome;
    }
    public String get_Nome_dep() {
        return nome_dep;
    }
    
    public void set_Matricula(int Matricula){
        this.matricula = Matricula;
    }
    public void set_Nome(String Nome){
        this.nome = Nome;
    }
    public void set_Nome_dep(String Nome_dep){
        this.nome_dep = Nome_dep;
    }
}
    

//Defina uma classe chamada Professor com os atributos: matrícula, nome do professor e nome do departamento. Inclua na classe um construtor, os métodos gets e sets e um método para imprimir o conteúdo dos atributos.

//Crie uma classe principal para criar objetos e invocar (chamar) os métodos disponíveis na classe Professor.
