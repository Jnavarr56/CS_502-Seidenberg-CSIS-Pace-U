package shapes; //<-- Specify this class to be placed in a package.
                //    Upon compilation of this file, a folder with the package 
                //    name will be generated and the compiled Java will be in
                //    a file in that folder.

public class Triangle {

    // Make our instance variables private as is customary. 
    private int s1;
    private int s2;
    private int s3;


    // All methods are going to be public since we need to use them
    // directly in another program.
    public Triangle(int s1, int s2, int s3) {


        // When parameter names have the same name(s) as 
        // instance variables, the name(s) will only refer
        // to the local data (parameters) in the method,
        // not the instance variables.
        // Therefore, we have to use the 'this' keyword
        // to refer to the instance variables here.
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;

    }

    public boolean isScalene() {

        return ((s1 != s2) && (s1 != s3) && (s2 != s3)) ? true : false;
        
    }

    public boolean isIsoceles() {

        return (((s1 == s2) && (s2 != s3)) || ((s1 != s2) && (s2 == s3)) || ((s1 == s3) && (s2 != s3))) ? true : false;

    }

    public boolean isEquilateral() {

        return ((s1 == s2) && (s2 == s3)) ? true : false;

    }

    public int calculatePerimeter() {

        return s1 + s2 + s3;

    }

}

