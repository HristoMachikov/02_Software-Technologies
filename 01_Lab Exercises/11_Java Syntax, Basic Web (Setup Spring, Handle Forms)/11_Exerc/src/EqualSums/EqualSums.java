package EqualSums;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] output = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int leftSum = 0;
        int rightSum = 0;
        boolean check = false;

        for (int i = 0; i < output.length; i++)
        {

            for (int left = 0; left < i; left++)
            {
                leftSum += output[left];
            }

            for (int right = i + 1; right < output.length; right++)
            {
                rightSum += output[right];
            }

            if (leftSum == rightSum)
            {
                check = true;
                System.out.println(i);
                break;
            }

            leftSum = 0;
            rightSum = 0;
        }

        if (!check)
        {
            System.out.println("no");
        }
    }
}