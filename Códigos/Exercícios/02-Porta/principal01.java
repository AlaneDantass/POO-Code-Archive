public class principal01 {
    public static void main(String[] args) {
        Porta porta1 = new Porta("Branca", 2.0f, 0.8f, false);
        Porta porta2 = new Porta("Azul", 1.5f, 0.7f, true);
    
        porta1.abrir();
        porta2.fechar();

        porta1.set_Cor("Marrom");
        System.out.println(porta1.imprimir());
    
    }
}
