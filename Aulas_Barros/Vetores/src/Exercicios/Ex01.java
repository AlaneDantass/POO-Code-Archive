import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // Declaração do vetor
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++){
            System.out.println("Digite o número para a posição" + (i + 1) + ":");
            num[i] = scanner.nextInt();
        }

        System.out.println("Os valores armazenados no vetor são: ");
        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
        scanner.close();
    }
}