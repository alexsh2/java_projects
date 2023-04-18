package assignment02.task01;

/* task01
 * Дана последовательность N целых чисел. Найти сумму простых чисел. 
 */

public class Main {
    public static void main(String[] args) {

        String input = "3 5 1 8 11 12 7 4";
        String[] nums = input.split(" ");

        int sum = sumPrimeNumbers(nums);
        System.out.println("Сумма простых чисел введённой последовательности: " + sum);
    }

    /**
     * 
     * @param nums -> Массив целых чисел
     * @return sum -> Сумма простых чисел, содержащихся в массиве
     */
    public static int sumPrimeNumbers(String[] nums) {
        int m = 0, sum = 0;
        for (String num : nums) {
            int n = Integer.parseInt(num);
            int flag = 0;
            m = n / 2;
            if (n != 0 && n != 1) {
                for (int i = 2; i <= m; i++) {
                    if (n % i == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    sum += n;
                }
            }
        }
        return sum;
    }
}
