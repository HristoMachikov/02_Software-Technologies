package Phonebook;

import java.util.*;

public class Phonebook {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        LinkedHashMap<String, String> phonebook = new LinkedHashMap<String, String>();

        String phone = "";
        while (!input.equals("END"))
        {
            String[] currentRow = input.split(" ");
            String command = currentRow[0];

            String name = currentRow[1];
            switch (command)
            {
                case "A":
                    phone = currentRow[currentRow.length - 1];
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

            input = console.nextLine();
        }
    }
}