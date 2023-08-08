package lecture4;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        triangleBuild();
    }

    public static void triangleBuild(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side A");
        int sideA = scanner.nextInt();
        System.out.println("Enter side B");
        int sideB = scanner.nextInt();
        System.out.println("Enter side C");
        int sideC = scanner.nextInt();

        int sumOfSides = sideA + sideB + sideC;
        if(sumOfSides != 180){
            System.out.println("The triangle cannot be built");
        } else if (sideA == 60 && sideB == 60 && sideC == 60) {
            System.out.println("The triangle's type is Equilateral");
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            System.out.println("The triangle's type is Isosceles");
        } else if(sideA == 90 && sideB == 90 && sideC == 90){
            System.out.println("The triangle's type is Right-Angled");
        }
        else if(sideA < 90 && sideB < 90 && sideC < 90){
            System.out.println("The triangle's type is Acute");
        }  else if (sideA > 90 && sideB > 90 && sideC > 90) {
            System.out.println("The triangle's type is Obtuse");
        }  else {
            System.out.println("The triangle's type is Multifaceted");
        }


    }

    public static void daysOfTheWeekBasedOnNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7");
        byte input = scanner.nextByte();
        String[] array = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        switch (input){
            case 1:
                System.out.println("The " + input + "st day of the week is " + array[0]);
                break;
            case 2:
                System.out.println("The " + input + "nd day of the week is " + array[1]);
                break;
            case 3:
                System.out.println("The " + input + "rd day of the week is " + array[2]);
                break;
            case 4:
                System.out.println("The " + input + "th day of the week is " + array[3]);
                break;
            case 5:
                System.out.println("The " + input + "th day of the week is " + array[4]);
                break;
            case 6:
                System.out.println("The " + input + "th day of the week is " + array[5]);
                break;
            case 7:
                System.out.println("The " + input + "th day of the week is " + array[6]);
                break;
            default:
                System.out.println("The number you have entered is invalid");
        }
    }

    public static void ageEligibility(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        byte input = scanner.nextByte();

        if(input >= 16){
            System.out.println("You are eligible to work");
        } else {
            System.out.println("You are not eligible to work");
        }
    }
    public static void revenueCalculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter unit price");
        int unitPrice = scanner.nextInt();
        System.out.println("Enter quantity");
        int quantity = scanner.nextInt();

        if(quantity >= 100 && quantity <= 120){
            double discount = (unitPrice * quantity) * 0.15;
            double saleRevenue = (unitPrice * quantity) - discount;
            System.out.println("The revenue from sale: " + saleRevenue);
            System.out.println("Discount: " + discount + " (15.0%)");
        } else if(quantity > 120){
            double discount = (unitPrice * quantity) * 0.20;
            double saleRevenue = (unitPrice * quantity) - discount;
            System.out.println("The revenue from sale: " + saleRevenue);
            System.out.println("Discount: " + discount + " (20.0%)");
        } else {
            double saleRevenue = (unitPrice * quantity);
            System.out.println("The revenue from sale: " + saleRevenue);
            System.out.println("Discount: 0");
        }


    }

    public static void largestNumber(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int largestNumber = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] > largestNumber)
                largestNumber = array[i];
        }
        System.out.println("The largest number is: " + largestNumber);
    }

    public static void vacationType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of vacation would you like to go on? ");
        String vacationType = scanner.nextLine();
        switch (vacationType){
            case "Beach":
                System.out.println("Please enter your budget per person");
                int budgetBeach = scanner.nextInt();
                if(budgetBeach < 50){
                    System.out.println("We recommend Bulgaria as a destination");
                } else {
                    System.out.println("We recommend Outside Bulgaria as a destination");
                }
                break;
            case "Mountain":
                System.out.println("Please enter your budget per person");
                int budgetMountain = scanner.nextInt();
                if(budgetMountain < 30) {
                    System.out.println("We recommend Bulgaria as a destination");
                } else {
                    System.out.println("We recommend Outside Bulgaria as a destination");
                }
                break;
            default:
                System.out.println("There is no information about this type of vacation");
        }
    }

    public static void divisibleBy5(){
        int[] list = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int number;
        for(int i = 0; i < list.length; i++){
            number = list[i];
            if( (number % 5) == 0){
                System.out.println(number);
                if(number > 150){
                    break;
                }
            }

        }
    }
    public static void reverseList(){
        int[] list = {10, 20,30, 40, 50};
        for(int i = list.length - 1; i >= 0; i--){
            System.out.println(list[i]);
        }
    }
}