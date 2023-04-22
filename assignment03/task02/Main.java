package assignment03.task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * task02. Сведения о товаре состоят из
     * наименования, страны-производителя, веса, цены, сорта.
     * Получить наименования товаров заданного сорта с наименьшей
     * ценой.
     */
    public static void main(String[] args) {

        List<Product> pList = SetProdList();
        System.out.println();
        System.out.println(pList);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String searchString = sc.nextLine();

        List<String> prodList = GetProductsWithMinPriceList(pList, searchString);
        if (prodList.size() != 0) {
            System.out.println(prodList);
        } else {
            System.out.println("Введённый сорт продукта не найден.");
        }

        sc.close();
    }

    public static List<Product> SetProdList() {
        Product pr1 = new Product("Product9", "CountryA", 300, 2, 20.0);
        Product pr2 = new Product("Product03", "CountryZ", 105, 3, 15.5);
        Product pr3 = new Product("Product02", "CountryQ", 499, 1, 42.0);
        Product pr4 = new Product("Product07", "CountryZ", 570, 1, 25.8);
        Product pr5 = new Product("Product03", "CountryZ", 171, 2, 12.9);
        Product pr6 = new Product("Product15", "CountryA", 172, 2, 22.3);
        Product pr7 = new Product("Product04", "CountryQ", 421, 1, 18.0);
        Product pr8 = new Product("Product07", "CountryA", 349, 1, 16.5);
        Product pr9 = new Product("Product08", "CountryA", 78, 3, 33.0);
        Product pr10 = new Product("Product16", "CountryZ", 82, 3, 21.9);
        Product pr11 = new Product("Product08", "CountryQ", 233, 2, 37.0);
        Product pr12 = new Product("Product12", "CountryZ", 349, 1, 19.1);
        Product pr13 = new Product("Product33", "CountryB", 171, 2, 12.9);

        List<Product> pl = new ArrayList<>();
        pl.add(0, pr1);
        pl.add(1, pr2);
        pl.add(2, pr3);
        pl.add(3, pr4);
        pl.add(4, pr5);
        pl.add(5, pr6);
        pl.add(6, pr7);
        pl.add(7, pr8);
        pl.add(8, pr9);
        pl.add(9, pr10);
        pl.add(10, pr11);
        pl.add(11, pr12);
        pl.add(12, pr13);

        return pl;
    }

    public static List<String> GetProductsWithMinPriceList(List<Product> pl, String searchString) {
        List<String> mpl = new ArrayList<>();
        Integer minPrice = -1;
        for (int i = 0; i < pl.size(); i++) {
            if (pl.get(i).qualityRate.equals(Integer.parseInt(searchString))) {
                if (minPrice == -1) {
                    minPrice = pl.get(i).prodPrice;
                    mpl.add(pl.get(i).prodName);
                } else if (pl.get(i).prodPrice < minPrice) {
                    minPrice = pl.get(i).prodPrice;
                    mpl.clear();
                    mpl.add(pl.get(i).prodName);
                } else if (pl.get(i).prodPrice.equals(minPrice)) {
                    mpl.add(pl.get(i).prodName);
                }
            }
        }
        return mpl;
    }
}
