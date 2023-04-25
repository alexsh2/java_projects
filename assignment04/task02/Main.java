package assignment04.task02;

import java.util.Stack;

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
        String str = "(abc]d}f";
        Integer result = validateStringForBrackets(str);
        if (result == 0 || result > 1) {
            System.out.println("Input string is valid.");
        } else {
            System.out.println("Input string is invalid.");
        }

    }

    public static Integer validateStringForBrackets(String str) {
        Integer res1 = checkClosedBraces(str, "{");
        if (res1 == 1) {
            System.out.println("Check curly brackets '{}'");
        }
        Integer res2 = checkClosedBrackets(str, "]");
        if (res2 == 1) {
            System.out.println("Check square brackets '[]'");
        }
        Integer res3 = checkClosedParentheses(str, "(");
        if (res3 == 1) {
            System.out.println("Check round brackets '()'");
        }

        if (res1 == 1 || res2 == 1 || res3 == 1) {
            res1 = 1;
        }
        return res1;
    }

    public static Integer checkClosedBraces(String str, String s) {

        String s1 = "";
        Integer count1 = 0;
        Integer count2 = 0;
        Integer index = 0;

        if (s.equals("{")) {
            s1 = "}";
        } else if (s.equals("}")) {
            s1 = "{";
        } else {
            count2 = -1;
            return count2;
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

    public static Integer checkClosedBrackets(String str, String s) {

        String s1 = "";
        Integer count1 = 0;
        Integer count2 = 0;
        Integer index = 0;

        if (s.equals("[")) {
            s1 = "]";
        } else if (s.equals("]")) {
            s1 = "[";
        } else {
            count1 = -1;
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

    public static Integer checkClosedParentheses(String str, String s) {

        String s1 = "";
        Integer count1 = 0;
        Integer count2 = 0;
        Integer index = 0;

        if (s.equals("(")) {
            s1 = ")";
        } else if (s.equals(")")) {
            s1 = "(";
        } else {
            count1 = -1;
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
