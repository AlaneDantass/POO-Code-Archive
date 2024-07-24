/*Escreva um código em Java que apresente a classe Retangulo, com atributos comprimento, largura e os métodos calcularArea, calcularPerimetro e imprimir. O método imprimir deve mostrar na tela os valores de todos os atributos, e da área e perímetro calculados. Salienta-se que a área de um retângulo é obtida pela fórmula (comprimento * largura) e o perímetro por (2 * comprimento) + (2 * largura). 

Crie uma classe principal para testar a classe Quadrado.
 */

 public class Retangulo {
    private double largura;
    private double comprimento;

    public Retangulo(double largura, double comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double calcularArea(){
        return getLargura() * getComprimento();
    }

    public double calcularPerimetro(){
        return (2 * getLargura()) + (2 * getComprimento()); 
    }

    public void imprimir(){
        System.out.println("Largura: " + getLargura() +
        "\nComprimento: " + getLargura() + 
        "\nÁrea: " + calcularArea() +
        "\nPerímetro: " + calcularPerimetro());
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    
}


