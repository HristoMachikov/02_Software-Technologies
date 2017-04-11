package VariableInHexadecimalFormat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int number = hexDec(input);
        System.out.println(number);

    }
    public static int hexDec(String num) {
        int sum = 0;
        int newnum = 0;
        String digit = num.toUpperCase();
        for (int i = 0; i < digit.length(); i++) {
            char c = digit.charAt(digit.length() - i - 1);

            if (c == 'A') {
                newnum = 10;

            } else if (c == 'B') {
                newnum = 11;

            }
            if (c == 'C') {
                newnum = 12;

            }
            if (c == 'D') {
                newnum = 13;

            }
            if (c == 'E') {
                newnum = 14;

            }
            if (c == 'F') {
                newnum = 15;

            } else {
                newnum = Character.getNumericValue(c);
            }
            sum = (int) (sum + newnum * Math.pow(16, i));
        }

        return  sum;
    }
}