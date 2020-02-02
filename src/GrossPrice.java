public class GrossPrice {

    private double vatRate(String categoryName){
        double tax;
        switch(categoryName) {
            case "Pieczywo", "Owoce" -> tax=5.0;
            case "Materiały budowlane" -> tax=8.0;
            case "Elektronika" -> tax=23.0;
            default -> tax=23.0;
        }
        return tax;
    }

    public double calcGrossPrice(Product product){
        double tax = vatRate(product.getCategory().getName());
        return (tax / 100 + 1) * product.getNetPrice();
    }

}
