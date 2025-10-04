package partC;
// Program: Check if a given number is even or odd.
// Author: Durga Singh(25bcon0848)
import java.util.Scanner;
public class quesTwo {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // Taking input
    System.out.print("Enter the number: ");
    int N = sc.nextInt();
    // Checking even or odd and giving output
    if(N%2==0){
        System.out.println("The number is even");
    }
    else{
        System.out.println("The number is odd");
    }
    sc.close();
    }
}
