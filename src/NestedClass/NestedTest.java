/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NestedClass;

import NestedClass.Nested.A;
import NestedClass.Nested.Inner;

/**
 *
 * @author Hita Do
 */
public class NestedTest {
    
    public static void main(String [] args){
//        Nested nested=new Nested();
//        A a=nested.new A();
//        a.test();
        Nested.A staticClass=new Nested.A();
        staticClass.test();
        A a=new A();
       // a.test();
        //A.test();
        
        Nested nested= new Nested();
        Inner inner =nested.new Inner();
        
      //  inner.testInner();
        nested.local(10);
        
        
    }
}
