public class Professor extends Pessoa02{
    private  String especialidade;
    private double salario;

    public void receberAum(float s){
        setSalario(getSalario()+s);
        System.out.println(getNome()+" acabou de receber um aumento de "+s+" R$");
    }

    public String getEspecialidade(){
        return especialidade;
    }


    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}
