package L4;

import java.util.Scanner;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list= new LinkedList<>();
        boolean work = true;
        while(work){
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("print")){
                for (int i = list.size() - 1; i >= 0; i--) {
                    System.out.println(list.get(i));
            } 
            System.out.println(list);
            } else if (line.equalsIgnoreCase("revert") && list.size() > 0){
                list.removeLast();
            System.out.println(line);
            } else {
                list.add(line);
                System.out.println(line);
            }
            
        }

    }
}
