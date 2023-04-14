package assignment01.task02;

import java.util.Scanner;

/*
 * task02
 * 
 * Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
 * Пример ввода:
 * 1 2 1 2 -1 1 3 1 3 -1 0
 * Логика расчета:
 * 2 -1 переход -> 2 в сумму
 * 3 -1 переход -> 3 в сумму
 * Пример вывода: 5
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Сумма: " + sum(scan));
    }

    /**
     * 
     * @param num  -> количество целых чисел в последовательности. Вводится с
     *             клавиатуры.
     * @param scan
     * @return int sum -> сумма положительных чисел, после которых следует
     *         отрицательное
     *         число
     */
    public static int sum(Scanner scan) {
        int sum = 0;
        System.out.println();
        System.out.print("Введите целое число: ");
        int n1 = scan.nextInt();
        if (n1 != 0) {
            int n2 = 1;
            while (n2 != 0) {
                System.out.print("Введите следующее целое число: ");
                n2 = scan.nextInt();
                if (n2 != 0) {
                    if (n1 > 0 && n2 < 0) {
                        sum += n1;
                    }
                    n1 = n2;
                }
            }
        }
        System.out.println();
        return sum;
    }

}
