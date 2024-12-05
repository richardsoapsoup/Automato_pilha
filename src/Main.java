import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Executar testes predefinidos");
            System.out.println("2 - Inserir sequência manualmente");
            System.out.println("0 - Sair");

            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    AutomatoPilha.runPresetTests();
                    break;
                case 2:
                    AutomatoPilha.runUserInputTest();
                    break;
                case 0:
                    keepRunning = false;
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }

        scanner.close();
    }
}

