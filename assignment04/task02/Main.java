package assignment04.task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    /**
     * Given a string s containing just the characters '(', ')', '{', '}',
     * '[' and ']', determine if the input string is valid.
     * 
     * An input string is valid if:
     * - Open brackets must be closed by the same type of brackets.
     * - Open brackets must be closed in the correct order.
     * - Every close bracket has a corresponding open bracket of the same type.
     * 
     * Example 1:
     * Input: s = "()"
     * Output: true
     * 
     * Example 2:
     * Input: s = "()[]{}"
     * Output: true
     * 
     * Example 3:
     * Input: s = "(]"
     * Output: false
     */
    public static void main(String[] args) {
        String str = "(ab{[c]d}f)";
        Integer result = validateStringForBrackets(str);
        if (result == 0 || result > 1) {
            System.out.println("Input string is valid.");
        } else {
            System.out.println("Input string is invalid.");
        }

    }

    /**
     * Метод:
     * - создаёт коллекцию скобок
     * - вызывает метод checkClosedBrackets(String str, String s)
     * - возвращает Integer как результат проверки:
     * ....0 или >1 - строка валидна
     * ....1 - строка невалидна
     * 
     * @param str -> проверяемая строка
     * @return
     */
    public static Integer validateStringForBrackets(String str) {
        Integer res = 0;
        Integer flag = 0;
        // List<String> brackets = Arrays.asList("{", "[", "(");
        List<String> brackets = Collections.unmodifiableList(
                new ArrayList<String>() {
                    {
                        add("{");
                        add("[");
                        add("(");
                    }
                });
        for (String bracket : brackets) {
            res = checkClosedBrackets(str, bracket);
            if (res == 1) {
                System.out.println("Check brackets '" + bracket + "'");
                flag = -1;
            }
        }
        if (flag == -1) {
            res = 1;
        }
        return res;
    }

    /**
     * Метод проверяет строку на наличие закрытых скобок "{}, [], ()".
     * В случае отрицательного результата возвращает '1'.
     * 
     * @param str -> проверяемая строка
     * @param s   -> проверяемая скобка
     * @return
     */
    public static Integer checkClosedBrackets(String str, String s) {

        String s1 = "";
        Integer count1 = 0;
        Integer count2 = 0;
        Integer index = 0;

        if (s.equals("{")) {
            s1 = "}";
        } else if (s.equals("}")) {
            s1 = "{";
        } else if (s.equals("[")) {
            s1 = "]";
        } else if (s.equals("]")) {
            s1 = "[";
        } else if (s.equals("(")) {
            s1 = ")";
        } else if (s.equals(")")) {
            s1 = "(";
        }

        while ((index = str.indexOf(s, index)) != -1) {
            count1++;
            index++;
        }
        index = 0;
        while ((index = str.indexOf(s1, index)) != -1) {
            count2++;
            index++;
        }

        if (count1 == count2) {
            count1 += count2;
        } else {
            count1 = 1;
        }
        return count1;
    }
}
