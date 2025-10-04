package partD;
// Program: Print fibonacci series up to n terms.
// Author: Durga Singh (25bcon0848)
import java.util.Scanner;
public class quesThree {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            // Taking input
            System.out.print("Enter the number of terms: ");
            int N = sc.nextInt();
            // Giving output and calculation
            int first=0, second=1, next, i;
            if(N>=1){
                System.out.print("Fibonacci series: " + first);
            }
            if(N>=2){
                System.out.print(", " + second);
            }
            for(i=3; i<=N; i++){
                next = first + second;
                first = second;
                second = next;
                System.out.print(", " + next);
            }
            System.out.println(".");
        }

    }
}
