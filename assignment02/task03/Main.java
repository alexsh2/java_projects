package assignment02.task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * task03 
 * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 32, -8, 1, 73, 555, -9, 5, 77, -345 };
        System.out.println("Введённая последовательность чисел:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Изменённая последовательность чисел:");
        System.out.println(Arrays.toString(sumIndeces(arr)));
    }

    /**
     * Метод заменяет отрицательные значения в массиве целых чисел
     * на сумму индексов двузначных элементов
     * 
     * @param nums -> Массив целых чисел Integer[]
     * @return nums -> Изменённый массив целых чисел
     */
    public static Integer[] sumIndeces(Integer[] nums) {
        int sum = 0;
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                temp.add(i);
            }
            if (nums[i] > 9 && nums[i] < 100) {
                sum += i;
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            nums[temp.get(i)] = sum;
        }
        return nums;
    }
}
