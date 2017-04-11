package FitStringIn20Chars;

import java.util.Scanner;

public class FitStringIn20Chars {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        String output = "";

        if (input.length() == 20) {
            System.out.println(input);
        } else if (input.length() > 20) {
            output = input.substring(0, 20);
            System.out.println(output);
        } else {
            int stars = 20 - input.length();

            StringBuilder sb = new StringBuilder(stars);
            for (int i = 0; i < stars; i++) {
                sb.append('*');
            }

            System.out.print(input + sb.toString());
        }
    }
}