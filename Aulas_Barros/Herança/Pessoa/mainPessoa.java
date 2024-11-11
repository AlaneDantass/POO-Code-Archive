public class mainPessoa {
        public static void main(String[] args) {
        /*Pessoa p = new Pessoa("Mara", 13);

        p = new Aluno("Alane", 18, "Sistemas de informação");
        p = new Funcionario("Flávio", 30, 3.600);*/

        Aluno a= new Aluno("Alane",18, "Ciência da Computação");
        System.out.println(a.informacoes());

        Cadastro c = new Cadastro();

        c.adicionar(new Aluno("Alice", 14, "Edificações"));
        c.adicionar(new Funcionario("Breno", 20, 13.000));

        c.cadastrados();
    }
}
