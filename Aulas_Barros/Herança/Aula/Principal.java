public class Principal {
    public static void main(String[] args) {
        Medico m = new Medico("João", "21313PB", "joao@gmail.com");

        String msg = m.atenderPaciente();

        System.out.println(msg);

        m = new Otorrino("Maria", "3131PE", "maria@gmail.com");

        msg = m.atenderPaciente();

        System.out.println(msg);

        m = new Dermato("Joana", "2342RJ", "joana@gmail.com");

        msg = m.atenderPaciente();

        System.out.println(msg);
    }
}