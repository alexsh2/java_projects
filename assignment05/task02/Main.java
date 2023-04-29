package assignment05.task02;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    // task02. Дан список сотрудников.
    // Написать программу, которая найдёт и выведет повторяющиеся
    // имена с количеством повторений.
    // Отсортировать по убыванию популярности.

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Иван Иванов");
        list.add("Светлана Петрова");
        list.add("Кристина Белова");
        list.add("Анна Мусина");
        list.add("Анна Крутова");
        list.add("Иван Юрин");
        list.add("Петр Лыков");
        list.add("Павел Чернов");
        list.add("Петр Чернышов");
        list.add("Мария Федорова");
        list.add("Марина Светлова");
        list.add("Мария Савина");
        list.add("Мария Рыкова");
        list.add("Марина Лугова");
        list.add("Анна Владимирова");
        list.add("Иван Мечников");
        list.add("Петр Петин");
        list.add("Иван Ежов");

        Map<String, Integer> tm = new TreeMap<>();
        for (String l : list) {
            String[] sl = l.split(" ", 2);

            tm.putIfAbsent(sl[0], 0);
            tm.put(sl[0], tm.get(sl[0]) + 1);
        }

        tm = tm.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));

        tm.entrySet().forEach(System.out::println);
    }

}
