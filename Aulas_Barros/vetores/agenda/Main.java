package exercicios.agenda;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Agenda agenda = new Agenda(4);
        String nome, telefone, email;
        int idade;

        for (int i = 0; i < 4; ++i){
            System.out.println("Informe o nome: ");
            nome = in.nextLine();
            System.out.println("Informe seu email: ");
            email = in.nextLine();
            System.out.println("Informe o telefone: ");
            telefone = in.nextLine();
            System.out.println("Digite sua idade: ");
            idade = in.nextInt(); in.nextLine();
            
            agenda.adicionar(new Pessoa(nome, email, telefone, idade));
        }

        System.out.println("Nome da pessoa mais nova");
        System.out.println(agenda.GetMaisNova());
    }
}