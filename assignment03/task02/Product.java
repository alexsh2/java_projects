package assignment03.task02;

public class Product {
    String prodName;
    String country;
    Integer prodPrice;
    Integer qualityRate;
    Double prodWeight;

    public Product(String prodName, String country, Integer prodPrice, Integer qualityRate, Double prodWeight) {
        this.prodName = prodName;
        this.country = country;
        this.prodPrice = prodPrice;
        this.qualityRate = qualityRate;
        this.prodWeight = prodWeight;
    }

    @Override
    public String toString() {
        return "Product [prodName=" + prodName + ", country=" + country + ", prodPrice=" + prodPrice + ", qualityRate="
                + qualityRate + ", prodWeight=" + prodWeight + "]";
    }
}
