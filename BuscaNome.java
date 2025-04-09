import java.util.Scanner;

public class BuscaNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] pessoas = new String[10]; // Array para armazenar 10 nomes

        // Cadastrando os nomes
        System.out.println("Digite 10 nomes para cadastro:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            pessoas[i] = scanner.nextLine();
        }

        // Pedindo o nome para busca
        System.out.print("\nDigite um nome para verificar se está cadastrado: ");
        String nomeBuscado = scanner.nextLine();

        // Convertendo para minúsculas para comparação sem diferenciação de maiúsculas/minúsculas
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (pessoas[i].equalsIgnoreCase(nomeBuscado)) { // Comparação sem case-sensitive
                encontrado = true;
                break;
            }
        }

        // Exibindo o resultado da busca
        if (encontrado) {
            System.out.println("Nome: \"" + nomeBuscado.toUpperCase() + "\" está cadastrado na lista.");
        } else {
            System.out.println("Nome: \"" + nomeBuscado.toUpperCase() + "\" NÃO está cadastrado na lista.");
        }

        scanner.close();
    }
}
