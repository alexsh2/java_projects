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

        List<Product> pList = SetProdList();
        System.out.println();
        System.out.println(pList);
        System.out.println();

        List<Integer> maxPriceList = GetMaxPrice(pList, "высший");
        System.out
                .println("Максимальная цена товара 1-го сорта, содержащего слово \"высший\" в названии: "
                        + maxPriceList.get(0));
        System.out
                .println("Максимальная цена товара 2-го сорта, содержащего слово \"высший\" в названии: "
                        + maxPriceList.get(1));
    }

    /**
     * Метод создаёт List<Product>
     * 
     * @return List<Product>
     */
    public static List<Product> SetProdList() {
        Product pr1 = new Product("Пирожок", 100, 2);
        Product pr2 = new Product("Пирожок - высший класс", 250, 2);
        Product pr3 = new Product("Пирожок как у бабушки", 150, 1);
        Product pr4 = new Product("Пирожок - лучше, чем высший класс", 327, 1);
        Product pr5 = new Product("Пирожок с мясом", 170, 1);
        Product pr6 = new Product("Пирожок с брусникой", 150, 1);
        Product pr7 = new Product("Пирожок - высший вкус", 153, 1);
        Product pr8 = new Product("Пирог - высший кайф", 150, 2);

        List<Product> pl = new ArrayList<>();
        pl.add(0, pr1);
        pl.add(1, pr2);
        pl.add(2, pr3);
        pl.add(3, pr4);
        pl.add(4, pr5);
        pl.add(5, pr6);
        pl.add(6, pr7);
        pl.add(7, pr8);

        return pl;
    }

    /**
     * Метод возвращает коллекцию максимальных цен товаров 1го или 2го сорта среди
     * товаров, название которых содержит searchString.
     * 
     * @param pl
     * @param searchString
     * @return
     */
    public static List<Integer> GetMaxPrice(List<Product> pl, String searchString) {
        List<Integer> mpl = new ArrayList<>();
        Integer maxPrice1 = 0, maxPrice2 = 0;
        for (int i = 0; i < pl.size(); i++) {
            if (pl.get(i).prodName.contains("высший")) {
                if (pl.get(i).qualityRate.equals(1) && pl.get(i).prodPrice > maxPrice1) {
                    maxPrice1 = pl.get(i).prodPrice;
                } else if (pl.get(i).qualityRate.equals(2) && pl.get(i).prodPrice > maxPrice2) {
                    maxPrice2 = pl.get(i).prodPrice;
                }
            }
        }
        mpl.add(0, maxPrice1);
        mpl.add(1, maxPrice2);
        return mpl;
    }
}