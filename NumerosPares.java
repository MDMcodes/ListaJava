import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; // Criando um array de 10 números

        // Lendo os números do usuário
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Chamando o método para exibir os números pares
        System.out.println("\nNúmeros pares digitados:");
        mostrarPares(numeros);

        scanner.close();
    }

    // Método que recebe um array e exibe apenas os números pares
    public static void mostrarPares(int[] array) {
        for (int num : array) {
            if (num % 2 == 0) { // Verifica se o número é par
                System.out.print(num + " ");
            }
        }
        System.out.println(); // Quebra de linha no final
    }
}
