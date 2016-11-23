/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Object;

/**
 *
 * @author Hita Do
 */
public class ObjectDemo {
    
    public static void main(String [] args){
        Point point1=new Point(23,94);
        System.out.println(point1.getX());
        System.out.println(point1.getY());
        
        Rectangle rect1 = new Rectangle(point1, 100,200);
        System.out.println("width="+rect1.getWidth());
        System.out.println("heigth="+rect1.getHeight());
        
        Rectangle rect2=new Rectangle(10,20);
        rect2.point=point1;
        System.out.println("x="+rect2.point.getX());
        System.out.println("y="+rect2.point.getY());
        System.out.println("Area="+rect2.getArea());
    }
    
}
