package DesignPatterns.BuilderPattern;

public class Client {
    public static void main(String[] args) {
        User u1 = new User.UserBuilder("Chandra","vipparlachandrasekhar@gmail.com")
                .setAge(25)
                .setAddress("Bangalore India")
                .setGender("Male")
                .setProfession("Java Spring/Spring Boot Developer")
                .build();

        User u2 = new User.UserBuilder("Raja","rajasekhar@gmail.com")
                .setAge(25)
                .setAddress("Visakhapatnam India")
                .setGender("Male")
                .setPhone("7075832428")
                .build();

        u1.showDetails();
        u2.showDetails();
    }
}
