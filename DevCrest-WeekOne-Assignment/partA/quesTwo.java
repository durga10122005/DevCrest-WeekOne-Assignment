package partA;
// Program: Take user name and age as input.
// Author: Durga Singh(25bcon0848)
// DevCrest Week 1 Assignment 
import java.util.Scanner;
public class quesTwo {
    public static void main( String[] args){
        // Taking user input
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        // Giving name and age in output
        System.out.println("Hello " + name + ", You are " + age + " years old!");
        sc.close();
    }
}
