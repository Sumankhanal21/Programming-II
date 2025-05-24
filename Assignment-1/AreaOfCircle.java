//2. Find the area of a circle.
import java.util.Scanner;
public class AreaOfCircle {
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double area,radius;
    System.out.println("Enter radius :");
    radius=sc.nextDouble();
    area=(22.0/7.0)*radius*radius;
    System.out.println("Area of circle is "+area);

   }
}

