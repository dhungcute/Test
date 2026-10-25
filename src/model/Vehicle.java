package model;

public class Vehicle extends Item {
    public Vehicle(String itemId, String name, double startingPrice) {
        super(itemId, name, startingPrice);
    }
    @Override
    public String getCategory() {
        return "Phuong tien";
    }
}