public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float d, int vitorias, int derrotas, int empates){
        this.nome=nome;
        this.nacionalidade=nacionalidade;
        this.idade=idade;
        this.altura=altura;
        setPeso(d);
        this.vitorias=vitorias;
        this.derrotas=derrotas;
        this.empates=empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float d) {
        this.peso = d;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(peso<52.2f){
            categoria ="Inválido";
        }else if(peso<=70.3f){
            categoria = "Leve";
        }else if (peso<=83.9){
            categoria="Médio";
        }else if (peso<=120.2){
            categoria="Pesado";
        }else{
            categoria="Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public void apresentar(){
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + getNome());
        System.out.println("Diretamente de : " + getNacionalidade());
        System.out.println("Com " + getIdade() + " anos e " + getAltura() + " de altura");
        System.out.println("Pesando: " + getPeso() + "kg");
        System.out.println("Ganhou: " + getVitorias() + " vezes.");
        System.out.println("Perdeu: " + getDerrotas() + " vezes.");
        System.out.println("Empatou: " + getEmpates() + " vezes.");
    }
    

    public void status(){
        System.out.println(getNome());
        System.out.println("É um peso "+getCategoria());
        System.out.println("Vitórias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Empates: "+getEmpates());
    }

    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }
}
