package org.example.Head02_OOP.example07;

class User {
    protected String userId;
    protected String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void printUserInfo() {
        System.out.println("ID: " + userId + " name: " + name);
    }
}

class PersonalUser extends User {
    private String email;

    public PersonalUser(String Id, String name, String email) {
        super(Id, name);
        this.email = email;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("e-mail: " + email);
    }
}

class BusinessUser extends User {
    private String email;
    private String companyName;

    public BusinessUser(String Id, String name, String email, String companyName) {
        super(Id, name);
        this.email = email;
        this.companyName = companyName;
    }

    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("e-mail: " + email);
        System.out.println("company: " + companyName);
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        User u = new PersonalUser("U001", "SJ", "jseong@example.com");
        u.printUserInfo();

        User b = new BusinessUser("U002", "KE", "kyeong@example.com", "AAAA");
        b.printUserInfo();
    }
}