package L3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainHomework2 {
    public static void main(String[] args) {
        // Создаем список названий планет
        List<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Марс");
        planets.add("Земля");
        planets.add("Венера");

        // Выводим название каждой планеты и количество его повторений
        for (String planet : planets) {
            int frequency = Collections.frequency(planets, planet);
            System.out.println(planet + ": " + frequency);
        }
    }
}

