public class TesteFuncionario {
    public static void main(String[] args) {
        //Os arrays devem ser declarados como arrays de Funcionario, não de Analista ou Desenvolvedor, já que essas classes são subclasses de Funcionario.

        Analista[] analistas = new Analista[2];
        Desenvolvedor[] desenvolvedores = new Desenvolvedor[2];

        analistas[0]= new Analista("Marta", 20, "Gerente", 4000);
        analistas[1]=new Analista("Mauro", 30, "Analista Sênior", 3500);
        desenvolvedores[0]= new Desenvolvedor("João", 25, "Desenvolvedor Junior", 3000);
        desenvolvedores[1] = new Desenvolvedor("Maria", 28, "Desenvolvedor Pleno", 4000);

        analistas[0].calcularBonificacao();
        System.out.println(analistas[1].mostarInformacoes());
        desenvolvedores[0].calcularBonificacao();
        System.err.println(desenvolvedores[1].mostarInformacoes());
        
    }
}
