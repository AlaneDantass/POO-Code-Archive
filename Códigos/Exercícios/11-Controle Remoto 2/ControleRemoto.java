public class ControleRemoto implements Controlador{ //implementando a interface
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Métodos especiais

    public ControleRemoto(){ //// sem passar argumentos
        this.volume=50;
        this.ligado=false;
        this.tocando=false;;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    ////Métodos abstratos

    @Override//sobrescrever
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----MENU-----");
        System.out.println("Está ligado?"+getLigado()); 
        System.out.println("Está tocando?"+getTocando());
        System.out.println("Volume: "+getVolume());
        for(int i=0; i <=getVolume();i+=10){
            System.out.println("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(getLigado()){
            setVolume(getVolume()+5);
        }
    }

    @Override
    public void menosVolume() {
        if(getLigado()){
            setVolume(getVolume()-5);
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado() && getVolume()>0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado() && getVolume()==0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(getLigado() && ! getTocando()){
            setTocando(true);
        }else{
            System.out.println("Não consegui tocar.");
        }
    }

    @Override
    public void pause() {
        if(getLigado() && getTocando() ){
            setTocando(false);
        }else{
            System.out.println("Não consegui pausar.");
        }
    }

    

    

}
