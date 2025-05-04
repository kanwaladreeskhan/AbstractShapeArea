 
package com.mycompany.abstractshapearea;
 
abstract public class ClosedShape {
    
    protected double radius;
    protected double length;
     public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setLength(double length) {
        this.length = length;
    }
    abstract public void Draw();
     public void DisplayArea(){
        System.out.println("Area Calculator!");
    }
     }
