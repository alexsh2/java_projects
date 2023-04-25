package assignment04.task01;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    /**
     * task01.
     * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * Пример:
     * 1->2->3->4
     * Вывод:
     * 4->3->2->1
     *
     */
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        int lSize = ll.size();
        System.out.println();
        for (int i = 0; i < lSize; i++) {
            System.out.print(ll.peekLast() + " ");
            ll.removeLast();
        }
        System.out.println();
    }
}
