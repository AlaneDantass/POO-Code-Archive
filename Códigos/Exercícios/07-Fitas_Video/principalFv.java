public class principalFv {
    
    public static void main(String[] args) {
        Fitas_video fita1 = new Fitas_video("Aladdim", 5);
        Fitas_video fita2 = new Fitas_video("A Bela e a Fera",3.50);

        System.out.println("Fita de vídeo: " + fita1 +   fita1.getValorAluguel(4));
        System.out.println("Fita de vídeo: " + fita2 + fita2.getValorAluguel(10));
    }

}
