package L2;

import java.io.FileWriter;

public class main2 {
    public static void main(String[] args) {
        int n = 100;
        String s = "TEST";
        String s1 = dublicate(s, n);
        writeToFile(s1);

    }

    static void writeToFile(String s1) {
            String filePath = "L2/test.txt";
        try(FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(s1);
            writer.flush();
            writer.close();

        } catch(Exception e){
            e.printStackTrace(); 
        }

        static String dublicate(String s, int n) {
        return s.repeat(n);
        }
    }
}
