public class principalP {
    public static void main(String[] args) {

        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(23);
        v1.setSexo("M");

        Aluno a1 = new Aluno();
        a1.setNome("Alane");
        a1.setIdade(17);
        a1.setSexo("F");
        a1.setMatricula(2022137100);
        a1.setCurso("Informática");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Amélie");
        b1.setIdade(16);
        b1.setSexo("F");
        b1.setBolsa(200.00f);
        b1.pagarMensalidade();

        Professor p1= new Professor();
        p1.setNome("Líbna");
        p1.setIdade(35);
        p1.setSexo("F");
        p1.setEspecialidade("Arte");
        p1.receberAum(2000.00f);

        Tecnico t1 = new Tecnico();
        t1.setNome("Marcus");
        t1.setIdade(30);
        t1.setSexo("M");
        t1.fazerAniver();
        t1.praticar();
    }
}
