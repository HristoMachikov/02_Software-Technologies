package ReverseString;

import java.util.Scanner;

public class ReverseString {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        char[] inputArr = console.nextLine().toCharArray();
        for (int i = inputArr.length - 1; i >= 0 ; i--) {
            System.out.print(inputArr[i]);
        }
    }
}