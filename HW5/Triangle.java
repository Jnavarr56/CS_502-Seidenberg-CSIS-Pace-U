package HW5;

public class Triangle {

    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public boolean isScalene() {

        if (
            (side1 != side2) 
            &&
            (side1 != side3)
            &&
            (side2 != side3) 
        ) {

            return true;

        } 

        return false;
        
    }

    public boolean isIsoceles() {

        if (
            ( (side1 == side2) && (side2 != side3) ) 
            ||
            ( (side1 != side2) && (side2 == side3) ) 
            ||
            ( (side1 == side3) && (side2 != side3) ) 
        ) {
            return true;
        }

        return false;

    }

    public boolean isEquilateral() {

        return (side1 == side2) && (side2 == side3) ? true : false;

    }

    public int calculatePerimeter() {

        return side1 + side2 + side3;

    }
}

