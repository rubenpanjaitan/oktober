/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oopconcept;

/**
 *
 * @author Hita Do
 */
public class Burung extends Hewan{

    
     //constructor
    public Burung() {
    }
    
    @Override
    public void bernafas() {
         System.out.println("Burung bernafas dengan paru-paru");
    }
    
    @Override
    public void move(){
        System.out.println("Burung bergerak dengan sayap dan kaki "+kaki);
    }
    
    public void cetak(){
        System.out.printf("%d", kaki);
    }
    
    @Override
    public boolean isMove(Hewan hewan){
        return true;
        
    }
       
}
