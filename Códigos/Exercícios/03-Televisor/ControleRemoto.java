//Defina também uma classe ControleRemoto com o atributo Televisor e os mesmos métodos da classe Televisor.

public class ControleRemoto {
    private int canal;
    private int volume;
    private boolean ligado;

    public ControleRemoto(int canal, int volume, boolean ligado){
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
}
