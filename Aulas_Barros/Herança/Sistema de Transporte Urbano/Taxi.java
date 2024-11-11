public class Taxi extends Veiculo {
    private String bandeira;

    public Taxi(String placa, String modelo, int ano, String bandeira){
        super(placa, modelo, ano);
        this,bandeira = bandeira;
    }

    public double calcularTarifa(){
        tarifa = 0
        if (getBandeira().equalsIgnoreCase("Bandeira 1")){
            tarifa = 3.50;
        }else{
            tarifa = 4.50;
        }
    }

    public String exibirDetalhes(){
        return "Ônibus - Placa: " + placa + ", Modelo: " + modelo + ", Ano: " + ano +
               ", Bandeira: " + getBandeira();
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    
}
