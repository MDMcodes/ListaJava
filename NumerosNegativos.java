import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; // Criando um array para 10 números

        // Lendo os números do usuário
        System.out.println("Digite 10 números inteiros (positivos ou negativos):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Chamando o método para exibir os números negativos
        System.out.println("\nNúmeros negativos digitados:");
        mostrarNegativos(numeros);

        scanner.close();
    }

    // Método que recebe um array e exibe apenas os números negativos
    public static void mostrarNegativos(int[] array) {
        boolean encontrouNegativo = false;
        for (int num : array) {
            if (num < 0) { // Verifica se o número é negativo
                System.out.print(num + " ");
                encontrouNegativo = true;
            }
        }
        if (!encontrouNegativo) {
            System.out.println("Nenhum número negativo foi digitado.");
        } else {
            System.out.println(); // Quebra de linha no final
        }
    }
}

