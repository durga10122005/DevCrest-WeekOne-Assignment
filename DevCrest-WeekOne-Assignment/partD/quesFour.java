package partD;
// Program: Reverse a number and check if it is a palindrome.
// Author: Durga Singh(25bcon0848)
import java.util.Scanner;
public class quesFour {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            // Taking input
            System.out.print("Enter the number: ");
            int N = sc.nextInt();
            // Calculation / Logic
            int n=N, M, a, b=0;
            while(N>0){
                M = N%10;
                N = N/10;
                a = M + b*10;
                b = a;
            }
            // Giving output
            System.out.printf("The reverse of %d is %d.", n, b);
            if(n==b){
                System.out.printf(" Therefore, %d is a palindrome.%n", n);
            }
            else{
                System.out.printf(" Therefore, %d is not a palindrome.%n", n);
            }
        }
    }
}
