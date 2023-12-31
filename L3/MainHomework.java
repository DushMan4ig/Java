package L3;
import java.util.ArrayList;
import java.util.List;

//Пусть дан произвольный список целых чисел, удалить из него четные числа

public class MainHomework {
    public static void main(String[] args) {
        // Создаем исходный список целых чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Удаляем четные числа из списка
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }

        // Выводим результат
        System.out.println("Список после удаления четных чисел:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

