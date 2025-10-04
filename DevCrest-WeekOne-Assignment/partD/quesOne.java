package partD;
// Program: Print the multiplication table of a number.
// Author: Durga Singh(25bcon0848)
import java.util.Scanner;
public class quesOne {
    public static void main(String[] args){
        // Taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        sc.close();
        // Giving output
        System.out.println("# Table of " + N + " #");
        int i,a;
        for(i=1;i<=10;i++){
            // Calculating
            a = i*N;
            System.out.printf("%d X %d = %d%n", N, i, a);
        }
        
    }
}
