package model;

public class Electronics extends Item {
    public Electronics(String itemId, String name, double startingPrice) {
        super(itemId, name, startingPrice);
    }
    @Override
    public String getCategory() {
        return "Dien tu";
    }
}
