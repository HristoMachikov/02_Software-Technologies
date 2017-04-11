package SumsByTown;

import java.util.Scanner;
import java.util.TreeMap;

public class SumsByTown {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb = Integer.parseInt(scan.nextLine());

        TreeMap <String, Double> towns = new TreeMap <String, Double>();

        for (int i = 0; i < numb ; i++) {
            String[] input = scan
                    .nextLine()
                    .split("\\|");
            String currTown = input[0].trim();
            double income = Double.parseDouble(input[1].trim());

            if (!towns.containsKey(currTown)) {
                towns.put(currTown, income);
            } else {
                towns.put(currTown, towns.get(currTown) + income);
            }
        }

        for (String key : towns.keySet()) {
            System.out.println(key + " -> " + towns.get(key));
        }
    }
}