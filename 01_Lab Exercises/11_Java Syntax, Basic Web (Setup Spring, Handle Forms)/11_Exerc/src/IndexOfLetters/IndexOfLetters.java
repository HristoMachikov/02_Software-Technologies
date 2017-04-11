package IndexOfLetters;

        import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char[] input = console.nextLine().toCharArray();
        for (char symbol : input) {
            int digit = symbol - 'a';
            System.out.printf("%s -> %d%n", symbol, digit);
        }
    }
}