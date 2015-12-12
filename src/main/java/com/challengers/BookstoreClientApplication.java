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
    }
}
