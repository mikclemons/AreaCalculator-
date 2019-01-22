package com.company;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.setWidth(10);
        calculator.setHeight(4);
        calculator.setShape("triangle");

       int shapeArea =  calculator.calculateArea(calculator.getShape(), calculator.getWidth(), calculator.getHeight());

       System.out.println(shapeArea);
    }
}
