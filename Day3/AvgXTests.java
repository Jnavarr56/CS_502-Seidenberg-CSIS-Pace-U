import java.util.*;


public class AvgXTests {

    public static void main(String args[]) {

        boolean runningProgram = true;
        String bar = "=======================================";
        String introText = "Hi, type in the scores of the exams and I will immediately print the average.\nEnter -1 to quit.";
        String exams = "";
        double sum = 0;
        int numExams = 0;
        double currScore;    
        Scanner scan = new Scanner(System.in);

        System.out.println(bar + "\n" + introText);
        
        while(runningProgram) {

            System.out.println("Type your score and hit enter!");

            currScore = scan.nextDouble();

            if (currScore == -1) {

                runningProgram = false;

            }
            
            else if (currScore >= 0 && currScore <= 100){

                exams += ("\nScore " + (numExams + 1) + ":  " + currScore);
                sum += currScore;
                numExams ++;

                System.out.println(exams);
                System.out.println("------------");
                System.out.println("EXAM AVERAGE: " + ((sum / numExams)));


            }

            else {

                System.out.println("INVALID INPUT");
                
            }

        }

        System.out.println("See ya later!\n" + bar);
    }


}