package ReverseCharacters;

import java.util.Scanner;

public class ReverseCharacters {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        String[] arr = new String[3];

        for (int i = 0; i < arr.length ; i++) {
            arr[arr.length - 1 - i] = console.nextLine();
        }
        System.out.println(String.join("",arr));
    }
}