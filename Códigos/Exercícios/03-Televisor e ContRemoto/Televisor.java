/*Defina uma classe Televisor com os atributos: canal, volume e ligado. 
Inclua na classe um construtor, os métodos ligar, desligar, aumentarVolume, 
diminuirVolume, trocarCanal e o método toString() para retornar a representação textual do objeto.*/

public class Televisor {
    private int canal;
    private int volume;
    private boolean ligado;

    public Televisor(int canal, int volume, boolean ligado){
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public void aumentarVolume(){
        volume++; //(++)aumenta o valor de 1 em 1
    }

    public void diminuirVolume(){
        volume--; //(--)diminui o valor de 1 em 1
    }

    public void canal(int Novo_canal){
        canal = Novo_canal;
    }


    public String toString(){   
        return "Televisor:" + 
            "\nCanal = " + canal +
            "\nVolume = " + volume +
            "\nLigado = " + ligado;
    }
    /*O método toString é usado para mostrar os valores dos atributos em forma de String; 
    Ele vai mostra uma representação textual do objeto criado.
    Quando vc usa o System.out.println(); automaticamente chamará o toString*/
}








