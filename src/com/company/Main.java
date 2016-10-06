package com.company;

public class Main {

    public static void main(String[] args) {
	    Circle ted = new Circle(25.2);
        //System.out.println(ted.radius);
        double tedArea = ted.area();
        //System.out.println(tedArea);

        Circle frank = new Circle(30);
        double frankArea = frank.area();
        double frankCircumference = frank.circumference();
        double frankDiameter = frank.diameter();
        System.out.println("Frank Radius: " + frank.radius + "\n" + "Frank Area: " + frankArea + "\n" + "Frank Circumference: " + frankCircumference + "\n" + "Frank Diameter: " +frankDiameter);
    }
}
