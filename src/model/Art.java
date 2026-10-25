package model;

public class Art extends Item {
    public Art(String itemId, String name, double startingPrice) {
        super(itemId, name, startingPrice);
    }
    @Override
    public String getCategory() {
        return "Nghe thuat";
    }
}