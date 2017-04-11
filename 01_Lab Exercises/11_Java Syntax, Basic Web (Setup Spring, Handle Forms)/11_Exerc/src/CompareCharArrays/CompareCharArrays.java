package CompareCharArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] firstArr = console.nextLine().split(" ");

        String[] secondArr = console.nextLine().split(" ");

        int minArr = Math.min(firstArr.length,secondArr.length);

        int count = 0;
        for (int i = 0; i < minArr; i++) {
            if (!firstArr[i].equals(secondArr[i])){
                count ++;
                break;
            }
        }

        StringBuilder sbFirst = new StringBuilder();
        for (String str:firstArr) {
            sbFirst.append(str);
        }

        StringBuilder sbSecond = new StringBuilder();
        for (String str:secondArr) {
            sbSecond.append(str);
        }

        String str1 = "";
        String str2 = "";

        if (count == 0 && (firstArr.length <= secondArr.length)) {
           str1 = sbFirst.toString();
           str2 = sbSecond.toString();
        } else if (count == 0 && (firstArr.length > secondArr.length)) {
            str1 = sbSecond.toString();
            str2 = sbFirst.toString();
        } else {
            str1 = sbFirst.toString();
            str2 = sbSecond.toString();
            for (int i = 0; i < minArr; i++) {
                char currFirstChar = firstArr[i].charAt(0);
                char currSecondChar = secondArr[i].charAt(0);
                if (currFirstChar > currSecondChar) {
                    str1 = sbSecond.toString();
                    str2 = sbFirst.toString();
                    break;
                }
            }
        }

        System.out.println(str1);
        System.out.println(str2);
        }
    }