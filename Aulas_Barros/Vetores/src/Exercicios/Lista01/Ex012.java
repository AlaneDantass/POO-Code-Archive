//Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma de todos os elementos armazenados neste vetor. 

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int[] A = new int[10];
        int soma = 0;

        //preenchendo o vetor com todos os valores
        for(int i = 0; i< A.length;i++){
            System.out.println("Digite um número para a posição "+ (i+1)+ ":");
            A[i] = In.nextInt();
            soma += A[i];
        }

        In.close();

        for (int i = 0; i< A.length;i++){
            System.out.format("A[i] = %d\n", A[i]);
        }

        System.out.println("A soma dos valores fornecidos é " + soma);
    }
}
