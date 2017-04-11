package BombNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BombNumbers {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] input = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] specialNumbs = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bomb = specialNumbs[0];
        int power = specialNumbs[1];
        int sum = 0;

        //List inputInt = Arrays.asList(input);
        //if(inputInt.contains(bomb)){

        boolean check =false;
        for (int i = 0; i < input.length ; i++) {
            if (input[i] == bomb){
                check = true;
                break;
            }
        }

        if(check){

            for (int i = 0; i < input.length; i++)
            {
                int current = input[i];
                if (current == bomb)
                {
                    if ((input.length - 1) - (i + power) >= 0 && i - power >= 0)
                    {
                        for (int j = i - power; j <= i + power; j++)
                        {
                            input[j] = 0;
                        }

                        sum = IntStream.of(input).sum();
                    }
                    else if ((input.length - 1) - (i + power) < 0 && i - power >= 0)
                    {
                        for (int j = i - power; j < input.length; j++)
                        {
                            input[j] = 0;
                        }

                        sum = IntStream.of(input).sum();
                    }
                    else if ((input.length - 1) - (i + power) >= 0 && i - power < 0)
                    {
                        for (int j = 0; j <= i + power; j++)
                        {
                            input[j] = 0;
                        }

                        sum = IntStream.of(input).sum();
                    }
                    else
                    {
                        System.out.println(0);
                        return;
                    }
                }
            }
        }
        else
        {
            sum = IntStream.of(input).sum();
        }

        System.out.println(sum);
    }
}