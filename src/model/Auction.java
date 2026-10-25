package model;

public class Auction {
    private String auctionId;
    private Item item;
    private double currentHighestBid;
    private boolean isOpen;

    public Auction(String auctionId, Item item) {
        this.auctionId = auctionId;
        this.item = item;
        this.currentHighestBid = item.getStartingPrice();
        this.isOpen = true;
    }
    public boolean addBid(double amount) {
        if (isOpen && amount > currentHighestBid) {
            currentHighestBid = amount;
            return true;
        }
        return false;
    }
}