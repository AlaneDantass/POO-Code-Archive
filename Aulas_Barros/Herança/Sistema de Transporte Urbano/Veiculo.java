public abstract class Veiculo {
    protected String placa;
    protected String modelo;
    protected int ano;

    public abstract double calcularTarifa();
    public abstract String exibirDetalhes();


    public String get_Placa(){
        return placa;
    }

    public void set_Placa(String placa){
        this.placa = placa;
    }

    public String get_Modelo(){
        return modelo;
    }

    public void set_Modelo(String modelo){
        this.modelo = modelo;
    }

    public int get_ano(){
        return ano;
    }

    public void set_Ano(int ano){
        this.ano = ano;
    }

}
