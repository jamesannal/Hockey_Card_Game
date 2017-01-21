package example.codeclan.com.sports_cards;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.sports_cards.Player.HORVAT;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 21/01/2017.
 */

public class UserTest {

    User user;
    Card card;

    @Before
    public void before() {
        user = new User("James", new Team());
        card = new Card(HORVAT, HORVAT.value);
        user.draftCardToTeam(card);


    }

    @Test
    public void canGetUserName(){
        assertEquals("James", user.getUserName());
    }

    @Test
    public void canAddCardToTeam(){
        assertEquals(1, user.getRosterNumber());
    }

}
