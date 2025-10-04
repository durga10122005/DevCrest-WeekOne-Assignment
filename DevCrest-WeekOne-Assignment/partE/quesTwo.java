package partE;
// Program: Guess the number game:- take random number (fixed or assumed) - ser guesses until correct - print "Too high/low" hints.
// Author: Durga Singh (25bcon0848)
import java.util.Scanner;
public class quesTwo {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int randomN = (int)(Math.random()*100)+1;
            System.out.println("--Guess The Number Game--");
            System.out.println("**NOTE** => You have only 20 attempts.");
            System.out.println("I'm thinking of a number between 1 and 100.");
            int i;
            for(i=1;i<=20;i++){
                System.out.println();
                System.out.printf("Attempt %d, Guess the number: ",i);
                int N = sc.nextInt();
                if(N==randomN){
                System.out.printf("Yes! the number is %d. You win!.%n",N);
                break;
                }
                else if(N > randomN){
                        System.out.printf("%d is too high!%n", N);
                }
                else{
                    System.out.printf("%d is too low!%n", N);
                }
            }
            if(i==20){
                System.out.println("Game over! The number was %d. Better luck next time.");
            }
        }
    }
}
