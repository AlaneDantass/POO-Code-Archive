public class principal_Fn {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(1, "João Abílio Genuíno da Silva", "123.456.789-00", "Rua Bela Vista", "123456789", 30, 13000.0);

        funcionario1.Estado();
        System.out.println("Salário líquido do funcionário"+funcionario1.calculaSalarioLiquido());

        System.out.println('\n');

        funcionario1.set_Salario(1500.0);
        funcionario1.Estado();
        System.out.println("Salário líquido do funcionário"+funcionario1.calculaSalarioLiquido());

    }
}
