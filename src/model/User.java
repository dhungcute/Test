package model;

public abstract class User {
    private String id;
    private String username;

    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }
    public String getUsername() { return username; }

    public abstract void displayRole();
}