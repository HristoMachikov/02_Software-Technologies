package LargestThreeNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbersAsText = scan.nextLine().split(" ");

        Integer[] numbers = new Integer [numbersAsText.length];
        for (int i = 0; i <numbersAsText.length ; i++) {
           numbers[i] = Integer.parseInt(numbersAsText[i]);
        }

        Arrays.sort(numbers);
        int count = Math.min(numbers.length, 3);
        for (int i = 0; i < count; i++) {
          System.out.print(numbers[numbers.length - 1 - i] + " ");
        }
    }
}