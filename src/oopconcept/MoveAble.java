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
 interface MoveAble {
    
     void move();
     
     default boolean isMove(Hewan hewan){
         return false;
         
     }
    
     static boolean isJump(Hewan hewan){
         return false;
         
     }
    
}
