package model;

public class Bidder extends User {
    public Bidder(String id, String username) {
        super(id, username);
    }
    @Override
    public void displayRole() {
        System.out.println("Toi la Nguoi mua (Bidder). Ten tai khoan: " + getUsername());
    }
    public void placeBid(Auction auction, double amount) {
        System.out.println(getUsername() + " dang dat gia: " + amount);
    }
}
