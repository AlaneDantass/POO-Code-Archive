public class principalB {
   public static void main(String[] args) {
    Calendario data1 = new Calendario(13,9,2024);
    Calendario data2 = new Calendario(11, 9, 2005);

    data1.mostrarData();
    data1.anoBissexto();

    System.out.println('\n');

    data2.mostrarData();
    data2.anoBissexto();
   }
}
