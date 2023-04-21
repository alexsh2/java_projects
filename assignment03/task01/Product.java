package assignment03.task01;

public class Product {

    String prodName;
    Integer prodPrice;
    Integer qualityRate;

    public Product(String prodName, Integer prodPrice, Integer qualityRate) {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.qualityRate = qualityRate;
    }

    @Override
    public String toString() {
        return "Product [prodName=" + prodName + ", prodPrice=" + prodPrice + ", qualityRate=" + qualityRate + "]";
    }

}
