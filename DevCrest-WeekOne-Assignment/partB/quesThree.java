package partB;
// Program: Take marks of 5 subjects -> print total, percentage, grade
// Author: Durga Singh(25bcon0848)
import java.util.Scanner;
public class quesThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        System.out.println("Enter the marks obtained in the 5 subjects(out of 100):-");
        System.out.print("Subject 1: ");
        double sub1 = sc.nextDouble();
        System.out.print("Subject 2: ");
        double sub2 = sc.nextDouble();
        System.out.print("Subject 3: ");
        double sub3 = sc.nextDouble();
        System.out.print("Subject 4: ");
        double sub4 = sc.nextDouble();
        System.out.print("Subject 5: ");
        double sub5 = sc.nextDouble();
        // Calculating total,percentage,grade
        double total = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = (total/500)*100;
        String grade;
        if(percentage >= 90){
            grade = "A+";
        }
        else if(percentage >= 80){
            grade = "A";
        }
         else if(percentage >= 70){
            grade = "B+";
        }
         else if(percentage >= 60){
            grade = "B";
        }
         else if(percentage >= 50){
            grade = "C+";
        }
         else if(percentage >= 40){
            grade = "C";
        }
        else{
            grade = "F";
        }
        // Giving output
        System.out.println("RESULT:-");
        System.out.printf("Total marks: %.2f / 500%n",total);
        System.out.printf("Percentge: %.2f%n",percentage);
        System.out.printf("Grade: %s%n",grade);

        sc.close();
    }
}
