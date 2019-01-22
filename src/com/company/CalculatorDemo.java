package com.company;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.setWidth(10);
        calculator.setHeight(4);

       int rectArea =  calculator.calculateArea(calculator.getWidth(), calculator.getHeight());

       System.out.println(rectArea);
    }
}
