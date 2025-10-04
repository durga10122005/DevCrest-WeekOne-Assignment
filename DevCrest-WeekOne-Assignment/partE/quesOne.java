package partE;
// Program: Prime number checker--> input a number, check if prime.
// Author: Durga Singh(25bcon0848)
import java.util.Scanner;
public class quesOne {
	public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            int N = sc.nextInt();
            if(N<=1){
                System.out.printf("%d is not a prime number.%n",N);
            }
            else if(N==2){
                System.out.printf("%d is not a prime number.%n",N);
            }
            else{
                boolean isPrime = true;
                for(int i=2;i<=Math.sqrt(N);i++){
                    if(N%i==0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.printf("%d is a prime number.%n",N);
                }
                else{
                    System.out.printf("%d is not a prime number.%n",N);
                }
            }
        }
	}
}
