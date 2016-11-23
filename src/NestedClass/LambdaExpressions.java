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
public class LambdaExpressions {

    public static void main(String[] args){
        final String salut="Hello";
        Greeting greeting= message ->
        {
                    System.out.println(salut +" "+message);
        };
        greeting.greet("Ruben");
        
        
        //penambahan
        Math add =(x, y) ->
        {
            System.out.println("Jumlah ="+(x + y));
        };
        add.operation(2, 3);
        
        //pengurangan
        Math sub = (x, y)->
        {        
           System.out.println("kurang = "+(x - y));
         };
        sub.operation(9, 5);
    }
           
    
     interface Math{
        void operation(int a, int b);
    }
     
    interface Greeting{
        void greet(String message);
    }
    
   

    
}
