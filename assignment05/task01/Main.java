package assignment05.task01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    // task01. Подсчитать количество искомого слова, через map (наполнением
    // значение,
    // где искомое слово будет являться ключом), вносить все слова не нужно.
    // Пример: Россия идет вперед всей планеты. Планета — это не Россия.
    // Запрос: Россия
    // Ответ: Россия-2

    public static void main(String[] args) {
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";

        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово для поиска: ");
        String word = in.nextLine();
        in.close();

        str = str.replaceAll("\\p{IsPunctuation}", "");
        Map<String, Integer> mp = new HashMap<>();

        String[] sl = str.split(" ");

        for (int i = 0; i < sl.length; i++) {
            if (sl[i] != "") {
                if (mp.containsKey(sl[i])) {
                    mp.put(sl[i], mp.get(sl[i]) + 1);
                } else {
                    mp.put(sl[i], 1);
                }
                // mp.putIfAbsent(sl[i], 0);
                // mp.put(sl[i], mp.get(sl[i]) + 1); //TO DO: mp.get() returns null???
            }
        }

        if (mp.containsKey(word)) {
            System.out.println(word + " - " + mp.get(word));
        } else {
            System.out.println("Слово не найдено. Проверьте орфографию и регистр.");
        }

    }
}
