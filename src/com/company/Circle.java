package com.company;

public class Circle {

    private double radius;
    private double diameter;
    private double circumference;


    public void setRadius(double enteredRadius){
        radius = enteredRadius;
    }

    public double getRadius(){
        return radius;
    }


    public void setDiameter(){
        diameter = radius * 2;
    }

    public double getDiameter(){
        return diameter;
    }

    public void setCircumference(){
        circumference = 2 * Math.PI * radius;
    }

    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public String print(){
        return "A circle with the radius of " + radius + " has a diameter of " + diameter + ", a circumference of " + circumference + ", and an area of " + calculateArea() + ".";
    }
}
