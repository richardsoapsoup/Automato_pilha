import java.util.Scanner;
import java.util.Stack;

public class AutomatoPilha {
    public static boolean validateString(String sequence) {
        Stack<Character> auxStack = new Stack<>();

        for (char symbol : sequence.toCharArray()) {
            if (symbol == '0') {
                auxStack.push('S');
            } else if (symbol == '1') {
                if (auxStack.isEmpty()) {
                    return false;
                }
                auxStack.pop();
            } else {
                // Retorna falso se a sequência contém caracteres inválidos
                return false;
            }
        }

        return auxStack.isEmpty();
    }

    public static void runPresetTests() {
        String[] testCases = {"", "01", "0011", "000111", "000", "011", "101", "0110", "0101"};

        System.out.println("Resultados dos testes predefinidos:");
        for (String testCase : testCases) {
            boolean result = validateString(testCase);
            System.out.println("Sequência: \"" + testCase + "\" - " + (result ? "Aceita" : "Rejeitada"));
        }
    }

    public static void runUserInputTest() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Por favor, insira uma sequência para testar (somente 0s e 1s):");
        String userInput = inputScanner.nextLine();

        boolean isValid = validateString(userInput);
        System.out.println("Sequência: \"" + userInput + "\" - " + (isValid ? "Aceita" : "Rejeitada"));
    }
}
