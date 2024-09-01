package Lista01;
//Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i] * i. 
public class Ex05 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        double[] B = new double[A.length];

        for (int i = 0; i<A.length; i++){
            B[i] = A[i] * i; 
        }

        for (int i = 0; i < A.length; i++){
            System.out.println(A[i]);
        }
        for (int i = 0; i < A.length; i++){
            //Vai formatar a forma como será exibido
            //// Exibe A[i] como inteiro e B[i] como ponto flutuante com 2 casas decimais
            System.out.format("A[i] = %d, B[i] = %.2f \n", A[i], B[i]);
        }
    }
}
