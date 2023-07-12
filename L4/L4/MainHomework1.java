package L4;

import java.util.LinkedList;
import java.util.Iterator;

public class MainHomework1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator iterator = list.iterator();

        String sum = "";
        while (iterator.hasNext()) {
            sum = sum + iterator.next();
        }
        System.out.println(sum);
    }
}
