package L1;

import java.util.Scanner;

public class Main_home3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Выберите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double result = 0;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Некорректная операция");
                break;
        }
        
        System.out.println("Результат: " + result);
        
        scanner.close();
    }
}
