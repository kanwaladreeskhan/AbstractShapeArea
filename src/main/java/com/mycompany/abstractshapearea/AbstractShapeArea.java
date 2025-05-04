 

package com.mycompany.abstractshapearea;
 
public class AbstractShapeArea {

    public static void main(String[] args) {
        // Polymorphism: using ClosedShape as reference
        ClosedShape shape1 = new Circle();
          System.out.println("===Area of Circle===");
        shape1.setRadius(5);
        shape1.Draw();
        shape1.DisplayArea();

        System.out.println("----------------------");

        ClosedShape shape2 = new Square();
        System.out.println("===Area of Square===");
        shape2.setLength(4);
        shape2.Draw();
        shape2.DisplayArea();
    }
}
