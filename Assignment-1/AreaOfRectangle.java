//* Write a Program in JAVA to: 1. Find the area of a rectangle.
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area,length,breadth;
        System.out.println("Enter the length of rectangle:");
        length = sc.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        breadth=sc.nextInt();
        area = length * breadth;
        System.out.println("Area of rectangle is: " + area);    
    }
}