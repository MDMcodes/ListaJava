import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos funcionários deseja cadastrar? ");
        int numFuncionarios = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Arrays para armazenar os dados
        String[] nomes = new String[numFuncionarios];
        String[] cargos = new String[numFuncionarios];
        double[] salarios = new double[numFuncionarios];
        
        // Cadastro dos funcionários
        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println("\nFuncionário " + (i + 1) + ":");
            
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            
            System.out.print("Cargo: ");
            cargos[i] = scanner.nextLine();
            
            System.out.print("Salário: ");
            salarios[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
        }
        
        // Exibição dos funcionários cadastrados
        System.out.println("\nLista de Funcionários:");
        System.out.println("----------------------");
        
        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Cargo: " + cargos[i]);
            System.out.printf("Salário: R$ %.2f\n", salarios[i]);
            System.out.println("----------------------");
        }
        
        scanner.close();
    }
}
