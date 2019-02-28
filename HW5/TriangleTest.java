import HW5.Triangle;

public class TriangleTest {
    public static void main(String args[]) {

        System.out.println("\n\n");

        //Test 1

        Triangle myTestTriangle1 = new Triangle(3, 4, 5);

        System.out.println(myTestTriangle1.isScalene());
        System.out.println(myTestTriangle1.isIsoceles());
        System.out.println(myTestTriangle1.isEquilateral());
        System.out.println(myTestTriangle1.calculatePerimeter());

        System.out.println("\n\n");

        //=======================================================

        //Test 2

        Triangle myTestTriangle2 = new Triangle(4, 4, 5);

        System.out.println(myTestTriangle2.isScalene());
        System.out.println(myTestTriangle2.isIsoceles());
        System.out.println(myTestTriangle2.isEquilateral());
        System.out.println(myTestTriangle2.calculatePerimeter());

        System.out.println("\n\n");

        //=======================================================

        //Test 3

        Triangle myTestTriangle3 = new Triangle(4, 4, 4);

        System.out.println(myTestTriangle3.isScalene());
        System.out.println(myTestTriangle3.isIsoceles());
        System.out.println(myTestTriangle3.isEquilateral());
        System.out.println(myTestTriangle3.calculatePerimeter());

        System.out.println("\n\n");

    }

}