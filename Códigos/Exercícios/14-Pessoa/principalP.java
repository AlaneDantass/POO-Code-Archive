public class principalP {
    public static void main(String[] args) {
        Pessoa02[] pe = new Pessoa02[4];

        pe[0]=new Aluno();
        pe[1]=new Professor();
        pe[2]=new Funcionario();
        pe[3]=new Pessoa02();

        pe[0].setNome("Peu");
        pe[1].setNome("Alane");
        pe[2].setNome("Cláudio");
        pe[3].setNome("Débora");

        pe[0].cancelarMat();
        pe[1].receberAum(5000.0);
        pe[2].mudarTrabalho();
        pe[3].fazerAniver();

    }
}
