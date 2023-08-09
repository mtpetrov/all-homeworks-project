package lecture7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number ");
        int num2 = scanner.nextInt();
        System.out.println("Result after division:" + divideNumbers(num1, num2));
    }

    public static double divideNumbers(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            throw new RuntimeException("You cannot divide by 0");
        }
    }
}

