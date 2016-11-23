/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author Hita Do
 */
public class BoxTest {

    public static class Box<T> {
        private T t;
        public void set(T t) { 
            this.t = t;
        }
        
        public T get(){
            return t;
        }
        // ...

    }
    
    public static void main(String [] args){
       Box<Number> box = new Box<>();
       box.set(new Integer(10));
        System.out.println(box.get());
       box.set(new Double(10.2));
       System.out.println(box.get());
    }
}
