import java.util.Scanner;

public class CalculateGrades {

    public static void main(String[] args) {

        int midtermGrade, finalGrade;

        double average;

        char grade;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please type your midterm grade and press enter");

        midtermGrade = scan.nextInt();

        System.out.println("Please type your final grade and press enter");

        finalGrade = scan.nextInt();

        average = (midtermGrade + finalGrade) / 2.0;

        System.out.println("Your average number grade is " + average + ".");

        if (average >= 90 && average <= 100) { grade = 'A'; }

        else if (average >= 80 && average < 90) { grade = 'B'; }

        else if (average >= 70 && average < 80) { grade = 'C'; }

        else { grade = 'F'; }

        System.out.println("Your class grade is a " + grade + ".");
    }   
}

