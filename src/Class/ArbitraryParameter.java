/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class;

/**
 *
 * @author Hita Do
 */
public class ArbitraryParameter {
    
    //contoh method
    public static void myMethod(String... array){
        //untuk loop banyaknya parameter
        for(String arr : array){
            System.out.println(arr);
        }
    }
    
    public static void main(String [] args){
        myMethod("foo","bar");
        System.out.println("==================");
        myMethod("foo","bar","test1","test2");
        myMethod();
    }
    
}
