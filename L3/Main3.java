package L3;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(10);
        list.add(6);
        list.add(11);

        removeInteger(list);
        System.out.println(list);
    }

    static void removeInteger(List list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer){ //  Оператор "instanceof" определяет тип данных в листе
                list.remove(i);
            } 
        }
    }
}
