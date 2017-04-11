package TreeIntegersSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumb = scan.nextInt();
        int secondNumb = scan.nextInt();
        int thirdNumb = scan.nextInt();

        if (!checkNumbers(firstNumb, secondNumb, thirdNumb)
                && !checkNumbers(secondNumb, thirdNumb, firstNumb)
                && !checkNumbers(thirdNumb, firstNumb, secondNumb)) {
            System.out.println("No");
        }
    }

    public static boolean checkNumbers(int first, int second, int sum) {

        if (first + second == sum) {
            if (first > second) {
                int temp = first;
                first = second;
                second = temp;
            }
            System.out.printf("%d + %d = %d", first, second, sum);
            return true;
        }
        return false;
    }
}
