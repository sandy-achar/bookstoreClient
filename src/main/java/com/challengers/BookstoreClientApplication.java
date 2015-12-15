package com.challengers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BookstoreClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(BookstoreClientApplication.class, args);

        /*
        UserControllerMethods userController = new UserControllerMethods();

        //Checking login
        System.out.println("Checking user Login.");
        boolean loginResult = userController.userLogin("sandesh", "sandesh");
        System.out.println(loginResult);

        //Check user register
        System.out.println("Checking user register.");
        User user = new User("hulk", "greenStuff", "Bruce", "M", "Banner", "410 Firwood Place", "Plano", "75075", "Texas", "United States");
        String registerResult = userController.userRegister(user);
        System.out.println(registerResult);

        //Check user update
        System.out.println("Checking user update.");
        User userUpdate = new User("hulk", "greenStuff", "Sandesh", "Sanjeev", "Achar", "410 Firwood Place", "Plano", "75075", "Texas", "United States");
        String updateResult = userController.userUpdate(userUpdate);
        System.out.println(updateResult);
        */

        /*
        //Check for book controller
        BookControllerMethods bookController = new BookControllerMethods();


        //Check to get all books
        bookController.getAllBooks();


        //Check to find book by title
        bookController.getBookByTitle("NoSQL");

        //Check to find book by isbn
        bookController.getBookByISBN("abc123456789");

        //Check to find book by language
        bookController.getBookBylanguage("English");

        //Check to find books by author
        bookController.getBookByAuthorName("John Benoit");

        //Check to find books by publisher
        bookController.getBookByPublisherName("abc publications");
        */

 /*
        BookControllerMethods bookController = new BookControllerMethods();
//        bookController.getAllBooks();


        //Check adding book
        Set<String> authors = new HashSet<>();
        authors.add("John Benoit");
        authors.add("Tony Cole");
        Set<String> publishers = new HashSet<>();
        publishers.add("abc publications");

        //An existing book
        Book book = new Book("NoSQL", authors, publishers, 2004, "abc123456789", "English", 30.50, 5, 2);
        bookController.addBook(book);

        //New book
        Book book1 = new Book("NoSQL", authors, publishers, 2004, "abc123456722", "English", 30.50, 5, 2);
        bookController.addBook(book1);
        */


        /*
        //Checking updating book
        Set<String> authors = new HashSet<>();
        authors.add("Sandesh Sanjeev");
        authors.add("Incredible Hulk");
        Set<String> publishers = new HashSet<>();
        publishers.add("abc publications");
        Book book = new Book("NoSQL", authors, publishers, 2004, "abc123456722", "English", 30.50, 5, 2);
        String id = "1611759348201506408";
        Long bookId = Long.parseLong(id);
        bookController.updateBook(bookId, book);
        */

        /*
        //Checking for transactions
        TransactionControllerMathods transactionController = new TransactionControllerMathods();

        String id = "2596880988704689669";
        Long bookId1 = Long.parseLong(id);

        id = "8123816692078955930";
        Long bookId2 = Long.parseLong(id);

        BookTransactionInfo bookTransactionInfo1 = new BookTransactionInfo(bookId1, 1);
        BookTransactionInfo bookTransactionInfo2 = new BookTransactionInfo(bookId2, 1);

        Set<BookTransactionInfo> bookTransactionInfo = new HashSet<>();
        bookTransactionInfo.add(bookTransactionInfo1);
        bookTransactionInfo.add(bookTransactionInfo2);

        System.out.print(bookTransactionInfo);

        id = "2837275520700924440";
        Long userId = Long.parseLong(id);
        String date = "2015-04-01";
        Transaction transaction = new Transaction(userId, bookTransactionInfo);
        System.out.print(transaction);

        //transactionController.buyBook(transaction);
        transactionController.getAllTransactions(userId);
        transactionController.getTransactionByDate(userId, date);*/

        /*
        //Add a lot of new books
        //Check adding book
        Set<String> authors = new HashSet<>();
        authors.add("J. K. Rowling");
        Set<String> publishers = new HashSet<>();
        publishers.add("Arthur A. Levine Books");
        String id = "2488106879109674804";
        Long userId = Long.parseLong(id);

        BookControllerMethods bookController = new BookControllerMethods();

        //An existing book
        Book book = new Book("Harry Potter and the Philosopher's Stone", authors, publishers, 1998, "0-7475-3269-9", "English", 7.50, 25, 6, "hp1.jpg", userId);
        bookController.addBook(book);

        Book book1 = new Book("Harry Potter and the Chamber of Secrets", authors, publishers, 1999, "0-7475-3849-2", "English", 7.50, 30, 6, "hp2.jpg", userId);
        bookController.addBook(book1);

        Book book2 = new Book("Harry Potter and the Prisoner of Azkaban", authors, publishers, 1999, "0-7475-4215-5", "English", 7.50, 30, 6, "hp3.jpg", userId);
        bookController.addBook(book2);

        Book book3 = new Book("Harry Potter and the Goblet of Fire", authors, publishers, 2000, "0-7475-4624-X", "English", 7.50, 30, 6, "hp4.jpg", userId);
        bookController.addBook(book3);

        Book book4 = new Book("Harry Potter and the Order of the Phoenix", authors, publishers, 2003, "0-7475-5100-6", "English", 7.50, 40, 6, "hp5.jpg", userId);
        bookController.addBook(book4);

        Book book5 = new Book("Harry Potter and the Half-Blood Prince", authors, publishers, 2005, "0-7475-8108-8", "English", 7.50, 30, 6, "hp6.jpg", userId);
        bookController.addBook(book5);

        Book book6 = new Book("Harry Potter and the Deathly Hallows", authors, publishers, 2007, "0-545-01022-5", "English", 7.50, 30, 6, "hp2.jpg", userId);
        bookController.addBook(book6);


        // For lord of the rings
        Set<String> authors1 = new HashSet<>();
        authors.add("J. R. R. Tolkien");
        Set<String> publishers1 = new HashSet<>();
        publishers.add("George Allen & Unwin");

        Book book7 = new Book("The Fellowship of the Ring", authors1, publishers1, 2012, "978-0547928210", "English", 11.50, 30, 6, "lotr1.jpg", userId);
        bookController.addBook(book7);

        Book book8 = new Book("The Two Towers", authors1, publishers1, 2012, "978-0547928203", "English", 11.50, 30, 6, "lotr2.jpg", userId);
        bookController.addBook(book8);

        Book book9 = new Book("The Return of the King", authors1, publishers1, 2012, "978-0547928197", "English", 11.50, 30, 6, "lotr3.jpg", userId);
        bookController.addBook(book9);

        Book book10 = new Book("The Hobbit", authors1, publishers1, 2012, "978-0547928227", "English", 6.50, 30, 6, "hobbit.jpg", userId);
        bookController.addBook(book10);

        Set<String> authors2 = new HashSet<>();
        authors.add("Sir Arthur Conan Doyle");
        Set<String> publishers2 = new HashSet<>();
        publishers.add("Bantam Classics");

        Book book11 = new Book("Sherlock Holmes: The Complete Novels and Stories, Vol. 1", authors2, publishers2, 1986, "978-0553212419", "English", 12.40, 30, 6, "sherlock1.jpg", userId);
        bookController.addBook(book11);

        Book book12 = new Book("Sherlock Holmes: The Complete Novels and Stories, Volume II", authors2, publishers2, 1986, "978-0553212426", "English", 17.50, 30, 6, "sherlock2.jpg", userId);
        bookController.addBook(book12);


        Set<String> authors3 = new HashSet<>();
        authors.add("Jennifer Niederst Robbins");
        Set<String> publishers3 = new HashSet<>();
        publishers.add("O'Reilly Media; Fourth Edition edition");

        Book book13 = new Book("Learning Web Design", authors3, publishers3, 2012, "978-1449319274", "English", 8.50, 30, 6, "lwd.jpg", userId);
        bookController.addBook(book13);

        Book book14 = new Book("HTML5 Pocket Reference", authors3, publishers3, 2013, "978-1449363352", "English", 10, 30, 6, "html5.jpg", userId);
        bookController.addBook(book14);

        Set<String> authors4 = new HashSet<>();
        authors.add("Ana Galan");
        Set<String> publishers4 = new HashSet<>();
        publishers.add("scholastic en Espanol");

        Book book15 = new Book("Qué cosas dice mi abuela: (The Things My Grandmother Says)", authors4, publishers4, 2013, "978-0545328630", "Spanish", 2.50, 50, 6, "spanish1.jpg", userId);
        bookController.addBook(book15);

        Book book16 = new Book("Mondragá 2 Rídel y los árboles parlantes (Mondrago)", authors4, publishers4, 2013, "978-8444148137", "Spanish", 5, 30, 6, "spanish2.jpg", userId);
        bookController.addBook(book16);

        Book book17 = new Book("Mondragó: El baobab (Mondrago) ", authors4, publishers4, 2013, "978-8444148144", "Spanish", 5, 30, 6, "spanish3.jpg", userId);
        bookController.addBook(book17);

        Set<String> authors5 = new HashSet<>();
        authors.add("James Patterson");
        Set<String> publishers5 = new HashSet<>();
        publishers.add("Little, Brown and Company");

        Book book18 = new Book("Cross Justice (Alex Cross)", authors5, publishers5, 2015, "978-0316407045", "English", 6.50, 50, 6, "cross.jpg", userId);
        bookController.addBook(book18);

        Book book19 = new Book("The Murder House", authors5, publishers5, 2015, "978-0316407047", "English", 6.50, 50, 6, "murderHouse.jpg", userId);
        bookController.addBook(book19);

        Book book21 = new Book("14th Deadly Sin (Women's Murder Club)", authors5, publishers5, 2015, "978-0316407021", "English", 6.50, 50, 6, "womanSin.jpg", userId);

        bookController.addBook(book21);

        authors5.add("Michael Ledwidge");
        Book book20 = new Book("Alert", authors5, publishers5, 2015, "978-0316407067", "English", 6.50, 50, 6, "alert.jpg", userId);
        bookController.addBook(book20);


        Book book22 = new Book("Merry Christmas, Alex Cross", authors5, publishers5, 2015, "978-1455544943", "English", 6.50, 50, 6, "merryChristmas.jpg", userId);
        bookController.addBook(book22);*/
    }
}
