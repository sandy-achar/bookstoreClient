package com.challengers.dto;

/**
 * Created by Malika(mxp134930) on 12/14/2015.
 */
public class BookSearch {
    private String category;
    private String query;

    public BookSearch() {
    }

    public BookSearch(String category, String query) {
        this.category = category;
        this.query = query;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
