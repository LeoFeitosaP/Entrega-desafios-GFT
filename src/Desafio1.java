// Verficar se palavras são anagramas

import java.util.Arrays;
import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeiro palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.println("Digite a sua segunda palavra");
        String palavra2 = scanner.nextLine();

        if (palavrasSaoAnagramas(palavra1, palavra2)) {
            System.out.println("Resultado: As palavras são anagramas!");
        } else {
            System.out.println("Resultado: As palavras não são anagramas!");
        }
    }

    private static boolean palavrasSaoAnagramas(String p1, String p2) {
        char[] caracteres1 = p1.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] caracteres2 = p2.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Arrays.sort(caracteres1);
        Arrays.sort(caracteres2);
        return Arrays.equals(caracteres1, caracteres2);
    }
}
