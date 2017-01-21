package example.codeclan.com.sports_cards;

import java.util.ArrayList;

/**
 * Created by user on 21/01/2017.
 */
public class Team {
    private ArrayList<Card> cards;

    public Team() {
        this.cards = new ArrayList<Card>();
    }

    public void draftCard(Card card) {
        cards.add(card);
    }


    public int getRosterNumber() {
        return cards.size();
    }
}

//    public int getRoster() { // use something like this when need to build total number for situations
//        int total = 0;
//        for (Card card : cards) {
//            total += card.getValue();
//        }
//        return total;
//    }

