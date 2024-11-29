public class MercadoMain {
    public static void main(String[] args) {
        // Criando um objeto da classe Mercadinho
        Mercadinho m = new Mercadinho();

        // Criando e adicionando clientes ao mercadinho
        m.addCliente(new ClienteRegular("Alaíde", 2.00));
        m.addCliente(new ClienteRegular("João", 100.0));
        m.addCliente(new ClienteVip("Maria", 200.0, "1234-5678"));
        m.addCliente(new ClienteOuroVip("Pedro", 300.0, "9876-5432", "Rua A, 123"));

        // Imprimindo clientes cadastrados
        System.out.println("Clientes cadastrados:");
        m.imprimirClientes();

        // Calculando o total das compras
        double total = m.calcularTotal();
        System.out.println("\nValor total das compras: R$ " + total);
    }
}
