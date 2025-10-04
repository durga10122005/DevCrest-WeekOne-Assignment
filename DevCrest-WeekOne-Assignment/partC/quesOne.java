package partC;
// Program: Write the program to find the largest of 3 numbers.
// Author: Durga Singh(25bcon0848)
import java.util.Scanner;
public class quesOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input
        System.out.println("Enter the three numbers:-");
        System.out.print("Value of A: ");
        int a = sc.nextInt();
        System.out.print("Value of B: ");
        int b = sc.nextInt();
        System.out.print("Value of C: ");
        int c = sc.nextInt();
        // Finding largest number
        int largest;
        if(a>=b && a>=c){
           largest = a;
        }
        else if(b>=a && b>=c){
            largest = b;
        }
        else{
            largest = c;
        }
        // Giving output
        System.out.println("The largest number is: " + largest);
        sc.close();
    }
}
