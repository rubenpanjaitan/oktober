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
public class PlayingCard implements Card{

    private Rank rank;
    private Suit suit;
    
    public PlayingCard(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }
    
    @Override
    public Suit getSuit() {
        return this.suit;
    }

    @Override
    public Rank getRank() {
        return this.rank;
    }

    @Override
    public int compareTo(Card o) {
        return this.hashCode() - o.hashCode();
    }
    
    public static void main(String [] args){
        PlayingCard p1 = new PlayingCard(Rank.ACE, Suit.CLUBS);
        PlayingCard p2 = new PlayingCard(Rank.DEUCE,Suit.DIAMONDS);
        System.out.println(p1.toString());
    }
}
