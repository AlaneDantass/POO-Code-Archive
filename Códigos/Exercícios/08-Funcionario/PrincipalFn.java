public class PrincipalFn {
    public static void main(String[] args) {
        // Criando um funcionário de exemplo
        Funcionario funcionario1 = new Funcionario(1, "João Abílio Genuíno da Silva", "123.456.789-00", "Rua Bela Vista", "123456789", 30, 13000.0);

        // Exibindo o estado do objeto
        System.out.println(funcionario1.estado());
        System.out.println("Salário líquido do funcionário: " + funcionario1.calculaSalarioLiquido());

        System.out.println('\n');

        // Atualizando o salário
        funcionario1.set_Salario(1500.0);
        
        // Exibindo o estado atualizado do objeto
        System.out.println(funcionario1.estado());
        System.out.println("Salário líquido do funcionário: " + funcionario1.calculaSalarioLiquido());
    }
}
