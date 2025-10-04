package partC;

// Program: Make a simple calculator(+,-,*,/,%) using switch.
// Author: Durga Singh(25bcon0848)
import java.util.Scanner;

public class quesThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double n2 = sc.nextDouble();
        System.out.print("Enter the operation(+,-,*,/,%): ");
        char operation = sc.next().charAt(0);
        double result = 0;
        boolean validOperation = true;

        switch (operation) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                    validOperation = false;
                }
                break;
            case '%':
                if (n2 != 0) {
                    result = n1 % n2;
                } else {
                    System.out.println("Error: Cannot perform modulo by zero!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operation!");
                validOperation = false;
        }

        if (validOperation) {
            System.out.printf("Result: %.2f %c %.2f = %.2f%n", n1, operation, n2, result);
        }

        sc.close();
    }
}
