package assignment01.task01;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/*
 * task01
 * 
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will
 * be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 * Note that s may contain leading or trailing spaces or multiple spaces between
 * two words.
 * The returned string should only have a single space separating the words. Do
 * not include any extra spaces.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println();
        reverseSentence("the sky is blue");

        System.out.println();
        reverseSentence("  hello world  ");

        System.out.println();
        reverseSentence("a good   example");
        System.out.println();

    }

    /**
     * 
     * @param s - строка, в которой необходимо поменять порядок слов на обратный
     * @return null
     */
    public static Void reverseSentence(String s) {
        String[] words = s.split(" ");
        List<String> collection = new ArrayList<>(
                Arrays.asList(words));
        collection.removeAll(Arrays.asList(""));

        for (int i = collection.size() - 1; i >= 0; i--) {
            System.out.print(collection.get(i) + " ");
        }

        return null;
    }

}