package com.company;

import java.util.Scanner;

public class ShapeDemo {

    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     String userInput;
     double userDoubleInput;
     boolean shapeIsValid = false;



     do{
         System.out.println("What shape would you like to create?");
         userInput = scanner.next();

         if(userInput.equals("rectangle") || userInput.equals("triangle") || userInput.equals("square")){
             shapeIsValid = true;
         }

        if(!shapeIsValid){
            System.out.println("Invalid shape. Please choose triangle, square, or rectangle");
        }

     } while(!shapeIsValid);


     if(userInput.equals("rectangle")){

       Rectangle rectangle = new Rectangle();

       System.out.println("What is the height of your rectagle (with two decimal places)");
       rectangle.setHeight(scanner.nextDouble());

       System.out.println("What is the width of your rectangle (with two decimal places)");
       rectangle.setWidth(scanner.nextDouble());

       System.out.println(rectangle.print());
     }




    }
}
