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
        return largura * comprimento;
    }

    public double calcularPerimetro(){
        return (2 * largura) + (2 * comprimento); 
    }

    public void imprimir(){
        System.out.println("Largura: " + largura +
        "\nComprimento: " + comprimento+ 
        "\nÁrea: " + calcularArea() +
        "\nPerímetro: " + calcularPerimetro());
    }
}


