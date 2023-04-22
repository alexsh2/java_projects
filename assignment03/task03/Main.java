package assignment03.task03;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * task3. Сведения о книге состоят из
     * названия, фамилии автора, цены, года издания и количества страниц.
     * Найти названия книг, в которых
     * простое количество страниц, фамилия автора содержит «А» и год издания после
     * 2010 г, включительно.
     */
    public static void main(String[] args) {

        List<Book> books = SetBookList();
        System.out.println();
        System.out.println(books);
        System.out.println();

        List<String> titles = GetTitles(books);
        System.out.println();
        System.out.println(titles);
        System.out.println();
    }

    /**
     * Метод создаёт коллекцию типа Book
     * 
     */
    public static List<Book> SetBookList() {
        Book book1 = new Book("Book1", "Green", 25.50, 1980, 211);
        Book book2 = new Book("Book2", "Apple", 35.50, 2022, 199);
        Book book3 = new Book("Book3", "Black", 27.00, 1981, 180);
        Book book4 = new Book("Book4", "Gray", 13.59, 1987, 223);
        Book book5 = new Book("Book5", "Anderson", 45.80, 1999, 157);
        Book book6 = new Book("Book6", "Alexander", 19.00, 2013, 199);
        Book book7 = new Book("Book7", "Blue", 38.50, 2012, 120);
        Book book8 = new Book("Book8", "White", 25.77, 2015, 167);
        Book book9 = new Book("Book9", "Array", 23.10, 2010, 311);
        Book book10 = new Book("Book10", "Tutor", 16.50, 1980, 149);
        Book book11 = new Book("Book11", "Allen", 28.45, 2011, 499);
        Book book12 = new Book("Book12", "Green", 15.73, 1999, 235);

        List<Book> bl = new ArrayList<>();

        bl.add(book1);
        bl.add(book2);
        bl.add(book3);
        bl.add(book4);
        bl.add(book5);
        bl.add(book6);
        bl.add(book7);
        bl.add(book8);
        bl.add(book9);
        bl.add(book10);
        bl.add(book11);
        bl.add(book12);

        return bl;
    }

    /**
     * Метод возвращает список названий книг у которых:
     * 1. Фамилия автора содержит "А";
     * 2. Год издания после 2010-го;
     * 3. Количество страниц является простым числом
     * 
     * @param bl -> List<Book>
     * 
     */
    public static List<String> GetTitles(List<Book> bl) {
        List<String> tList = new ArrayList<>();
        for (int i = 0; i < bl.size(); i++) {
            if (bl.get(i).author.contains("A") && bl.get(i).year > 2010) {
                if (IsPrime(bl.get(i).pages)) {
                    tList.add(bl.get(i).title);
                }
            }
        }

        return tList;
    }

    /**
     * Метод проверяет, является ли целое число простым
     * 
     * @param num -> Integer
     * @return result -> Boolean
     */
    public static Boolean IsPrime(Integer num) {
        Boolean result = true;
        int m = num / 2;
        if (num != 0 && num != 1) {
            for (int i = 2; i <= m; i++) {
                if (num % i == 0) {
                    result = false;
                    return result;
                }
            }
        }
        return result;
    }
}
