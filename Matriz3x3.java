import java.util.Scanner;

public class Matriz3x3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3]; // Declaração de uma matriz 3x3

        // Entrada de dados: preenchendo a matriz
        System.out.println("Digite 9 números inteiros para preencher a matriz 3x3:");
        for (int i = 0; i < 3; i++) {  // Percorre as linhas
            for (int j = 0; j < 3; j++) {  // Percorre as colunas
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibindo a matriz
        System.out.println("\nMatriz cadastrada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t para melhor formatação
            }
            System.out.println(); // Quebra de linha a cada linha da matriz
        }

        scanner.close();
    }
}
