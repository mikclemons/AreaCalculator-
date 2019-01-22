package com.company;

public class Calculator {

    private int width;
    private int height;

    public void setWidth(int shapeWidth){
        width = shapeWidth;
    }

    public int getWidth(){
        return width;
    }

    public void setHeight(int shapeHeight){
        height = shapeHeight;
    }

    public int getHeight(){
        return height;
    }

    public int calculateArea(int width, int height){
        int area = width * height;
        return area;
    }

}
