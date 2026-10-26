package model;

public abstract class Item {
    private String itemId;
    private String name;
    private double startingPrice;

    public Item(String itemId, String name, double startingPrice) {
        this.itemId = itemId;
        this.name = name;
        this.startingPrice = startingPrice;
    }
    public String getName() { return name; }
    public double getStartingPrice() { return startingPrice; }

    public abstract String getCategory();
}
dkmhungcho