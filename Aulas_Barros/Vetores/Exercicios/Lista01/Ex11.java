package Lista01;
//.Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de elementos armazenados neste vetor que são pares. 
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int[] A = new int[10];
        int pares = 0;

        //preenchendo o vetor com todos os valores
        for(int i = 0; i< A.length;i++){
            System.out.println("Digite um número: ");
            A[i] = In.nextInt();
        }

        In.close();

        //preenchendo o vetor e a variável com apenas os pares
        for (int i = 0; i<A.length; i++){
            if (A[i] % 2 == 0){
                pares ++;
            }
        }

        for (int i = 0; i< A.length;i++){
            System.out.format("A[i] = %d\n", A[i]);
        }

        System.out.println("A quantidade de números pares inseridos na lista é: " + pares);
    }
}

