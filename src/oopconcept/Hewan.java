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
public abstract class Hewan implements MoveAble{
    private static int count; 
    protected int kaki;
    public abstract void bernafas();
    
    public static void bersuara(){
        System.out.println("suara");
    }
    
    
}
