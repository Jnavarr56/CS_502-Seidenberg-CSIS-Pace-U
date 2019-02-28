import HW5.Triangle;

public class TriangleTest {
    public static void main(String args[]) {

        Triangle myTestTriangle = new Triangle(3, 4, 5);

        System.out.println(myTestTriangle.isScalene());
        System.out.println(myTestTriangle.isIsoceles());
        System.out.println(myTestTriangle.isEquilateral());
        System.out.println(myTestTriangle.calculatePerimeter());

        
    }

}