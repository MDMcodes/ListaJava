import java.util.Scanner;

public class Clinica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMedicos = 5; // Definir quantos médicos serão cadastrados

        String[] medicos = new String[totalMedicos]; // Array para os nomes dos médicos
        String[] especialidades = new String[totalMedicos]; // Array para as especialidades

        // Entrada de dados
        System.out.println("Cadastro de médicos:");
        for (int i = 0; i < totalMedicos; i++) {
            System.out.print("Digite o nome do médico " + (i + 1) + ": ");
            medicos[i] = scanner.nextLine();

            System.out.print("Digite a especialidade do médico " + (i + 1) + ": ");
            especialidades[i] = scanner.nextLine();
        }

        // Exibir os médicos cadastrados
        System.out.println("\nLista de Médicos Cadastrados:");
        for (int i = 0; i < totalMedicos; i++) {
            System.out.println("Médico: " + medicos[i] + " | Especialidade: " + especialidades[i]);
        }

        scanner.close();
    }
}
