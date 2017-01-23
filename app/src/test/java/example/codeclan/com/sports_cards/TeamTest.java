package example.codeclan.com.sports_cards;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.sports_cards.Player.GLASS;
import static example.codeclan.com.sports_cards.Player.HORVAT;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 21/01/2017.
 */

public class TeamTest {
    Team team;
    Card card;
    Card card2;

    @Before
    public void before() {
        team = new Team();
        card = new Card(HORVAT, HORVAT.value);
        card2 = new Card(GLASS, GLASS.value);
        team.draftCard(card);
    }

    @Test
    public void canDraftCard() {
        assertEquals(1, team.getRosterNumber());
    }

    @Test
    public void canGetCardScore(){
        assertEquals(82, team.getRosterScore());
    }

    @Test
    public void canCheckCardName() {
        assertEquals(HORVAT, card.getPlayerName());
    }

    @Test
    public void canCheckRosterScore() {
        team.draftCard(card2);
        assertEquals(83, team.getRosterScore());
    }

}
