package example.codeclan.com.sports_cards;

/**
 * Created by user on 21/01/2017.
 */
public class User {

    private String name;
    private Team team;

    public User(String name, Team team) {
        this.name = name;
        this.team = team;
    }

    public String getUserName() {
        return name;
    }

    public void draftCardToTeam(Card card) {
        team.draftCard(card);

    }

    public int getRosterNumber() {
        return team.getRosterNumber();
    }

    public int getTotalValue() {
        return team.getRosterScore();
    }
}
