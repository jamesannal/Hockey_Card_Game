package example.codeclan.com.sports_cards;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;

import static android.R.attr.value;

/**
 * Created by user on 21/01/2017.
 */
public class DraftPool {
    private ArrayList<Card> cards;

    public DraftPool(ArrayList<Card> cards) {
        this.cards = cards;
        setUpDraft();
    }




    public int getCardAmountInPool() {
        return cards.size();
    }

    public void setUpDraft() {
        for (Player player : Player.values()){
            cards.add(new Card(player, player.value));
            randomise();
        }
    }

    public void randomise() {
        Collections.shuffle(cards);
    }

    public Card dealCard(User user) {
        Card card = cards.get(0);
        user.draftCardToTeam(card);
        cards.remove(0);
        setUpDraft();
        return card;
    }

}
