package MostFrequentNumber;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] scanArray = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 1;
        int maxCount = 0;
        int maxTemp = scanArray[0];
        for (int i = 0; i < scanArray.length; i++)
        {
            for (int j = 0; j < scanArray.length; j++)
            {
                if (i != j)
                {
                    if (scanArray[i] == scanArray[j])
                    {
                        count += 1;
                        if (count > maxCount)
                        {
                            maxCount = count;
                            maxTemp = scanArray[i];
                        }
                    }
                }
            }

            count = 1;
        }

        System.out.println(maxTemp);
    }
}