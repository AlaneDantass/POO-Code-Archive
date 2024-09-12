package Isolados.Concessionaria;

public class main {
    public static void main(String[] args){
        
        Concessionaria concessionaria = new Concessionaria();


        concessionaria.adicionarVeiculo(new Veiculo("Civic", "Honda", 120000, 2));
        concessionaria.adicionarVeiculo(new Veiculo("Corolla", "Toyota", 110000, 5));
        concessionaria.adicionarVeiculo(new Veiculo("Gol", "Volkswagen", 45000, 10));
        concessionaria.adicionarVeiculo(new Veiculo("Onix", "Chevrolet", 55000, 4));
        concessionaria.adicionarVeiculo(new Veiculo("Renegade", "Jeep", 130000, 3));

        
        concessionaria.buscarVeiculoPorModelo("Renegade");
        concessionaria.listarVeiculos();
        concessionaria.Vtot("Onix");
        

    }
}
