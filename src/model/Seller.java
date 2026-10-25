package model;

public class Seller extends User {
    public Seller(String id, String username) {
        super(id, username);
    }
    @Override
    public void displayRole() {
        System.out.println("Toi la Nguoi ban (Seller). Ten tai khoan: " + getUsername());
    }
    public void createAuction(Item item) {
        System.out.println(getUsername() + " vua tao phien dau gia cho: " + item.getName());
    }
}