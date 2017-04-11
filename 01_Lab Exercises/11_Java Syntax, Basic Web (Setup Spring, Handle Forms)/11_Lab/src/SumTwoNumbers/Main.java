package SumTwoNumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNumb = scan.nextDouble();
        double secondNumb = scan.nextDouble();
        double result = firstNumb + secondNumb;

        System.out.println(result);
    }
}
