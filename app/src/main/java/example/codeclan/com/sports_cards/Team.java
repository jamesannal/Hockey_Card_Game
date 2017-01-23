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
//        cards.remove(0);
    }


    public int getRosterNumber() {
        return cards.size();
    }

    public int getRosterScore() {
        int total = 0;
        for (Card card : cards) {
            total += card.getValue();
        }
        return total;
    }

}
