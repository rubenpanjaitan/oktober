/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generics;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Hita Do
 */
public class WildCard{
    
    //upper bounded wildcards using extends
    public static void sumOfList(List<? extends Number> list){
        double sum = 0.0;
        
        for(Number n : list){
            sum+=n.doubleValue();
        }
        System.out.println(sum);
    }
    
    //unbound wildcards
    public static void printList(List<?> list){
        
        for(Object obj : list){
            System.out.print(obj.toString()+" ");
        }
        System.out.println("\n");
    }
    
    //lower bound wildcards
    public static void addList(List<? super Integer> list){
        for(Object obj : list){
            System.out.println(obj.toString());
        }
    }
    
    public static void main(String [] arg){
        // upper bounded
        List<Integer> listInteger = Arrays.asList(1,2,3,4,5,6);
        sumOfList(listInteger);
        List<Double> listDouble = Arrays.asList(1.1,1.2,1.3,1.4,1.5);
        sumOfList(listDouble);
        
        //using unbounded
        List<String> listString = Arrays.asList("satu","dua","tiga","empat","lima");
        printList(listString);
        printList(listDouble);
        
        //lower bounded
        addList(listInteger);
    }

   
    
}
