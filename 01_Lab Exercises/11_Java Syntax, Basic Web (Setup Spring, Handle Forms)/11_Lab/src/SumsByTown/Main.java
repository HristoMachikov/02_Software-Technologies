package SumsByTown;

import java.util.Scanner;

public class Main {
    // int.Parse() => Integer.parseInt()
    // double.Parse() => Double.parseDouble();
    // Console.ReadLine() => scanner.nextLine();
     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        String text = console.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(text);

    }
}
