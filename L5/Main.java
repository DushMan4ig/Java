
public class Main {
    public static void main(String[] args) {
        Pasports pasports = new Pasports();
        pasports.addNote("123456", "Иванов");
        pasports.addNote("321312", "Иванов");
        pasports.addNote("341412", "Петров");
        pasports.addNote("421412", "Иванов");
        pasports.addNote("423212", "Круглов");
        pasports.addNote("121345", "Лолов");
        
        System.out.println(pasports.findByName("Иванов"));
    }
}