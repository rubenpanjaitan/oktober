/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface_Inhereted;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Hita Do
 */
public interface Deck {
    
    List<Card> getCard();
    Deck deckFactory();
    void addCard(Card card);
    void addCards(List<Card> cards);
    void addDeck(Deck deck);
    void sort();
    void shuffle();
    void sort(Comparator<Card> card);
    void deckToString();
     Map<Integer, Deck> deal(int players, int numberOfCards)
        throws IllegalArgumentException;
     
}
