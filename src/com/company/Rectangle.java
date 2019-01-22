package com.company;

public class Rectangle {

    private double width;
    private double height;

    public void setWidth(double enteredWidth){
        width = enteredWidth;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double enteredHeight){
        height = enteredHeight;
    }

    public double getHeight(){
        return height;
    }

    public double calculateArea(){
        return width * height;
    }

    public String print(){

        if (width == height){
           return  "The width and height are even at " + width + ", this shape is a rectangle but also a square. Its area is " + calculateArea() + ".";
        } else {
            return "A rectangle with a width of " + width + " and a height of " + height + " has an area of " + calculateArea() + ".";
        }
    }

}
