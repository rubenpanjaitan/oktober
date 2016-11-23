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
public class Nested {

    private static int jumlah=10;
    private int angka1=10;
    private int angka2;
    
    public void testOuter(){
        //testInner();
        System.out.println("Outer"+angka1);
        
    }
    public static void jumlah(){
        
        System.out.println("jumlah ="+jumlah);
    }
    
    public void local(int parameter){
         int localVar = 0;
        if(jumlah==10){
            class LocalClass{
                   final int a=10;
                   public  LocalClass(){
                       System.out.println("Test Local class");
                       //access method outer
                       testOuter();
                       //acces field
                       System.out.println("outer"+angka1);
                       System.out.println("outer"+jumlah);
                       //acces local variabel
                       System.out.println("local"+localVar);
                       //acces parameter
                       System.out.println("local"+parameter);
                   }
                   public final void testLocal(){
                       
                   }
                   
           }
            LocalClass loc=new LocalClass();
        }
    }
    
    public static class A{
        private  int a=9;
          void test(){
            jumlah();
        }
    }
    
    public class Inner{

       private static final int x=10;
        
        public final void testInner(){
            System.out.println("inner" + angka1);
            jumlah();
        }
        
        
        
    }
    
}
