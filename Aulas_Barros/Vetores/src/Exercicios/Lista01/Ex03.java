//Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja: B[i] = A[i] * A[I]

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int[] A = new int[15];
        int[] B = new int[A.length];

        // é uma boa prática fechar o Scanner após o uso para evitar vazamento de recursos.
        for (int i = 0; i < A.length; i++){
            System.out.println("Digite um número para a posição "+ (i+1) + ':');
            A[i] = Entrada.nextInt();
            B[i] = A[i] * A[i];
        }
        Entrada.close();

        System.out.println("Vetores A e B: ");
        for (int i = 0; i< B.length; i++){
            System.out.format("A[i] = %d, B[i] = %d\n", A[i], B[i]);
        }
    }
}
