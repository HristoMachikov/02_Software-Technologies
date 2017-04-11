package AdvertisementMessage;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numb = Integer.parseInt(console.nextLine());
        String[] phrasesArray = new String[]
                {
                        "Excellent product.",
                        "Such a great product.",
                        "I always use that product.",
                        "Best product of its category.",
                        "Exceptional product.",
                        "I can’t live without this product."
                };
        String[] eventsArray = new String[]
                {
                        "Now I feel good.",
                        "I have succeeded with this product.",
                        "Makes miracles. I am happy of the results!",
                        "I cannot believe but now I feel awesome.",
                        "Try it yourself, I am very satisfied.",
                        "I feel great!"
                };
        String[] authorArray = new String[]
                {
                        "Diana",
                        "Petya",
                        "Stella",
                        "Elena",
                        "Katya",
                        "Iva",
                        "Annie",
                        "Eva"
                };
        String[] citiesArray = new String[]
                {
                        "Burgas",
                        "Sofia",
                        "Plovdiv",
                        "Varna",
                        "Ruse"
                };

        Random phrasesIndex = new Random();
        Random eventIndex = new Random();
        Random authorIndex = new Random();
        Random cityIndex = new Random();

        for (int i = 0; i < numb; i++)
        {
            String phrase = phrasesArray[phrasesIndex.nextInt( phrasesArray.length - 1)];
            String myEvent = eventsArray[eventIndex.nextInt(eventsArray.length - 1)];
            String author = authorArray[authorIndex.nextInt(authorArray.length - 1)];
            String city = citiesArray[cityIndex.nextInt(citiesArray.length - 1)];

            System.out.printf("%s %s %s - %s.%n", phrase, myEvent, author, city);
        }
    }
}