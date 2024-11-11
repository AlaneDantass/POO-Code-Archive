public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus("ABC-1234", "Marcopo", 2020, 45);
        Taxi taxi = new Taxi("XYZ-5678", "Fusca", 2019, "Carlos Silva");

        MotoristaOnibus motorista01 = new 
        
        MotoristaOnibus("João da Silva", "CNH123456");
        MotoristaTaxi motorista02 = new MotoristaTaxi("Carlos Silva", "CNH789012");

        System.out.println(onibus.exibirDetalhes());
        motorista01.exibirOperario();

        System.out.println(taxi.exibirDetalhes());
        motorista02.exibirOperario();
    }
}
