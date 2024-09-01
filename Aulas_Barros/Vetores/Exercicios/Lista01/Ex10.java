package Lista01;
//Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o resto da divisão do respectivo elemento de A por 2 (dois), ou seja: B[i] = A[i] % 2. 

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A= new int[10];
        int[] B = new int[A.length];

        for (int i = 0; i<A.length; i++){
            System.out.println("Digite um núemro para a posição "+(i+1)+" do vetor A:");
            A[i] = in.nextInt();
        }

        in.close();

        for (int i = 0; i<A.length;i++){
            B[i] = A[i]%2;
        }

        for (int i = 0; i < A.length; i++){
            System.out.format("A[i] = %d, B[i] = %d\n",A[i], B[i]);
        }
    }
}
