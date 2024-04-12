/*Crie uma classe principal para criar objetos e invocar (chamar) 
os métodos disponíveis na classe Televisor e ControleRemoto.*/

public class principal {
  public static void main(String[] args) {
    Televisor televisor1 = new Televisor(2, 6, false);
    ControleRemoto01 controle = new ControleRemoto01(1, 2, false);
    televisor1.ligar();
    televisor1.aumentarVolume();
    televisor1.canal(6);
    System.out.println(televisor1.toString());

    System.out.println( );

    controle.ligar();
    controle.diminuirVolume();
    controle.canal(6);
    System.out.println(televisor1.toString());
    }  
}
