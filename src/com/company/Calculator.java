package com.company;

public class Calculator {

    private int width;
    private int height;
    private String shape;


    public void setShape(String shapeType){
        shape = shapeType;
    }

    public String getShape(){
        return shape;
    }
    public void setWidth(int shapeWidth) {
        width = shapeWidth;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int shapeHeight) {
        height = shapeHeight;
    }

    public int getHeight() {
        return height;
    }


    public int calculateArea(String shape, int width, int height) {
        if (shape.equals("rectangle")) {
            int area = width * height;
            return area;
        }
        if (shape.equals("triangle")) {
            int area = (width * height) / 2;
            return area;
        }
        return 0;
    }
}
