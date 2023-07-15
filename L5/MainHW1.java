import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainHW1 {
     public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
                "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов"
        );

        // Создаем TreeMap для хранения и сортировки по убыванию количества повторений имен
        Map<String, Integer> nameCounts = new TreeMap<>(Collections.reverseOrder());

        // Подсчитываем количество повторений имен
        for (String employee : employees) {
            nameCounts.put(employee, nameCounts.getOrDefault(employee, 0) + 1);
        }

        // Выводим результаты
        System.out.println("Повторяющиеся имена с количеством повторений (отсортированные по убыванию популярности):");
        for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
