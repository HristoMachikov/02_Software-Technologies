package BookLibraryModification;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class BookLibraryModification {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        class Book
        {
            public String Title;

            public String Author;

            public String Publisher;

            public LocalDate ReleaseDate;

            public String ISBN;

            public double Price;

            public Book(String title, String author, String publisher, LocalDate releaseDate, String ISBN, double price) {
                Title = title;
                Author = author;
                Publisher = publisher;
                ReleaseDate = releaseDate;
                this.ISBN = ISBN;
                Price = price;
            }

            public Book() {
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String title) {
                Title = title;
            }

            public String getAuthor() {
                return Author;
            }

            public void setAuthor(String author) {
                Author = author;
            }

            public String getPublisher() {
                return Publisher;
            }

            public void setPublisher(String publisher) {
                Publisher = publisher;
            }

            public LocalDate getReleaseDate() {
                return ReleaseDate;
            }

            public void setReleaseDate(LocalDate releaseDate) {
                ReleaseDate = releaseDate;
            }

            public String getISBN() {
                return ISBN;
            }

            public void setISBN(String ISBN) {
                this.ISBN = ISBN;
            }

            public double getPrice() {
                return Price;
            }

            public void setPrice(double price) {
                Price = price;
            }
        }

        class Library
        {
            public String Name;

            public LocalDate date;

            public Library(String name, LocalDate date) {
                Name = name;
                this.date = date;
            }

            public Library() {

            }

            public String getName() {
                return Name;
            }

            public void setName(String name) {
                Name = name;
            }

            public LocalDate getDate() {
                return date;
            }

            public void setDate(LocalDate date) {
                this.date = date;
            }
        }

        int numb = Integer.parseInt(console.nextLine());

        Map<String, LocalDate> allBooks = new HashMap<String, LocalDate>();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        List<Library> libraryBooks = new ArrayList<Library>();
        for (int i = 0; i < numb; i++)
        {
            String[] currentInput = console.nextLine().split(" ");
            Book currentBook = new Book();
            currentBook.setTitle(currentInput[0]);
            currentBook.setAuthor(currentInput[1]);
            currentBook.setPublisher(currentInput[2]);
            LocalDate ReleaseDate = LocalDate.parse(currentInput[3], df);
            currentBook.setReleaseDate(ReleaseDate);
            currentBook.setISBN(currentInput[4]);
            currentBook.setPrice(Double.parseDouble(currentInput[5]));

            allBooks.put(currentBook.getTitle(), currentBook.getReleaseDate());

        }

        LocalDate startDate = LocalDate.parse(console.nextLine(), df);

        for (String book : allBooks.keySet())
        {
            Library currentLibrary = new Library(book, allBooks.get(book));
            libraryBooks.add(currentLibrary);
        }

        List<Library> sortedLibrary = libraryBooks.stream().sorted((x, y) -> {
            int result = x.getDate().compareTo(y.getDate());
            if (result == 0){
                return x.getName().compareTo(y.getName());
            }

            return result;
        })
                .filter((x) -> x.getDate().isAfter(startDate))
                .collect(Collectors.toList());

        for (Library author : sortedLibrary)
        {
            String formattedString = author.getDate().format(df);
            System.out.printf("%s -> %s%n", author.getName(), formattedString);
        }
    }
}