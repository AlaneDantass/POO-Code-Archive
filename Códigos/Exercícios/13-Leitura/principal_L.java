public class principal_L {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Julho", 18, "M");
        p[1] = new Pessoa("Alane", 17, "F");

        l[0] = new Livro("Declaração de fé", "CGADB", 264, p[1]);

        l[1] = new Livro("O homem mais inteligente da história", "August Cury", 260, p[0]);
        l[2] = new Livro("Cosmos", "Carl Sagan", 488, p[1]);

        System.out.println(l[1].detalhes());
        l[1].abrir();
        l[1].folhear(300);
        l[1].avancarPag();

        System.out.println(l[1].detalhes());

        l[2].abrir();
        l[2].avancarPag();
        l[2].fechar();
    }
}