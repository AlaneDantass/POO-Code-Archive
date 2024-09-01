package Lista01;
//4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i]). 

import java.util.Scanner;

public class Ex04{
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int[] A = new int[15];
        //precisa usar double para retornar valores elevados ao quadrado
        double[] B = new double[A.length];
    

        for (int i = 0; i < A.length; i++){
            System.out.println("Digite um número para a posição "+ (i+1) + ':');
            A[i] = Entrada.nextInt();
            //A função Math.sqrt() é uma função matemática específica para calcular a raiz quadrada de um número. Ela faz parte da classe Math, por isso para usar um método precisamos saber da classe
            B[i] = Math.sqrt(A[i]);
        }
        // é uma boa prática fechar o Scanner após o uso para evitar vazamento de recursos. 
        Entrada.close();
        
        System.out.println("Vetores de A e B: ");
        for (int i = 0; i< A.length; i++){
            System.out.format("A[i] = %d, B[i] = %.2f\n", A[i], B[i]);
        }
    }
}