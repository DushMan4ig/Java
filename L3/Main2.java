package L3;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5, 7 , 0, 2, 10, 6};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr)); //Метод asList преобразуюет массив в лист
        list.sort(null); // Метод для сортировки листа
        System.out.println(list);
    }
}
