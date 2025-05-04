 
package com.mycompany.abstractshapearea;
 
public class Square extends ClosedShape{
    @Override
    public void Draw(){
        System.out.println("Drawing Square....");
    }
    @Override
    public void DisplayArea(){
        double area=super.length*super.length;
        System.out.println("Area of Square= " + area);
    }
}

