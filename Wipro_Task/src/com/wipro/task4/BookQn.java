package com.wipro.task4;
import com.wipro.task4.AuthorQn;

 class BookQn {
    private String name;
    private AuthorQn author;
    private double price;
    private int qty;

    public BookQn(String name, AuthorQn author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0; 
    }

    public BookQn(String name, AuthorQn author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public AuthorQn getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[name=" + name + "," + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }
}

