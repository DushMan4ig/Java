package L2;

public class main {
    public static void main(String[] args){
        char c1 = 'A';
        char c2 = 'B';
        int n = 12;
        System.out.println(luboe(c1, c2, n));
    }
    static String luboe(char c1, char c2, int n){
        StringBuilder new_string = new StringBuilder();
    for (int i = 0; i < n / 2; i++) {
        new_string.append(c1);
        new_string.append(c2);
    }
    return new_string.toString();
    }
}
