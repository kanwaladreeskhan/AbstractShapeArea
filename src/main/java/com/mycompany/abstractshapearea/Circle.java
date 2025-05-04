 
package com.mycompany.abstractshapearea;
 
public class Circle extends ClosedShape{
      @Override
    public void Draw(){
        System.out.println("Drawing Circle....");
    }
    @Override
    public void DisplayArea(){
        double area=3.1416*super.radius*super.radius;
        System.out.println("Area of Circle= " + area);
    }
}
