package ChangeToUppercase;

import java.util.Scanner;

public class ChangeToUppercase {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        String start = "<upcase>";
        String end = "</upcase>";

        String inputRest = input;
        int startIndex = inputRest.indexOf(start);;
        int endIndex = inputRest.indexOf(end);

        StringBuilder sb = new StringBuilder();
        while (endIndex >= 0 && startIndex >= 0 ) {
            if (startIndex > endIndex) {
                sb.append(inputRest.substring(0, endIndex) + end);
                inputRest = inputRest.substring(endIndex + end.length());
                startIndex = inputRest.indexOf(start);
                endIndex = inputRest.indexOf(end);
            } else {
                sb.append(inputRest.substring(0, startIndex) + inputRest.substring(startIndex + start.length(), endIndex).toUpperCase());
                inputRest = inputRest.substring(endIndex + end.length());
                startIndex = inputRest.indexOf(start);
                endIndex = inputRest.indexOf(end);
            }
        }

        sb.append(inputRest);
        System.out.println(sb.toString());
    }
}