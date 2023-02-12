// Реылизовать простой калькулятор
package Homework1;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите 1 число: ");
        int x = iScanner.nextInt();
        Scanner iScanner2 = new Scanner(System.in);
        System.out.printf("Введите 2 число: ");
        int y = iScanner2.nextInt();
        Scanner iScanner3 = new Scanner(System.in);
        System.out.printf("Введите оператор(+, -, *, /): ");
        String z = iScanner3.nextLine();
        switch (z) {
            case "+":
                int res_sum = x + y;
                System.out.printf("%d + %d = %d. \n", x, y, res_sum);
                break;
            case "-":
                int res = x - y;
                System.out.printf("%d - %d = %d. \n", x, y, res);
                break;
            case "*":
                int res_mult = x * y;
                System.out.printf("%d * %d = %d. \n", x, y, res_mult);
                break;
            case "/":
                Float res_div = (float)x / (float)y;
                System.out.printf("%d : %d = %f. \n", x, y, res_div);
                break;
            default:
                break;
        }
    }  
}
