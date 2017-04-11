package VowelOrDigit;

import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine().toLowerCase();

        char[] arr = input.toCharArray();
        if (arr.length > 1) {
            System.out.println("digit");
        } else {
            char letter = arr[0];
            if ((letter >= ' ' && letter <= '/') || (letter >= ':' && letter <= '~'))
            {
                if (letter == 'a' || letter == 'o' || letter == 'u' || letter == 'e' || letter == 'i')
                {
                    System.out.println("vowel");
                }
                else {
                    System.out.println("other");
                }
            } else {
                System.out.println("digit");
            }
        }
    }
}