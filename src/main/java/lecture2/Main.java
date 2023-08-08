package lecture2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        namesAsVariables();
        trianglePerimeter();
        triangleArea();
        minutesConverter();
    }
    public static void namesAsVariables(){
        String firstName = "Marin";
        String fathersName = "Tihomirov";
        String lastName = "Petrov";

        System.out.println(firstName + " " + fathersName + " " + lastName);
    }
    public static void trianglePerimeter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side A");
        int sideA = scanner.nextInt();
        System.out.println("Enter side B");
        int sideB = scanner.nextInt();
        System.out.println("Enter side C");
        int sideC = scanner.nextInt();
        int perimeter = sideA + sideB + sideC;

        System.out.println("The triangle's perimeter is: " + perimeter);
    }

    public static void triangleArea(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base");
        int b = scanner.nextInt();
        System.out.println("Enter height");
        int h = scanner.nextInt();
        int area = (b * h) / 2;
        System.out.println("The area of the triangle is: " + area);
    }

    public static void minutesConverter() {
        Scanner scanner = new Scanner(System.in);
        byte minutesInHour = 60;
        byte hoursInDays = 24;
        int daysInYear = 365;

        int minutesInYear = minutesInHour * hoursInDays * daysInYear;
        System.out.println("How many minutes would you like to convert? ");
        int input = scanner.nextInt();
        int years = (input / minutesInYear);
        int days = (input / minutesInHour / hoursInDays) % daysInYear;
        System.out.println(input + " minutes is approximately " + years + " years and " + days + " days");
    }


}