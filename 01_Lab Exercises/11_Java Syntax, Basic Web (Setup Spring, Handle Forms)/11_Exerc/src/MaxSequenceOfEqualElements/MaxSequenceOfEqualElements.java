package MaxSequenceOfEqualElements;

import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        String[] inputArray = input.split(" ");
        int[] scanArray = new int[inputArray.length];
        for (int i = 0; i < scanArray.length; i++)
        {
            scanArray[i] = Integer.parseInt(inputArray[i]);
        }

        int temp = scanArray[0];
        int count = 1;
        int maxCount = Integer.MIN_VALUE;
        int maxTemp = Integer.MIN_VALUE;
        for (int i = 1; i < scanArray.length; i++)
        {
            if (temp == scanArray[i])
            {
                count += 1;
                if (count > maxCount)
                {
                    maxCount = count;
                    maxTemp = temp;
                }
            }
            else
            {
                temp = scanArray[i];
                count = 1;
            }
        }

        int[] maxTempArray = new int[maxCount];
        for (int i = 0; i < maxTempArray.length; i++)
        {
            maxTempArray[i] = maxTemp;
        }

        for (int i = 0; i < maxTempArray.length ; i++) {
            System.out.print(maxTempArray[i] + " ");
        }
    }
}