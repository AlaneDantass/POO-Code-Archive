//Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a soma dos respectivos elementos em A e B, ou seja: C[i] = A[i] + B[i]. 

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        for (int i = 0; i < A.length; i++){
            System.out.println("Digite um número para a posição "+ (i+1) + " do vetor A:");
            A[i] = Entrada.nextInt();
        }

        for (int i = 0; i < A.length; i++){
            System.out.println("Digite um número para a posição "+ (i+1) + " do vetor B:");
            B[i] = Entrada.nextInt();
        }

        for (int i = 0; i < A.length; i++){
            C[i] = A[i] + B[i];
        }

        Entrada.close();
        
        for(int i = 0; i < A.length; i++){
            System.out.format("A[i] = %d, + B[i] = %d, = C[i] = %d\n",A[i], B[i], C[i]);
        }
    }
}
