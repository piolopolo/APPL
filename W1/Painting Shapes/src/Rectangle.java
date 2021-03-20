/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintingShapes;

/**
 *
 * @author afdalrdh
 */
public class Rectangle extends Shape{
    
    private double width;
    private double length;
    
    public Rectangle(double w, double l){
        super("Rectangle");
        width = w;
        length = l;
    }

    @Override
    public double area() {
        return width*length;
    }
    
    @Override
    public String toString(){
        return super.toString() + " of length " + length +" and width "+ width;
    }
    
}