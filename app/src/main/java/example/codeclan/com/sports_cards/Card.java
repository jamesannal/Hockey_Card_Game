package example.codeclan.com.sports_cards;


/**
 * Created by user on 20/01/2017.
 */
public class Card {
    private final Player playername;
    private int value;

    public Card(Player playername, int value) {
        this.playername = playername;
        this.value = value;

    }

    public int getValue() {
        return this.value;
    }

    public Player getPlayerName() {
        return this.playername;
    }
    
    public String getPlayerDisplay() {
        return this.playername + "(" + this.value +")";
    }


}
