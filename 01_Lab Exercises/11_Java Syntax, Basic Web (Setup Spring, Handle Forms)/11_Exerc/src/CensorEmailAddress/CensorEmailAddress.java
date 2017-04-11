package CensorEmailAddress;

import java.util.Scanner;

public class CensorEmailAddress {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String email = console.nextLine();
        String input = console.nextLine();
        String[] strArr = email.split("@");
        String emailName = strArr[0];

        StringBuilder sb = new StringBuilder(emailName.length());
        for (int i = 0; i < emailName.length() ; i++) {
            sb.append("*");
        }

        String checkedEmail = sb.toString() + "@" + strArr[1];
        String output = input.replace(email, checkedEmail);

        System.out.println(output);
    }
}