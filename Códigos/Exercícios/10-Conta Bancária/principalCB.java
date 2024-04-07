public class principalCB {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco(165292, "cc", "João Abílio da Silva", 300, false);

        conta1.abrirConta("cc");

        System.out.println( conta1.statusString());
        System.out.println();

        conta1.pagarMensalidade();
        conta1.sacar(300);
        conta1.depositar(20);

        System.out.println();
        System.out.println( conta1.statusString());
    }
}
