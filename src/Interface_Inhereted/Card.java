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
public interface Card extends Comparable<Card> {
    
    public Suit getSuit();
    public Rank getRank();
}
