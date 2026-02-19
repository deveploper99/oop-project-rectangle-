package org.rtxrassel;

public class Triangle extends Shape{

    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1,int side2,int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public float getArea() {
        int s = (side1+side2+side3)/2;
        return (float) Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    public float getperimeter() {
        return side1+side2+side3;
    }
}
