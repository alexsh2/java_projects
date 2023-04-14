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
        System.out.println();
        System.out.println("Введите количество чисел в последовательности: ");

        int num = scan.nextInt();
        System.out.println("Сумма: " + sum(num, scan));
    }

    public static int sum(int num, Scanner scan) {
        int sum = 0;
        System.out.println("Введите 1-e целое число: ");
        int n1 = scan.nextInt();
        for (int i = 1; i < num; i++) {
            System.out.printf("Введите %s-e целое число: \n", i + 1);
            int n2 = scan.nextInt();
            if (n1 > 0 && n2 < 0) {
                sum += n1;
            }
            n1 = n2;
        }
        return sum;
    }
}
