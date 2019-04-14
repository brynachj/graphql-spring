package com.brynachj.graphqlspring;

public class Post {

    private String id;
    private String title;
    private String category;
    private String text;
    private String author;

    public Post(String id, String title, String category, String text, String author) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.text = text;
        this.author = author;
    }
}
