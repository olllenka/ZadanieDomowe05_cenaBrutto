public class Main {
    public static void main(String[] args) {
        Category cat1 = new Category("Pieczywo");
        Category cat2 = new Category("Materiały budowlane");
        Category cat3 = new Category("Elektronika");

        Product prod1 = new Product("Bułka", 1.5, cat1);
        Product prod2 = new Product("Farba", 72.4, cat2);
        Product prod3 = new Product("Monitor", 1450.9, cat3);

        GrossPrice gp = new GrossPrice();

        double grossPrice1 = gp.calcGrossPrice(prod1);
        double grossPrice2 = gp.calcGrossPrice(prod2);
        double grossPrice3 = gp.calcGrossPrice(prod3);

        prod1.showGrossPrice(grossPrice1);
        prod2.showGrossPrice(grossPrice2);
        prod3.showGrossPrice(grossPrice3);
    }
}
