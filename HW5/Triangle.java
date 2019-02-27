class Triangle {

    int side1;
    int side2;
    int side3;

    boolean isScalene() {

        return (side1 + side2 + side3) % 3 != 0  ? true : false;
        
    }

    boolean isIsoceles() {

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

    boolean isEquilateral() {

        return (side1 == side2) && (side2 == side3) ? true : false;

    }

    int calculatePerimeter() {

        return side1 + side2 + side3;

    }

}