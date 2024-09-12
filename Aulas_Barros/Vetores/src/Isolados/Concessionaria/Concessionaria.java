package Isolados.Concessionaria;

public class Concessionaria {
    private Veiculo [] veiculo;
    private int qtd;

    public Concessionaria(){
        this.qtd = 0;
        this.veiculo = new Veiculo[10];
    }

    public boolean adicionarVeiculo(Veiculo veiculo){
        if(qtd == this.veiculo.length){
            System.out.println("Lista completa");
            return false;
        }else{
            this.veiculo[this.qtd] = veiculo;
            qtd++;
            System.out.println("Adicionado com sucesso");
            return true;
        }
    }

    public void listarVeiculos(){
        for (int i = 0;i<qtd; i++){
            System.out.println(veiculo[i].getInfoVeiculo());
        }
    }

    public Veiculo buscarVeiculoPorModelo(String modelo){
        for(int i = 0; i<veiculo.length;i++){
            if(veiculo[i].getModelo().equalsIgnoreCase(modelo)){
                System.out.println("Veiculo encontrado: "+veiculo[i].getModelo());
                return veiculo[i];
            }
        }
        System.out.println("Veiculo não encontrado");
        return null;
    }

    public void Vtot(String modelo){
        for(int i = 0; i<qtd;i++){
            if(veiculo[i].getModelo().equalsIgnoreCase(modelo)){
                veiculo[i].calcularValorTotalEstoque();
            }
        }
    }
}
