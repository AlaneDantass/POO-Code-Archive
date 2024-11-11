public class Mercadinho {
    private Cliente[] cliente = new cliente[5];
    private int indice = 0

    public void addCliente(cliente c){
        if(indice< cliente.length){
            cliente[indice] = c
            indice++;
        }
    }

    public double calcularTotal(){
        
    }

    public void imprimirClientes(){
        for (int i = 0;i < indice.length; i++){
            System.out.println("Nome: "getNome());
        }
    }
}
