package com.challengers;

/**
 * Created by darkstar on 12/9/15.
 */
public class BookTransactionInfo {

    //Attributes for the class transaction info
    private Long bookId;
    private int quantitySold;

    //Constructors
    public BookTransactionInfo() {
    }

    public BookTransactionInfo(Long bookId, int quantitySold) {
        this.bookId = bookId;
        this.quantitySold = quantitySold;
    }

    //Getter and setter methods
    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    @Override
    public String toString() {

        return "Bookid: " + bookId + "\n" +
                "Quantity: " + quantitySold;
    }
}
