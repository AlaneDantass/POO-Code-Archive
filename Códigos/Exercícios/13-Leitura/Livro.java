public class Livro implements Publicacao {
    // restante do código da classe Livro aqui
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual= 0;
    }

    public String detalhes() {
        return "=======Detalhes======" + "\nLivro: " + getTitulo() + "\nAutor: " + getAutor() + "\nTotal de páginas"
                + getTotPaginas() + "\nPágina atual: " + getPagAtual() + "\nEstá aberto?" + getAberto()
                + "\nLeitor: " + leitor.getNome() +", Idade: "+ leitor.getIdade() + ", Sexo: "+ leitor.getSexo();
    }

    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
       setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p>getTotPaginas()){
            setPagAtual(p);
            System.err.println("Impossível folhear até essa página");
        }else {
            setPagAtual(p);
        }
       
    }

    @Override
    public void avancarPag() {
        //setPagAtual(getPagAtual()+1);
        pagAtual++;
    }

    @Override
    public void voltarPag() {
        //setPagAtual(getPagAtual()-1);
        pagAtual--;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


}
