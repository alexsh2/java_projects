package assignment03.task04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {

    /*
     * task4. Задан целочисленный список ArrayList.
     * Найти минимальное, максимальное и среднее из этого списка.
     */

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(397, 3, 548, -56, 41, 22, -7, 84, 15, 91, 5, 724, 1);
        System.out.println();
        System.out.println(al);
        System.out.println();

        System.out.println("1. Minimum is = " + Collections.min(al));
        System.out.println("\n2. Maximum is = " + Collections.max(al));

        IntSummaryStatistics statistics = al
                .stream()
                .mapToInt(num -> num)
                .summaryStatistics();
        System.out.printf("\n3. Average is = %.2f\n", statistics.getAverage());
    }
}
