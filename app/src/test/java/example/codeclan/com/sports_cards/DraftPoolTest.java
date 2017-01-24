package example.codeclan.com.sports_cards;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static example.codeclan.com.sports_cards.Player.WEBER;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 21/01/2017.
 */

public class DraftPoolTest {
    DraftPool draftPool;
    User user;

    @Before
    public void before() {
        draftPool = new DraftPool(new ArrayList<Card>());
        user = new User("James", new Team());
    }

    @Test
    public void checkDraftPoolPopulatesToStart(){
        assertEquals(50, draftPool.getCardAmountInPool());
    }

    @Test
    public void canDealCard() {
        draftPool.dealCard(user);
        assertEquals(1, user.getRosterNumber());
    }


}
