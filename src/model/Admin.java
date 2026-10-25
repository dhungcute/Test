package model;

public class Admin extends User {
    public Admin(String id, String username) {
        super(id, username);
    }
    @Override
    public void displayRole() {
        System.out.println("Toi la Quan tri vien (Admin). Ten tai khoan: " + getUsername());
    }
    public void banUser(User user) {
        System.out.println("Da cam tai khoan: " + user.getUsername());
    }
}