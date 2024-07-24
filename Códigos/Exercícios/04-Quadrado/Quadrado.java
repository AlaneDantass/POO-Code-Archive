/*Escreva um código em Java que apresente a classe Quadrado, com o atributo lado e os métodos calcularArea, 
calcularPerimetro e imprimir. O método imprimir deve mostrar na tela os valores do lado, e da área e do perímetro calculados. Salienta-se que a área de um quadrado é obtida pela fórmula (lado * lado) e o perímetro por (4 * lado).

Crie uma classe principal para testar a classe Quadrado.
*/

//Declara classe

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return getLado() * getLado();
    }

    public double calcularPerimetro() {
        return 4 * getLado();
    }

    public void imprimir() {
        System.out.println("Lado: " + getLado() + 
                "\nÁrea: " + calcularArea() +
                "\nPerímetro: " + calcularPerimetro());
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}


