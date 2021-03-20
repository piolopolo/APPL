/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintingShapes;

public class Cylinder extends Shape{
    private double height;
    private double radius;
    
    public Cylinder(double r, double h){
        super("Cylinder");
        height = h;
        radius = r;
    }


    @Override
    public double area() {
        return Math.PI*radius*radius*height;
    }
    
    @Override
    public String toString(){
        return super.toString() + " of radius " + radius +" and height "+ height;
    }
}