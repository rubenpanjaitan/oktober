/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oopconcept;

import Mamalia.Ikan;

/**
 *
 * @author Hita Do
 */
public class Paus extends Ikan{
    
    private int a;
    private int b;
    static{
        System.out.println("without main");
        System.exit(0);
    }
    
  

    public Paus(int a, int b, int usia) {
        super(usia);
        this.a = a;
        this.b = b;
    }
    
    public Hewan sirip(){
        Ikan ikan=new Ikan(1);
        return ikan;
    }
    
    
    public int jumlah(String a, String b){
        int angka1=(Integer.parseInt(a));
        int angka2=(Integer.parseInt(b));
         
        return  angka1 + angka2;
    }
    
    public static void ikanStatic(){
        System.out.println("static method paus");
    }
    
}
