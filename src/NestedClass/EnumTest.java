/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NestedClass;

/**
 *
 * @author Hita Do
 */
public class EnumTest {
    
    public enum Day{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
    }
    private Day day;
    
    public EnumTest(Day day){
        this.day = day;
    }
    
    void tellIt(){
        switch(day){
            case MONDAY:
                System.out.println("this is monday");
                break;
            case TUESDAY:
                 System.out.println("this is tuesday");
                break;
            case WEDNESDAY:
                 System.out.println("this is wednesday");
                break;
            case THURSDAY:
                 System.out.println("this is thursday");
                break;
            case FRIDAY:
                 System.out.println("this is friday");
                break;
            case SATURDAY:
                 System.out.println("this is saturday");
                break;
            default:
                 System.out.println("Sunday");
                break;
        }
        
    }
    
    public static void main(String[] args){
        EnumTest first=new EnumTest(Day.MONDAY);
        first.tellIt();
        
        for(Day d: Day.values()){
            System.out.println(d);
        }
    }
     
    
}
