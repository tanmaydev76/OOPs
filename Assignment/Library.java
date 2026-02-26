import java.util.Scanner;
import java.util.ArrayList;

public class Library {

    static int displayMenu(Scanner sc) {
        System.out.println("\nWelcome to the Library Management System");
        System.out.println("Press 1 to donate books");
        System.out.println("Press 2 to return a book");
        System.out.println("Press 3 to borrow a book");
        System.out.println("Press 4 to exit");
        return sc.nextInt();
    }

    static class Book {
        String name;
        int price;
        int edition;
        int available;
	
	static int totalBooks = 100;
        static int totalTypes = 10;
        
        Book(String name, int price, int edition, int available) {
            this.name = name;
            this.price = price;
            this.edition = edition;
            this.available = available;
        }
    }

    static int searchBook(String name, int edition, ArrayList<Book> dataBase) {
        for (int i = 0; i < dataBase.size(); i++) {
            if (dataBase.get(i).name.equals(name) && dataBase.get(i).edition == edition) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Book> dataBase = new ArrayList<>();

        String[] names = {"DSA","JAVA","C++","OOPD","TOC","PYTHON","JS","CO","STORIES","NOVEL"};

        for (int i = 0; i < 10; i++) {
            dataBase.add(new Book(names[i], i * 10, i + 1, 10));
        }

        int n = displayMenu(sc);

        while (n != 4) {

            if (n == 1) {
                sc.nextLine();
                System.out.print("Enter book name: ");
                String name = sc.nextLine();
                System.out.print("Enter edition: ");
                int edition = sc.nextInt();

                int exists = searchBook(name, edition, dataBase);

                if (exists != -1) {
                    System.out.print("Enter total copies to donate: ");
                    int donate = sc.nextInt();
                    dataBase.get(exists).available += donate;
                    Book.totalBooks += donate;
                } else {
                    System.out.print("Enter price: ");
                    int price = sc.nextInt();

                    System.out.print("Enter total copies to donate: ");
                    int donate = sc.nextInt();

                    dataBase.add(new Book(name, price, edition, donate));
                    Book.totalTypes++;
                    Book.totalBooks += donate;
                }

            } else if (n == 2) {
                sc.nextLine();
                System.out.print("Enter book name to return: ");
                String bookName = sc.nextLine();

                for (int i = 0; i < dataBase.size(); i++) {
                    if (dataBase.get(i).name.equals(bookName)) {
                        dataBase.get(i).available++;
                        System.out.println("Book Returned!");
                        break;
                    }
                    if (i == dataBase.size() - 1)
                        System.out.println("Book not found!");
                }

            } else if (n == 3) {
                sc.nextLine();
                System.out.print("Enter book name to borrow: ");
                String bookName = sc.nextLine();
                System.out.print("Enter edition: ");
                int edition = sc.nextInt();

                int exists = searchBook(bookName, edition, dataBase);

                if (exists == -1) {
                    System.out.println("Book not available");
                } else {
                    if (dataBase.get(exists).available == 0)
                        System.out.println("Book not available");
                    dataBase.get(exists).available--;
                    System.out.println("Book Issued!");
                }
            }
            System.out.println();
            System.out.println("Total Types of Books = " + Book.totalTypes);
            System.out.println("Total Books available = " + Book.totalBooks);

            n = displayMenu(sc);
        }

        sc.close();
        System.out.println("Thank you!");
    }
}
