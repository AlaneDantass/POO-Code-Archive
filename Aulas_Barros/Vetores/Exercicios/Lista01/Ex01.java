package Lista01;
import java.util.Scanner;
//1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i]. 

public class Ex01 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[A.length];

        for(int i = 0; i < A.length; i++){
            System.out.println("Digite um número para a posição " + (i+1) + ":");
            A[i] = Entrada.nextInt();
            B[i] = A[i];
        }

        // Fechando o Scanner
        Entrada.close();

    
        System.out.println("Vetores A e B:");
        for (int i = 0;i < A.length; i++){
            System.out.format("A[i] = %d, B[i] = %d \n",A[i], B[i]);
        }
    }
}