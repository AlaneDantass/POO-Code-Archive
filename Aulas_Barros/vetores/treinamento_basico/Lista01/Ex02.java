//Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2.

import java.util.Scanner;
public class Ex02{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //criação do vetor A com os 8 elementos
        int[] A = new int[10];
        //criação do vetor B com a mesma quantidade de A
        int[] B =  new int[A.length];

        for (int i = 0; i < A.length; i++){
            System.out.println("Digite um número para a posição " + (i+1)+ "do vetor A:");
            A[i] = scan.nextInt();
        }

        scan.close();
        
        //o "FOR" percorre todos os valores de A até que i seja menor que a quantidade de A.
        // De i = 0 vai percorrer até a quantidade de A. Cada vez que fizer isso vai adicionar 1
        for (int i = 0;i < A.length; i++){
            //Recebe o valor que i está analisando de A e multiplica por 2
            B[i] = A[i]*2;
        }

        for (int i = 0; i < A.length; i++){
            System.out.format("A[i] = %d, B[i] %d\n", A[i], B[i]);
        }
    }
}