public class Professor extends Pessoa02{
    private  String especialidade;
    private double salario;

    public void receberAum(double s){
        setSalario(getSalario()+s);
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
