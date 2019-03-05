import shapes.Triangle; //<-- Import the Triangle class from the shapes package.

public class TriangleTest {
    
    public static void main(String args[]) {

        System.out.println("\n\n");

        //Test 1

        System.out.println("TEST 1: [3, 4, 5]");

        Triangle myTestTriangle1 = new Triangle(3, 4, 5);

        System.out.println("Scalene? " + myTestTriangle1.isScalene());
        System.out.println("Isoceles? " + myTestTriangle1.isIsoceles());
        System.out.println("Equilateral? " + myTestTriangle1.isEquilateral());
        System.out.println("Perimeter? " + myTestTriangle1.calculatePerimeter());

        System.out.println("\n");

        //=======================================================

        //Test 2

        System.out.println("TEST 2: [4, 4, 5]");

        Triangle myTestTriangle2 = new Triangle(4, 4, 5);

        System.out.println("Scalene? " + myTestTriangle2.isScalene());
        System.out.println("Isoceles? " + myTestTriangle2.isIsoceles());
        System.out.println("Equilateral? " + myTestTriangle2.isEquilateral());
        System.out.println("Perimeter? " + myTestTriangle2.calculatePerimeter());

        System.out.println("\n");

        //=======================================================

        //Test 3

        System.out.println("TEST 3: [4, 4, 4]");

        Triangle myTestTriangle3 = new Triangle(4, 4, 4);

        System.out.println("Scalene? " + myTestTriangle3.isScalene());
        System.out.println("Isoceles? " + myTestTriangle3.isIsoceles());
        System.out.println("Equilateral? " + myTestTriangle3.isEquilateral());
        System.out.println("Perimeter? " + myTestTriangle3.calculatePerimeter());

        System.out.println("\n");

    }

}