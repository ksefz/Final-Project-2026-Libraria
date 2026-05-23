package com.libraria.models;

public class Buku {
    private String title;
    private String author;
    private String genre;
    private String category;
    private String status;
    
    public Buku(String title, String author, String genre, String category) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.category = category;
        this.status = "Tersedia";
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public String getCategory() {
        return category;
    }
    public String getStatus() {
        return status;
    }
}
