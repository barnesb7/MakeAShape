package com.company;

public class Square {

    private double height;
    private double width;

    public void setHeightAndWidth(double enteredLength){
        height = enteredLength;
        width = enteredLength;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public double calculateArea(){
        return height * width;
    }

}
