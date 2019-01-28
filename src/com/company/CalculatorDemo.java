package com.company;
import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in;

        calculator.setWidth(10);
        calculator.setHeight(4);
        calculator.setShape("triangle");

        if(calculator.getShape().equals("triangle") || calculator.getShape().equals("rectangle")) {
            int shapeArea = calculator.calculateArea(calculator.getShape(), calculator.getWidth(), calculator.getHeight());

            System.out.println(shapeArea);
        } else {
            System.out.println("Not a valid shape.");
        }
    }
}

