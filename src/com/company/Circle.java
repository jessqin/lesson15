package com.company;

/**
 * Created by jq210 on 10/6/16.
 */
public class Circle {
    public double radius;
    public Circle(double r)

    {
        radius = r;

    }

    public double area()
    {
        double a = Math.PI * Math.pow(radius,2);
        return a;
    }
    public double circumference()
    {
        double c = 2 * Math.PI *radius;
        return c;
    }
    public double diameter()
    {
        double d = 2 * radius;
        return d;
    }



}
