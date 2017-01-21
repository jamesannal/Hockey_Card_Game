package example.codeclan.com.sports_cards;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.sports_cards.Player.WEBER;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 20/01/2017.
 */

public class CardTest {
    Card card;

    @Before
    public void before(){
        card = new Card(WEBER, WEBER.value);
    }

    @Test
    public void canGetValue(){
        assertEquals(92, card.getValue());
    }

    @Test
    public void canGetPlayerName(){
        assertEquals(WEBER, card.getPlayerName());
    }

    @Test
    public void canGetPlayerDisplay(){
        assertEquals("WEBER(92)", card.getPlayerDisplay());
    }
}
