package DesignPatterns.Prototype;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The One","Chandra Sekhar");
        book1.addTag("The best book ever");
        book1.addTag("The book for achievers");

        Book book2 = (Book) book1.cloneBook();
        book2.addTag("The most loved");
        book2.addTag("for the leaders");

        book1.showDetails();
        book2.showDetails();
    }
}
