
class Book {
    String title;
    double price;
    int edition;
    boolean isIssued;

    Book(String title, double price, int edition) {
        this.title = title;
        this.price = price;
        this.edition = edition;
        this.isIssued = false;
    }

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            Library.issuedBooks++;
            System.out.println(title + " issued successfully.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    void returnBook() {
        if (isIssued) {
            isIssued = false;
            Library.issuedBooks--;
            System.out.println(title + " returned successfully.");
        } else {
            System.out.println(title + " was not issued.");
        }
    }
}

class Student {

    void issueBook(Book book) {
        book.issueBook();
    }

    void returnBook(Book book) {
        book.returnBook();
    }
}

class Library {
    static int totalBooks = 10;
    static int issuedBooks = 0;

    static void printIssuedPercentage() {
        double percentage = ((double) issuedBooks / totalBooks) * 100;
        System.out.println("Issued Books: " + issuedBooks + "/" + totalBooks);
        System.out.println("Percentage Issued: " + percentage + "%");
    }
}


public class LibrarySystem {
   public static void main(String[] args) {
        Book[] books = {
            new Book("Java Programming", 450, 3),
            new Book("Python Basics", 400, 2),
            new Book("Data Structures", 550, 4),
            new Book("Operating Systems", 600, 3),
            new Book("Computer Networks", 500, 2),
            new Book("DBMS", 480, 3),
            new Book("Web Development", 420, 1),
            new Book("AI Basics", 650, 1),
            new Book("Machine Learning", 700, 2),
            new Book("Cloud Computing", 580, 2)
        };

        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.issueBook(books[0]);
        s1.issueBook(books[3]);
        s2.issueBook(books[5]);
        s2.issueBook(books[7]);

        Library.printIssuedPercentage();

        s1.returnBook(books[3]);

        Library.printIssuedPercentage();
   }
}
