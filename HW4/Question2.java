import java.util.*;
import java.util.concurrent.TimeUnit;

public class Question2 {

    public static boolean letItRoll() {

        int x = 0;
        String roll, a = "~", b = "~", c = "~";
        Scanner scan = new Scanner(System.in);
        Random RandomNumberGenerator = new Random();

        System.out.println("=======");

        System.out.print("LET THE GOOD TIMES ROLL!!!!!!!!!!!!!\n");
               
        while (x < 12) {

            try {

                Thread.sleep(250);
            }
            catch(InterruptedException ex) {

                Thread.currentThread().interrupt();
            }

            if (x == 3) {

                a =  Integer.toString(Math.abs( RandomNumberGenerator.nextInt() % 10 ));

            }

            else if (x == 7) {

                b =  Integer.toString(Math.abs( RandomNumberGenerator.nextInt() % 10 ));

            }

            else if (x == 11) {

                c =  Integer.toString(Math.abs( RandomNumberGenerator.nextInt() % 10 ));

            }

            System.out.print("-----\n");
            System.out.print(a + "|" +  b + "|" + c + "\n");

            x++;

        }

        if (a.equals(b) && b.equals(c)) {

            System.out.print("HOLY SMOKES YOU GOT THE JACKPOT!!! AUTOMATIC A IN THE CLASS!!!\n");

            return true;

        }

        else if (a.equals(b) || b.equals(c) || a.equals(c)) {

            System.out.print("PARTIAL MATCH, CLOSE BUT NO JACKPOT!!!!\n");

            return false;

        }

        else {

            System.out.print("NOT EVEN CLOSE LOSER!!!!\n");

            return false;

        }

    }
    public static void main(String args[]) {

        String userInput; 
        boolean gamblingAddiction = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("Welcome to the slots you ol' scallywag!");
        System.out.println("Type anything but -1 and hit enter to roll the slots. -1 will quit this program.");

        while(gamblingAddiction) {

            userInput = scan.next();

            if (userInput.equals("-1")) {
                
                System.out.println("See ya later!!!!");

                gamblingAddiction = false;

            }

            else {

                letItRoll();

                System.out.println("Wanna go again? Type anything but -1 and hit enter to roll the slots. -1 will quit this program.");                

            }

        }

        System.out.println("=======================================");

    }

}