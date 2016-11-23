/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Enum;

/**
 *
 * @author Hita Do
 */
public enum Religi {
    BUDHA(1),
    HINDU(2),
    ISLAM(3),
    KATOLIK(4),
    PROTESTAN(5);
    
    private int code;
    Religi(int id){
        this.code = id;
    }
    
    public int getCode(){
        return code;
    }
    
    public Religi getReligi(int id){
        for(Religi religi : Religi.values()){
            if(religi.getCode()== id){
                return religi;
            }
        }
        return null ;
        
    }
    
    
}
