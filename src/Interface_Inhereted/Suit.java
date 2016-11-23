/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface_Inhereted;

/**
 *
 * @author Hita Do
 */
public enum Suit {
    DIAMONDS(1,"Diamonds"),
    CLUBS(2,"Clubs"),
    HEART(3,"Heart"),
    SPADES(4,"Spades");
    
    private final int value;
    private final String text;
    Suit(int value, String text){
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
    
    
}
