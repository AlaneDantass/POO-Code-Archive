public class codigoPrincipal {
    public static void main(String[] args) {
        Video[] v = new Video[3];

        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 07 de HTML");
        v[2] = new Video("Aula 24 de Sistemas operacionais");

        System.err.println("VÍDEOS----------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Alane", 17, "F", "alane.dantas");
        g[1] = new Gafanhoto("Pedro", 17, "M", "pedro.trajano");

        System.err.println("GARFANHOTOS------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());

        Visualizacao[] vi = new Visualizacao[3];
        vi[0] = new Visualizacao(g[0], v[1]);
        vi[1] = new Visualizacao(g[1], v[1]);
        vi[2] = new Visualizacao(g[1], v[2]);

        vi[1].avaliar(35.6f);
        vi[0].avaliar(10);
        vi[2].avaliar();

        System.err.println("VISUALIZAÇÕES------------------");
        System.out.println(vi[0].toString());
        System.out.println(vi[1].toString());
        System.out.println(vi[2].toString());
        
    }
}


