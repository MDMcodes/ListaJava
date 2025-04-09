import java.util.Scanner;

public class ex6 {
    
    // Método para ler um array de 10 elementos
    public static int[] lerArray(int tamanho) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Método para gerar o array C somando os valores de A e B
    public static int[] somarArrays(int[] A, int[] B) {
        int[] C = new int[A.length];        
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i]; // Soma os elementos de A e B
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os arrays A e B
        System.out.println("Digite os elementos do array A:");
        int[] A = lerArray(10);
        System.out.println("Digite os elementos do array B:");
        int[] B = lerArray(10);
        
        // Gera o array C
        int[] C = somarArrays(A, B);
        
        // Exibe o array resultante C
        System.out.println("Os elementos do array C é:");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        scanner.close();
    }
}