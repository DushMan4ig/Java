// Во фразе "Добро пожаловать на курс Java " поменять словами местами задом наперед
package L1;

public class Main3 {
    public static void main(String[] args){
        String line = "Добро пожаловать на курс Java";
        System.out.println(reverse(line));
    }
    static String reverse(String line){
        String[] temp = line.split("");
        String res = " ";
        for (int i = temp.length - 1; i > - 1; i--) {
            res += temp[i];
            res += " ";
        }
        return res;
    }
}
