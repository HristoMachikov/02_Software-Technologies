package SymmetricNumbers;

import java.util.Scanner;

public class SymmetricNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();

        for (int i = 1; i <= numb ; i++) {
            boolean check = true;
            String numbToStr = "" + i;

            for (int j = 0; j < numbToStr.length()/2 ; j++) {
                char left = numbToStr.charAt(j);
                char right = numbToStr.charAt(numbToStr.length() - 1 - j);
                if (left != right) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(numbToStr + " ");
            }
        }
    }
}