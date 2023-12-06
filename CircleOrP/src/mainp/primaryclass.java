package mainp;

import java.util.Scanner;

public class primaryclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 for Circle or 2 for Pyramid:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                calculateCircle(radius);
                
                break;

            case 2:
                System.out.println("Enter the length, width, and height of the pyramid:");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();
                calculatePyramid(length, width, height);
                
                break;

            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }

    private static void calculateCircle(double radius) {
        double CircleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + CircleArea);

        double Circumference = 2 * Math.PI * radius;
        System.out.println("The circumference of the circle is: " + Circumference);
    }

    private static void calculatePyramid(double length, double width, double height) {
        double BaseArea = length * width;
        System.out.println("The area of the base is: " + BaseArea);

        double Pvolume = (length * width * height) / 3.0;
        System.out.println("The volume is: " + Pvolume);
    }
}



