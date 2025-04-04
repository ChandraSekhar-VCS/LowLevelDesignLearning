package DesignPatterns.BuilderPattern;

public class User {
    private User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
        this.gender = builder.gender;
        this.profession = builder.profession;
    }

    //REQUIRED FIELDS
    private String name;
    private String email;
    //OPTIONAL FIELDS
    private int age;
    private String phone;
    private String address;
    private String gender;
    private String profession;

    public void showDetails(){
        System.out.println("--------------------------");
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phone);
        System.out.println("Address: "+address);
        System.out.println("Gender: "+gender);
        System.out.println("Profession: "+profession);
        System.out.println("--------------------------");
    }

    static class UserBuilder{
        private String name;
        private String email;
        private int age;
        private String phone;
        private String address;
        private String gender;
        private String profession;

        public UserBuilder(String name, String email){
            this.name = name;
            this.email = email;
        }
        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
        public UserBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public UserBuilder setProfession(String profession) {
            this.profession = profession;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }
}
