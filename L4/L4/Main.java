package L4;

import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        LinkedList list2 = new LinkedList();
        long timeStart = System.currentTimeMillis();// Метод возвращающий количество секунд
        for (int i = 0; i < 1000000; i++) {
            list1.add(i);

        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
}
