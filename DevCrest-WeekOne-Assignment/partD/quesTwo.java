package partD;
// Program: Sum of digits of a number.
// Author: Durga Singh (25bcon0848)
import java.util.Scanner;
public class quesTwo {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            // Taking input
            System.out.print("Enter the number: ");
            int N = sc.nextInt();
            // Calculation / Logic
            int a=0,b;
            while(N>0){
                b = N%10;
                N = N/10;
                a = a+b;
            }
            // Giving out put
            System.out.printf("The sum of digits is %d.%n",a);
        }
    }
}
