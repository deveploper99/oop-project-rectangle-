package org.rtxrassel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
     Shape rec = new Rectangle(10,12);

        System.out.println("Area: = "+rec.getArea());
        System.out.println("Perimeter: = "+rec.getperimeter());

        System.out.println("++++++++++++++++++++++++++++");

        Shape circle = new Circle(5);
        System.out.println("Area: = "+circle.getArea());
        System.out.println("Perimeter: = "+circle.getperimeter());


        System.out.println("++++++++++++++++++++++++++++");

        Shape triangle = new Triangle(7,8,6);
        System.out.println("Area: = "+triangle.getArea());
        System.out.println("Perimeter: = "+triangle.getperimeter());




    }
}
