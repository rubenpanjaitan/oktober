/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NumberString;

/**
 *
 * @author Hita Do
 */
public class Converter {
    
    public static void main(String [] args){
        String kata ="ka|ta|la   h";
        if(args.length==2){
            Float a=(Float.valueOf(args[0]).floatValue());
            Float b=(Float.valueOf(args[1]).floatValue());
            System.out.println("a + b = " +(a + b));
            System.out.println("a - b = " +(a - b));
            System.out.println("a * b = " +(a * b));
            System.out.println("a / b = " +(a / b));
            System.out.println("a % b = " +(a % b));           
        }else{
            System.out.println("try again");
        }
        //charAt
        System.out.println(kata.charAt(1));
        //split
        String [] array= kata.split("|",8);       
        for(int i=0;i<5;i++){
            System.out.println(array[i]);
        }
        
        //trim
        System.out.println(kata.trim());
        //indexof
        System.out.println(kata.indexOf('a'));
         //indexof
        System.out.println(kata.lastIndexOf("ta"));
        //contains
        System.out.println(kata.contains("aa"));
        //replace
        System.out.println(kata.replace('a', 'b'));
        //replace all
        System.out.println(kata.replaceAll("|", "e"));
        //replace first
         System.out.println(kata.replaceFirst("|", "e"));
         //matches
          System.out.println(kata.matches("|"));
         
         
    }
}
