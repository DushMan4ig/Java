package L3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainHomework1 {
    public static void main(String[] args) {
        // Создаем исходный список целых чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(12);
        numbers.add(1);

        // Находим минимальное значение
        int min = Collections.min(numbers);
        System.out.println("Минимальное значение: " + min);

        // Находим максимальное значение
        int max = Collections.max(numbers);
        System.out.println("Максимальное значение: " + max);

        // Находим среднее арифметическое
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.size();
        System.out.println("Среднее арифметическое: " + average);
    }
}

