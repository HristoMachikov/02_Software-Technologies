package PhonebookUpgrade;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        TreeMap<String, String> phonebook = new TreeMap<>();

        ////string phone = string.Empty;
        while (!input.equals("END"))
        {
            String[] currentRow = input.split(" ");
            if (currentRow[0].equals("ListAll"))
            {
                for (String key : phonebook.keySet())
                {
                    System.out.printf("%s -> %s%n", key, phonebook.get(key));
                }
            }
            else
            {
                String command = currentRow[0];
                String name = currentRow[1];
                switch (command)
                {
                    case "A":
                        String phone = currentRow[currentRow.length - 1];
                        phonebook.put(name, phone);
                        break;
                    case "S":
                        if (!phonebook.containsKey(name))
                        {
                            System.out.printf("Contact %s does not exist.%n", name);
                        }
                        else
                        {
                            System.out.printf("%s -> %s%n", name, phonebook.get(name));
                        }

                        break;
                }
            }

            input = console.nextLine();
        }
    }
}