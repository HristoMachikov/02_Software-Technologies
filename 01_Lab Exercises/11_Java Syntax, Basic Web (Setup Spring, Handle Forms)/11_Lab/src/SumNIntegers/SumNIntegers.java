package SumNIntegers;

        import java.util.Scanner;

public class SumNIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < numb; i++) {
            int currentNumb = scan.nextInt();
            sum += currentNumb;
        }
        System.out.println(sum);
    }
}