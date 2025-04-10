package DesignPatterns.CreationalPatterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Book implements Prototype {
    String title;
    String author;
    List<String> tags;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.tags = new ArrayList<>();
    }
    public void addTag(String tag){
        this.tags.add(tag);
    }
    public void showDetails(){
        System.out.println("Title: " + title + " , Author: " + author +  " , Tags: " + tags);
    }

    @Override
    public Prototype cloneBook() {
        Book clonedBook = new Book(title, author);
        for(String tag : tags){
            clonedBook.addTag(tag);
        }
        return clonedBook;
    }
}
