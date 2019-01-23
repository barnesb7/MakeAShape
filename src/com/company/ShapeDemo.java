package com.company;

import java.util.Scanner;

public class ShapeDemo {

    public static void main(String[] args) {

        boolean wantsToContinue = true;

        do {

            Scanner scanner = new Scanner(System.in);
            String userInput;
            boolean shapeIsValid = false;

            do {
                System.out.println("What shape would you like to create?");
                userInput = scanner.next();

                if (userInput.equals("rectangle") || userInput.equals("triangle") || userInput.equals("square") || userInput.equals("circle")) {
                    shapeIsValid = true;

                } else {
                    System.out.println("Invalid shape. Please choose triangle, square, or rectangle");
                }

            } while (!shapeIsValid);


            if (userInput.equals("circle")) {
                Circle circle = new Circle();

                System.out.println("What should the radius of your circle be (with 2 decimal places)");
                circle.setRadius(scanner.nextDouble());

                circle.setDiameter();
                circle.setCircumference();

                System.out.println(circle.print());

            } else if (userInput.equals("rectangle")) {

                Rectangle rectangle = new Rectangle();

                System.out.println("What is the height of your rectangle(with two decimal places)");
                rectangle.setHeight(scanner.nextDouble());

                System.out.println("What is the width of your rectangle (with two decimal places)");
                rectangle.setWidth(scanner.nextDouble());

                System.out.println(rectangle.print());

            } else if (userInput.equals("square")) {

                Square square = new Square();
                System.out.println("What is the height and width of your square (with two decimal places)");
                square.setHeightAndWidth(scanner.nextDouble());

                System.out.println(square.print());

            } else if (userInput.equals("triangle")) {

                Triangle triangle = new Triangle();

                System.out.println("What is the height of your triangle (with two decimal places)");
                triangle.setHeight(scanner.nextDouble());

                System.out.println("What is the width of your triangle (with two decimal places)");
                triangle.setWidth(scanner.nextDouble());

                System.out.println(triangle.print());

            }

            String newline = "\n";
            System.out.println(newline + "Would you like to continue?" + newline + "1 - Yes" + newline + "2 - No");

            if(scanner.nextInt() == 2){
                wantsToContinue = false;
                System.out.println("Thank you. Goodbye.");
            }

        }while(wantsToContinue);

    }

}
