package partB;
// Program: Calculate area and perimeter of:- Rectangle(length,breath)- Circle(radius)
// Author: Durga Singh(25bcon0848)
import java.util.Scanner;
public class quesTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Taking user input for rectangle
        System.out.println("For calculating the area and perimeter of rectangle:-");
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breath: ");
        double breath = sc.nextDouble();
        // Calculating for rectangle
        double rectangle_peri = 2*(length + breath), rectangle_area = length*breath;
        // Output for rectangle
        System.out.printf("The perimeter of rectangle is %.2f cm and the area of rectangle is %.2f cm².%n", rectangle_peri, rectangle_area);
        // Taking input for circle
        System.out.println("For calculating the area and perimeter of circle:-");
        System.out.print("Enter the radius of circle: ");
        double rad = sc.nextDouble();
        // Calculating for circle
        double circle_peri = 2*Math.PI*rad, circle_area = Math.PI*Math.pow(rad,2);
        // Output for circle
        System.out.printf("The perimeter of the circle is %.2f cm and the area of circle is %.2f cm²%n", circle_peri, circle_area);

        sc.close();
    }
}
