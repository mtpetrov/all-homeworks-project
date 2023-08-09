package lecture5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    public static void sumOfArray(){
        int [] array = new int [] {1, 10, 20, 30};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of array is: " + sum);

    }
    public static void printElementsOf2dMatrix(){
        int[][] array = new int[4][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
        array[3][0] = 10;
        array[3][1] = 11;
        array[3][2] = 12;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println(array[i][j]);
            }
        }
    }

    public static void biggestElementArray(){
        int[] array = {10, 20, 30, 40};

        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if(array[i] > max)
                max = array[i];
        }
        System.out.println(max);
    }

    public static void reverseOrderLinkedList(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Coffee");
        list.add("Tea");
        list.add("Water");
        list.add("Beer");
        Iterator iterator = list.descendingIterator();
        System.out.println("Reverse order of list is:");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void sumOfTheDiagonal() {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum += array[i][i];
        }
        System.out.println("The sum of the diagonal is: " + sum);
    }

    public static void validatePalindrome(){
        String word = "anna";
        String reverse = "";
        boolean isPalindrome = false;
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) {
            isPalindrome = true;
        }

        System.out.println("The String is palindrome: " + isPalindrome);
    }
}