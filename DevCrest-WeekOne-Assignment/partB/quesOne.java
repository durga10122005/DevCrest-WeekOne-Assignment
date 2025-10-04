package partB;
// Program: Swap two numbers (Without using third variable)
// Author: Durga Singh(25bcon0848)
// DevCrest Week 1 Assignment
import java.util.Scanner;
public class quesOne {
    public static void main(String[] args){
        // Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();
        // Swapping values
        a = a+b;
        b = a-b;
        a = a-b;
        // Giving output
        System.out.println("After swapping the value of A is " + a + " and the value of B is " + b + ".");
        sc.close();
    }
}
