/*Escreva um código em Java que apresente a classe Circulo, com o atributo raio e os métodos calcularArea, calcularPerimetro e imprimir. O método imprimir deve mostrar na tela os valores de todos os atributos, e da área e perímetro calculados. Salienta-se que a área de um círculo é obtida pela fórmula (pi * raio * raio) e o perímetro por (2 * pi * raio), onde pi = 3,141516.
 */
public class Circulo {
    private double raio;
    private final double pi;

    public Circulo(double raio){
        this.raio = raio;
        this.pi = 3.141516;
    }

    public double calcuarArea(){
        return pi*(raio*raio);
    }

    public double calcularPerimetro(){
        return (2*pi)*raio;
    }

    public void imprimir(){
        System.out.println("Raio: " + raio +
        "\nÁrea: " + calcuarArea() +
        "\nPerímetro: " + calcularPerimetro());
    }
}
