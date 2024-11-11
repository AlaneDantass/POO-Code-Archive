public class Onibus extends Veiculo {
    public Onibus(String placa, String modelo, int ano, int capacidadeDePassageiros) {
        super(placa, modelo,ano);
        this.capacidadeDePassageiros = capacidadeDePassageiros;
    }

    public int getCapacidadeDePassageiros() {
        return capacidadeDePassageiros;
    }

    public void setCapacidadeDePassageiros(int capacidadeDePassageiros) {
        this.capacidadeDePassageiros = capacidadeDePassageiros;
    }
    
    public double calcularTarifa() {
        // Implementação específica para ônibus
        return 5.00 + (0.10 * getCapacidadeDePassageiros()) ; 
    }

    public String exibirDetalhes() {
        return "Ônibus - Placa: " + get_Placa() + ", Modelo: " + get_Modelo() + ", Ano: " + get_ano() +
               ", Capacidade de Passageiros: " + getCapacidadeDePassageiros();
    }
}
