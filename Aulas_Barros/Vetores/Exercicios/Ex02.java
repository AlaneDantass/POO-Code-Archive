import java.util.Scanner;

public class Ex02 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
// O código vai aqui

        //Leitor de entradas
        Scanner entrada = new Scanner(System.in);

        //Declaração de um vetor
        int[] num = new int[10];

//Preenchendo o vetor ou array com números fornecidos pelo usuário
        for (int i = 0; i < num.length; i++){
            System.out.println("Digite um número para a posição " + i + ": ");
            num[i] = entrada.nextInt(); //Lê o número digitado pelo usuário;
        }

        //"FOR" é um laço de repetição (loop) que permite executar um bloco de código várias vezes

        // (int i = 0) -- inicializa uma variável como valor 0

        //( i < num.length) é uma condição que vai estabelecer até quando esse loop vai se repetir.

        //(i ++) vai incrementar aumentar o valor de i em 1 toda vez que a estrutura se repetir -- Isso que permite passar a osição do vetor



//Calculando a soma dos elementos
        int soma = 0;
        for (int i = 0; i < num.length; i++){
            soma += num[i]; //soma
        }

        //(int soma = 0) inicializa uma variável com valor 0

        // (for ...) vão ser as condições e atribuições para o laço de repetição

        //(soma += num[i]) aqui ele vai atribuir o valor de i que ele recebeu no a execução do primeiro laço de repetição e somar ao valor atual da variável SOMA, que vai sempre alterar o seu valor quando os laços forem executados

        System.out.println(" A soma de todos valores que você forneceu é igual a " + soma);
    }
}
