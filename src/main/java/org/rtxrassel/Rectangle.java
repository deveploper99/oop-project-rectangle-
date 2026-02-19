package org.rtxrassel;

public class Rectangle extends Shape{
    private int length;
    private int width;


    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public float getArea() {
        return length*width;
    }

    @Override
    public float getperimeter() {
        return 2*(length+width);
    }

    public void getRectangle(){
        System.out.println("Rectangel: = "+getArea());
    }

    public void getPerimeter(){
        System.out.println("Perimeter: = "+getperimeter());
    }
}
