/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generics;

import Generics.BoxTest.Box;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hita Do
 */
public class BoxDemo {
    
    public static <U> void addBox(U u, List<Box<U>>boxes){
        Box<U> box = new Box<U>();
        box.set(u);
        boxes.add(box);
    }
    
    public static <U> void outBox(List<Box<U>> boxes){
        int count = 0;
        for(Box<U> box: boxes){
            U boxContents = box.get();
            System.out.println(boxContents.toString());
        }
    }
    
    public static void main(String [] args){
        Integer a=45;
        ArrayList <Box<Integer>> listBoxInteger = new ArrayList<>();
        BoxDemo.<Integer>addBox(Integer.valueOf(10), listBoxInteger);
        BoxDemo.addBox(Integer.valueOf(20), listBoxInteger);
        BoxDemo.addBox(30, listBoxInteger);
        BoxDemo.addBox(a.intValue(), listBoxInteger);
        BoxDemo.outBox(listBoxInteger);
    }
    
}
