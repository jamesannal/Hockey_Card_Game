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

    public int getRosterScore() {
        int total = 0;
        for (Card card : cards) {
            total += card.getValue();
        }
        return total;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }


    public ArrayList<String> getCardStringified(){
        ArrayList<String> stringifiedCards = new ArrayList<>();
        for(Card card : cards){
            String answer = card.getPlayerName().toString().toLowerCase();
            stringifiedCards.add(answer);

        }
        return stringifiedCards;
    }





//    public String toSentenceCase(String words) {
//        return words.substring(0,1).toUpperCase() + words.substring(1);
//    }

//    public String showCardNames() {
//        this.getCards().getPlayerName();
//    }

}
