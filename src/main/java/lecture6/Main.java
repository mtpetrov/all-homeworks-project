package lecture6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    static int findSmallestNumber(int num1, int num2, int num3){
        int smallestNumber = num1;
        if(smallestNumber > num2){
            smallestNumber = num2;
        }
        if(smallestNumber > num3){
            smallestNumber = num3;
        }
        return smallestNumber;
    }
    static double findAverageOfThreeNumbers(double num1, double num2, double num3){
        double sumOfNumbers = num1 + num2 + num3;
        double averageNum = sumOfNumbers / 3;
        return averageNum;
    }

    static void displayMiddleCharacter(String text) {
        int textLenght = text.length();
        if(textLenght != 0 && textLenght % 2 == 0){
            int startPosition = textLenght / 2 - 1;
            System.out.println(text.charAt(startPosition));
            System.out.println(text.charAt(startPosition+1));
        } else {
            int startingPosition = textLenght / 2;
            System.out.println(text.charAt(startingPosition));
        }
    }
    static int countAllWords(String words){
        if (words == null || words.isEmpty()){
            return 0;
        }
        String[] input = words.trim().split("\\s+");
        return input.length;

    }
    static boolean isEven(int number){
        if(number % 2 == 0){
            boolean even = true;
            return even;
        } else {
            boolean notEven = false;
            return notEven;
        }
    }
    static boolean isPalindrome() {
        int remainder;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number ");

        int num = scanner.nextInt();

        if (num >= 0) {
            int palindrome = num;

            while (palindrome > 0) {
                remainder = palindrome % 10;
                sum = (sum * 10) + remainder;
                palindrome = palindrome / 10;
            }
            return num == sum;
        } else {
            System.out.println("The integer must be non-negative!");
            return false;
        }
    }
}