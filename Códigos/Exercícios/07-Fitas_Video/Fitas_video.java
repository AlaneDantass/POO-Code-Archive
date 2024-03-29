/* Escreva uma classe em Java para representar fitas de vídeo. A classe tem dois atributos: o título da fita e o preço do aluguel por dia. Deve haver um método para que um programa "fora" da classe descubra o título da fita e o preço do aluguel por dia. 

Além do mais, deve haver um método público getValorAluguel(int numeroDeDiasAlugada) que retorne o valor do aluguel desta fita se ela for alugada em um certo número de dias (este número de dias é passado como parâmetro). Faça também o método toString(), para retornar a versão textual do objeto.

Escreva uma classe principal, onde você deve criar algumas fitas e mostrar os dados de cada uma.
 */
public class Fitas_video {
    private String titulo; //Isso significa que o atributo só pode ser acessada dentro da classe em que foi criada.
    private double aluguel_por_dia;

    public Fitas_video(String titulo, double aluguel_por_dia){
        this.titulo = titulo;
        this.aluguel_por_dia = aluguel_por_dia;
    }

    public String get_titulo(){
        return titulo;
    }

    public double aluguel_por_dia(){
        return aluguel_por_dia;
    }

    public double getValorAluguel(int ValorAluguel){
        return ValorAluguel*aluguel_por_dia;
    }

    public String toString(){
        return "Título: " + titulo + "\nAluguel por dia: " + aluguel_por_dia + "\nValor total do aluguel: ";}
}
