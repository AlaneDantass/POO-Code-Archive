public class Mercadinho {
    private Cliente[] cliente = new Cliente[5];
    private int indice = 0;

    public void addCliente(Cliente c) {
        if (indice < cliente.length) {
            cliente[indice] = c;
            indice++;
        } else {
            System.out.println("Não há mais espaço para clientes.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < indice; i++) {
            total += cliente[i].calcularPagamento();
        }
        return total;
    }

    public void imprimirClientes() {
        for (int i = 0; i < indice; i++) {
            System.out.println("Nome: " + cliente[i].getNome());
        }
    }
}
