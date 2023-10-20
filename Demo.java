import java.util.ArrayList;

public class Demo {
    public static void main(String[]args) {
        // Create 15 books and 5 authors and 20 patrons (for the 1 library)

        // Create 3 array lists to store the books, authors and patrons

        ArrayList<Book> books = new ArrayList<Book>();

        ArrayList<Author> authors = new ArrayList<Author>();

        ArrayList<Patron> patrons = new ArrayList<Patron>();

        // Create 1 library which contains all of the entities mentioned above

        Library library = new Library(books, authors, patrons);

        // Create 5 authors

        Author author1 = new Author("J. K. Rowling", "4 Coles Lane, London", "123-4567-8910", "31 July 1965");

        Author author2 = new Author("Stephen King", "3 Glace Place, Frankfurt", "123-4567-8911", "21 September 1947");

        Author author3 = new Author("J. R. R. Tolkien", "6 Giles Isle, West Hampshire", "123-4567-8912", "3 January 1892");

        Author author4 = new Author("Dan Brown", "8 Toad Road, St Johns", "123-4567-8913", "22 June 1964");

        Author author5 = new Author("Agatha Christie", "8 Clive Drive, Oklahoma City", "123-4567-8914", "15 September 1890");

        // Create 15 books

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1, "9780747532743", "Bloomsbury", 10, Status.AVAILABLE);

        Book book2 = new Book("Harry Potter and the Chamber of Secrets", author1, "9780747538493", "Bloomsbury", 10, Status.AVAILABLE);

        Book book3 = new Book("Harry Potter and the Prisoner of Azkaban", author1, "9780747542155", "Bloomsbury", 10, Status.AVAILABLE);

        Book book4 = new Book("Harry Potter and the Goblet of Fire", author1, "9780747550990", "Bloomsbury", 10, Status.AVAILABLE);

        Book book5 = new Book("Harry Potter and the Order of the Phoenix", author1, "9780747551003", "Bloomsbury", 10, Status.AVAILABLE);

        Book book6 = new Book("Harry Potter and the Half-Blood Prince", author1, "9780747581086", "Bloomsbury", 10, Status.AVAILABLE);

        Book book7 = new Book("Harry Potter and the Deathly Hallows", author1, "9780747591054", "Bloomsbury", 10, Status.AVAILABLE);

        Book book8 = new Book("The Shining", author2, "9780385121675", "Doubleday", 10, Status.AVAILABLE);

        Book book9 = new Book("The Stand", author2, "9780385121682", "Doubleday", 10, Status.AVAILABLE);

        Book book10 = new Book("The Hobbit", author3, "9780618260300", "Houghton Mifflin Harcourt", 10, Status.AVAILABLE);

        Book book11 = new Book("The Lord of the Rings", author3, "9780618517657", "Houghton Mifflin Harcourt", 10, Status.AVAILABLE);

        Book book12 = new Book("The Da Vinci Code", author4, "9780385504201", "Doubleday", 10, Status.AVAILABLE);

        Book book13 = new Book("Angels & Demons", author4, "9780743493468", "Pocket Books", 10, Status.AVAILABLE);

        Book book14 = new Book("The Murder of Roger Ackroyd", author5, "9780062073563", "William Collins & Sons", 10, Status.AVAILABLE);

        Book book15 = new Book("Murder on the Orient Express", author5, "9780062693662", "William Collins & Sons", 10, Status.AVAILABLE);

        // Create 20 patrons

        Patron patron1 = new Patron("John Doe", "12 Main Street, London", "123-456-7890", "1 January 1980");

        Patron patron2 = new Patron("Jane Doe", "12 Main Street, London", "123-456-7891", "1 February 1985");

        Patron patron3 = new Patron("Michael Johnson", "34 Park Avenue, London", "123-456-7892", "15 March 1972");

        Patron patron4 = new Patron("Emily Smith", "56 Broadway, London", "123-456-7893", "20 April 1990");

        Patron patron5 = new Patron("William Brown", "78 Oxford Street, London", "123-456-7894", "5 May 1988");

        Patron patron6 = new Patron("Ava Johnson", "5 Main Street, London", "123-456-7895", "12 June 1982");

        Patron patron7 = new Patron("Oliver Wilson", "7 Park Avenue, London", "123-456-7896", "30 July 1978");

        Patron patron8 = new Patron("Sophia Williams", "9 Broadway, London", "123-456-7897", "8 August 1995");

        Patron patron9 = new Patron("James Jones", "11 Oxford Street, London", "123-456-7898", "25 September 1987");

        Patron patron10 = new Patron("Amelia Taylor", "14 Main Street, London", "123-456-7899", "2 October 1980");

        Patron patron11 = new Patron("Benjamin Davies", "16 Park Avenue, London", "123-456-7900", "17 November 1975");

        Patron patron12 = new Patron("Mia Evans", "18 Broadway, London", "123-456-7901", "4 December 1992");

        Patron patron13 = new Patron("Elijah Wilson", "22 Oxford Street, London", "123-456-7902", "21 January 1984");

        Patron patron14 = new Patron("Charlotte Brown", "24 Main Street, London", "123-456-7903", "13 February 1979");

        Patron patron15 = new Patron("Lucas Miller", "26 Park Avenue, London", "123-456-7904", "9 March 1991");

        Patron patron16 = new Patron("Grace Wilson", "28 Broadway, London", "123-456-7905", "26 April 1986");

        Patron patron17 = new Patron("Henry Moore", "30 Oxford Street, London", "123-456-7906", "14 May 1983");

        Patron patron18 = new Patron("Luna Clark", "32 Main Street, London", "123-456-7907", "7 June 1977");

        Patron patron19 = new Patron("Logan Young", "36 Park Avenue, London", "123-456-7908", "23 July 1994");

        Patron patron20 = new Patron("Emma Harris", "38 Broadway, London", "123-456-7909", "10 August 1989");

        // Add the books, authors and patrons to their respective array lists

        // Add the books to the books array list

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);
        books.add(book11);
        books.add(book12);
        books.add(book13);
        books.add(book14);
        books.add(book15);

        // Add the authors to the authors array list

        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
        authors.add(author4);
        authors.add(author5);

        // Add the patrons to the patrons array list

        patrons.add(patron1);
        patrons.add(patron2);
        patrons.add(patron3);
        patrons.add(patron4);
        patrons.add(patron5);
        patrons.add(patron6);
        patrons.add(patron7);
        patrons.add(patron8);
        patrons.add(patron9);
        patrons.add(patron10);
        patrons.add(patron11);
        patrons.add(patron12);
        patrons.add(patron13);
        patrons.add(patron14);
        patrons.add(patron15);
        patrons.add(patron16);
        patrons.add(patron17);
        patrons.add(patron18);
        patrons.add(patron19);
        patrons.add(patron20);

        // Add all appropriate books to the correct Author's list of books written

        // Author 1

        author1.addBook(book1);
        author1.addBook(book2);
        author1.addBook(book3);
        author1.addBook(book4);
        author1.addBook(book5);
        author1.addBook(book6);
        author1.addBook(book7);

        // Author 2

        author2.addBook(book8);
        author2.addBook(book9);

        // Author 3

        author3.addBook(book10);
        author3.addBook(book11);

        // Author 4

        author4.addBook(book12);
        author4.addBook(book13);

        // Author 5

        author5.addBook(book14);
        author5.addBook(book15);

        // Test all methods of all classes

        // Testing methods related to the Library class

        // Get the list of books in the library
        System.out.println(library.getBooks());

        // Get the list of authors in the library
        System.out.println(library.getAuthors());

        // Get the list of patrons in the library
        System.out.println(library.getPatrons());

        // // Set the list of books in the library
        // library.setBooks(books);

        // Search for a book by title
        System.out.println(library.searchByTitle("The Lord Of The Rings"));

        // // Search for a book by author
        // System.out.println(library.searchByAuthor("J. K. Rowling"));

        // // Search for a book by ISBN
        // System.out.println(library.searchByISBN("1234567890"));

        // // Print the string representation of the library
        // System.out.println(library.toString());

        // Testing methods related to the Author class

        // // Getting and setting the name
        // System.out.println(author1.getName());
        // author1.setName("J. K. Rowling");

        // // Getting and setting the address
        // System.out.println(author1.getAddress());
        // author1.setAddress("789 Maple St");

        // // Getting and setting the phone number
        // System.out.println(author1.getPhoneNumber());
        // author1.setPhoneNumber("555-987-6543");

        // Getting and setting the date of birth
        System.out.println(author1.getDateOfBirth());
        // author1.setDateOfBirth("1965-07-31");

        // Getting the list of books written by the author
        System.out.println(author1.getListOfBooksWritten());

        // Printing the string representation of the author
        System.out.println(author1.toString());

        // Testing methods related to the Patron class

        // Getting and setting the name
        System.out.println(patron1.getName());
        patron13.setName("Jane Doe");

        // Getting and setting the address
        System.out.println(patron1.getAddress());
        // patron1.setAddress("456 Oak St");

        // // Getting and setting the phone number
        // System.out.println(patron1.getPhoneNumber());
        // patron1.setPhoneNumber("555-987-6543");

        // // Getting and setting the date of birth
        // System.out.println(patron1.getDateOfBirth());
        // patron1.setDateOfBirth("1990-01-01");

        // Getting the list of books borrowed by the patron
        System.out.println(patron1.getListOfBooksBorrowed());

        // Checking if the patron has borrowed a specific book
        System.out.println(patron1.hasBorrowedBook(book1));

        // Printing the string representation of the patron
        System.out.println(patron1.toString());

        // Testing methods of the Book class

        // Getting and setting the title
        System.out.println(book1.getTitle());
        // book1.setTitle("New Title");

        // Getting and setting the author
        System.out.println(book1.getAuthor());
        // book1.setAuthor(new Author("New Author", "New Address", "555-987-6543", "1990-01-01"));

        // Getting and setting the ISBN
        // System.out.println(book1.getISBN());
        // book1.setISBN("9876543210");

        // Getting and setting the publisher
        System.out.println(book1.getPublisher());
        // book1.setPublisher("New Publisher");

        // Getting and setting the number of copies
        System.out.println(book1.getNumberOfCopies());
        // book1.setNumberOfCopies(10);

        // Getting and setting the status
        System.out.println(book1.getStatus());
        // book1.setStatus(Status.AVAILABLE);

        // Borrow a book
        book1.borrowBook(patron1);

        // Print the list of books borrowed by the patron
        System.out.println(patron1.getListOfBooksBorrowed());

        // Return a book
        book1.returnBook(patron1);

        // Print the list of books borrowed by the patron
        System.out.println(patron1.getListOfBooksBorrowed());
        
    }
}
