package product.entry;

public class FoodEntry {
    private String productName, category;
    private int Price;

    public FoodEntry(String productName, String category, int Price) {
        this.productName = productName;
        this.category = category;
        this.Price = Price;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return Price;
    }
}
