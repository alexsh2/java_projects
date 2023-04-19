package assignment02.task02;

/*
 * task02 
 * Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */

public class Main {
    public static void main(String[] args) {
        String input = ("-45 -37 -3 1 2 5 45 67");
        String[] nums = input.split(" ");
        boolean ans = isIncreasingSequence(nums);
        if (ans) {
            System.out.println("Введённая последовательность является возразтающей");
        } else {
            System.out.println("Введённая последовательность не является возрастающей");
        }
    }

    public static boolean isIncreasingSequence(String[] nums) {
        boolean ans = true;
        int temp = Integer.parseInt(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int n = Integer.parseInt(nums[i]);
            if (n > temp) {
                temp = n;
            } else {
                ans = false;
                return ans;
            }
        }
        return ans;
    }
}
