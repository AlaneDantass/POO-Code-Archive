public interface Controlador {
//interface é um tipo de estrutura que define um conjunto de métodos que uma classe concreta deve implementar. Uma interface é semelhante a uma classe abstrata, mas com algumas diferenças importantes:


//Uma classe abstrata é uma classe que não pode ser instanciada, ou seja, você não pode criar um objeto direto dela. Usada para interfaces.

    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();

}
