//Defina uma classe Porta com os atributos: cor, altura, largura e estaAberta. Inclua na classe um construtor, os métodos gets e sets e o método toString() para retornar a representação textual do objeto.

//Crie uma classe principal para criar objetos e invocar (chamar) os métodos disponíveis na classe Porta.


public class Porta {
    private String cor;
    private float altura;
    private float largura;
    private boolean estaAberta;

    public Porta(String cor, float altura, float largura, boolean estaAberta) {
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.estaAberta = estaAberta;
    }

    public String get_Cor(){ 
        return cor;
    }
    public float get_Altura(){
        return altura;
    }
    public float get_Largura(){
        return largura;
    }
    public boolean get_EstaAberta(){
        return estaAberta;
    }
    public void set_Cor(String Cor){
        this.cor = Cor;
    }
    public void set_Altura(float Altura){
        this.altura = Altura;
    }
    public void set_Largura(float Largura){
        this.largura = Largura;
    }
    public void set_estaAberta(boolean EstaAberta){
        this.estaAberta = EstaAberta;
    }

    public void abrir(){
        estaAberta = true;
    }

    public void fechar(){
        estaAberta = false;
    }
    public String imprimir(){
        return "Cor da porta: " + get_Cor() + "\nAltura da porta: " + get_Altura() + "\nLargura da porta: " + get_Largura() + "\nA porta está aberta? " + get_EstaAberta();

    }
}
