/* Escreva uma classe em Java para representar fitas de vídeo. A classe tem dois atributos: o título da fita e o preço do aluguel por dia. Deve haver um método para que um programa "fora" da classe descubra o título da fita e o preço do aluguel por dia. 

Além do mais, deve haver um método público getValorAluguel(int numeroDeDiasAlugada) que retorne o valor do aluguel desta fita se ela for alugada em um certo número de dias (este número de dias é passado como parâmetro). Faça também o método toString(), para retornar a versão textual do objeto.

Escreva uma classe principal, onde você deve criar algumas fitas e mostrar os dados de cada uma.
 */
public class FitasVideo {
    private String titulo; // Isso significa que o atributo só pode ser acessada dentro da classe em que foi criada.
    private double aluguelPorDia;

    public FitasVideo(String titulo, double aluguelPorDia) {
        this.titulo = titulo;
        this.aluguelPorDia = aluguelPorDia;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getAluguelPorDia() {
        return aluguelPorDia;
    }

    public double getValorAluguel(int numeroDeDiasAlugada) {
        return numeroDeDiasAlugada * aluguelPorDia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAluguelPorDia(double aluguelPorDia) {
        this.aluguelPorDia = aluguelPorDia;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nAluguel por dia: " + aluguelPorDia;
    }
}
