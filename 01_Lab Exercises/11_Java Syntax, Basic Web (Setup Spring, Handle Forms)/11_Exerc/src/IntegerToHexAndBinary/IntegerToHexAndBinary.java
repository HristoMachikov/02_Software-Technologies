package IntegerToHexAndBinary;

import java.util.Scanner;

public class IntegerToHexAndBinary {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        String hexa = String.format("%X", number);
        String binary = Integer.toString(number,2);

        System.out.println(hexa);
        System.out.println(binary);

    }
}