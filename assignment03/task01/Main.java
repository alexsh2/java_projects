package assignment03.task01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * task01 Дан массив записей: наименование товара, цена, сорт.
     * Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
     * название которых содержит «высший».
     */
    public static void main(String[] args) {
        Product pr1 = new Product("Пирожок", 100, 2);
        Product pr2 = new Product("Пирожок - высший класс", 250, 2);
        Product pr3 = new Product("Пирожок как у бабушки", 150, 1);
        Product pr4 = new Product("Пирожок - лучше, чем высший класс", 327, 1);
        Product pr5 = new Product("Пирожок с мясом", 170, 1);
        Product pr6 = new Product("Пирожок с брусникой", 150, 1);
        Product pr7 = new Product("Пирожок - высший вкус", 153, 1);
        Product pr8 = new Product("Пирог - высший кайф", 150, 2);

        List<Product> productList = new ArrayList<>();
        productList.add(0, pr1);
        productList.add(0, pr2);
        productList.add(0, pr3);
        productList.add(0, pr4);
        productList.add(0, pr5);
        productList.add(0, pr6);
        productList.add(0, pr7);
        productList.add(0, pr8);
        System.out.println();
        System.out.println(productList);
        System.out.println();
        Integer maxPrice1 = 0, maxPrice2 = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).prodName.contains("высший")) {
                if (productList.get(i).qualityRate.equals(1) && productList.get(i).prodPrice > maxPrice1) {
                    maxPrice1 = productList.get(i).prodPrice;
                } else if (productList.get(i).qualityRate.equals(2) && productList.get(i).prodPrice > maxPrice2) {
                    maxPrice2 = productList.get(i).prodPrice;
                }
            }
        }
        System.out
                .println("Максимальная цена товара 1-го сорта, содержащего слово \"высший\" в названии: " + maxPrice1);
        System.out
                .println("Максимальная цена товара 2-го сорта, содержащего слово \"высший\" в названии: " + maxPrice2);
    }
}