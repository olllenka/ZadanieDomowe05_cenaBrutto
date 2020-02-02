public class Product {
    private String name;
    private String description;
    private double netPrice;
    private Category category;

    public Product() {
    }

    public Product(String name, double netPrice, Category category) {
        this.name = name;
        this.netPrice = netPrice;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void showGrossPrice(double grossPrice){
        String grossPriceStr = String.format("%.2f", grossPrice);
        System.out.println("Produkt: " + name + "\nKategoria: " + category.getName() + "\nCena netto: " + netPrice + "\nCena brutto: " + grossPriceStr);
    }


}
