// Вывести все простые числа от 1 до 1000
package L1;

public class Main_home2 {
    public static void main(String[] args) {
        System.out.println("Простые числа от 1 до 1000:");
        
        for (int number = 2; number <= 1000; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
