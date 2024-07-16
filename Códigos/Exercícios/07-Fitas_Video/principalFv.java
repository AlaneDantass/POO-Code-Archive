public class principalFv {
    
    public static void main(String[] args) {
        FitasVideo fita1 = new FitasVideo("Aladdin", 5);
        FitasVideo fita2 = new FitasVideo("A Bela e a Fera", 3.50);

        System.out.println("Fita de vídeo: " + fita1 + "\nValor total do aluguel por 4 dias: " + fita1.getValorAluguel(4));
        System.out.println();
        System.out.println("Fita de vídeo: " + fita2 + "\nValor total do aluguel por 10 dias: " + fita2.getValorAluguel(10));
    }
}
