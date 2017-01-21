package example.codeclan.com.sports_cards;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.sports_cards.Player.HORVAT;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 21/01/2017.
 */

public class TeamTest {
    Team team;
    Card card;

    @Before
    public void before() {
        team = new Team();
        card = new Card(HORVAT, HORVAT.value);
        team.draftCard(card);
    }

    @Test
    public void canDraftCard() {
        assertEquals(1, team.getRosterNumber());
    }

}
