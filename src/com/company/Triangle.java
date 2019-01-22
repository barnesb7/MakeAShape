package com.company;

public class Triangle {

    private double height;
    private double width;

    public void setHeight(double enteredHeight){
        height = enteredHeight;
    }


    public double getHeight(){
        return height;
    }

    public void setWidth(double enteredWidth){
        width = enteredWidth;
    }

    public double getWidth(){
        return width;
    }

    public double calculateArea(){
        return (height * width)/2;
    }


}
