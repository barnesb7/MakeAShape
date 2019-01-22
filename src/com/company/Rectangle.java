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

}
