package org.rtxrassel;

public class Circle extends Shape{

    private int radias;



    public Circle(int radias){
        this.radias = radias;
    }


    @Override
    public float getArea() {
        return (float) (3.1416*(radias*radias));
    }

    @Override
    public float getperimeter() {
        return(float) (2*3.1416*radias);
    }
}
