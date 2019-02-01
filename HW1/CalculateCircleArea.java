import java.util.Scanner;

public class CalculateCircleArea {

  public static void main(String[] args) {

    System.out.println("==================================");

    System.out.println("Hi, I'll calculate the area of a circle based on its radius");

    System.out.println("");

    System.out.println("Type the radius and hit enter.");

    double radius = new Scanner(System.in).nextInt();

    double answer = 3.1425 * radius * radius;

    System.out.println("");

    System.out.println(String.format("Your answer is %f", answer));

    System.out.println("==================================");

  }
}



