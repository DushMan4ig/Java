package FinalWork;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Final {
    private String model;
    private int ram;
    private int storage;
    private String operatingSystem;
    private String color;

    public Notebook(String model, int ram, int storage, String operatingSystem, String color) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    // Геттеры для доступа к полям
    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        // Создаем множество ноутбуков
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Asus", 8, 256, "Windows 10", "Серый"));
        notebooks.add(new Notebook("Lenovo", 16, 512, "Windows 10", "Черный"));
        notebooks.add(new Notebook("HP", 8, 512, "Windows 11", "Белый"));
        notebooks.add(new Notebook("Dell", 16, 512, "Windows 11", "Серый"));
        notebooks.add(new Notebook("Apple", 16, 512, "macOS", "Серебристый"));

        // Запрашиваем у пользователя критерии фильтрации
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int criteria = scanner.nextInt();
        Map<String, Object> filter = new HashMap<>();

        switch (criteria) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ:");
                int minRam = scanner.nextInt();
                filter.put("ram", minRam);
                break;
            case 2:
                System.out.println("Введите минимальный объем жесткого диска:");
                int minStorage = scanner.nextInt();
                filter.put("storage", minStorage);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.next();
                filter.put("operatingSystem", os);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.next();
                filter.put("color", color);
                break;
            default:
                System.out.println("Некорректный ввод.");
                scanner.close();
                return;
        }

        // Вызываем метод фильтрации и выводим результаты
        List<Notebook> filteredNotebooks = filterNotebooks(notebooks, filter);
        System.out.println("Результаты фильтрации:");
        for (Notebook notebook : filteredNotebooks) {
            System.out.println("Модель: " + notebook.getModel() + ", ОЗУ: " + notebook.getRam()
                    + ", Жесткий диск: " + notebook.getStorage() + ", ОС: " + notebook.getOperatingSystem()
                    + ", Цвет: " + notebook.getColor());
        }
        scanner.close();
    }

    // Метод для фильтрации ноутбуков по заданным критериям
    public static List<Notebook> filterNotebooks(Set<Notebook> notebooks, Map<String, Object> filter) {
        List<Notebook> result = new ArrayList<>();

        for (Notebook notebook : notebooks) {
            boolean match = true;

            for (Map.Entry<String, Object> entry : filter.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                switch (key) {
                    case "ram":
                        if (notebook.getRam() < (int) value) {
                            match = false;
                        }
                        break;
                    case "storage":
                        if (notebook.getStorage() < (int) value) {
                            match = false;
                        }
                        break;
                    case "operatingSystem":
                        if (!notebook.getOperatingSystem().equalsIgnoreCase((String) value)) {
                            match = false;
                        }
                        break;
                    case "color":
                        if (!notebook.getColor().equalsIgnoreCase((String) value)) {
                            match = false;
                        }
                        break;
                    default:
                        System.out.println("Некорректный фильтр.");
                        return result;
                }
            }

            if (match) {
                result.add(notebook);
            }
        }

        return result;
    }
}
}
