package com.challengers;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by darkstar on 12/9/15.
 */
public class Transaction {

    //Attributes for the class
    private Long userId;
    private Set<BookTransactionInfo> bookTransactionInfo = new HashSet<>();

    //Class constructors
    public Transaction() {

    }

    public Transaction(Long userId, Set<BookTransactionInfo> bookTransactionInfo) {

        this.userId = userId;
        this.bookTransactionInfo = bookTransactionInfo;

    }

    //Getter and Setter methods
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Set<BookTransactionInfo> getBookTransactionInfo() {
        return bookTransactionInfo;
    }

    public void setBookTransactionInfo(Set<BookTransactionInfo> bookTransactionInfo) {
        this.bookTransactionInfo = bookTransactionInfo;
    }

    private String bookTransactions() {

        String output = "";

        for (BookTransactionInfo i : bookTransactionInfo) {

            output = i + "\n";

        }

        return output;
    }

    @Override
    public String toString() {

        return "\nUserId: " + userId + "\n" +
                "Book Transactions:\n" + bookTransactionInfo;
    }
}
