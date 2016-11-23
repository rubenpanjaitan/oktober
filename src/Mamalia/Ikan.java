/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mamalia;

import oopconcept.Hewan;

/**
 *
 * @author Hita Do
 */
public class Ikan extends Hewan{

   static int jumlah;
   private int usia;
   protected int sirip=2;
    //cosntructor
    public Ikan(int usia){
        jumlah++;
        this.usia=usia;
    }
    
    
   static{
       System.out.println("Ini Ikan");
   }
    
   @Override
    public void bernafas() {
       System.out.println("Ikan bernafas dengan insang");
    } 
    
   @Override
    public void move(){
        System.out.println("Ikan bergerak dengan sirip");
    }
    
    public static void total(){
        System.out.println("jumlah="+jumlah);
    }
    
    public static void ikanStatic(){
        System.out.println("static method ikan");
    }
    
     public void ikanStaticLah(){
        System.out.println("static method ikan");
    }
}
