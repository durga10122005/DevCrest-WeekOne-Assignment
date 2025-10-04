package partD;
// Problem: Print star pattern (choose any two): Right angled triangle, Square, Pyramid.
// Author: Durga Singh(25bcon0848)
import java .util.Scanner;
public class quesFive {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("## For printing right triangle ##");
            System.out.print("Enter the Right triangle size: ");
            int sizeR = sc.nextInt();
            int i, j;
            for(i=1;i<=sizeR;i++){
                for(j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
            }
            System.out.println();
            System.out.println("## For printing square ##");
            System.out.print("Enter the size of square: ");
            int sizeS = sc.nextInt();
            for(i=1;i<=sizeS;i++){
                for(j=1;j<=sizeS;j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
