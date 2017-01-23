package example.codeclan.com.sports_cards;


import android.util.Log;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by user on 21/01/2017.
 */

public class Game {

    private DraftPool draftPool;
    private ArrayList<User> users;
    public User user;
    public User computer;
    private History history;


    public Game(String playerName, String computer, Team userTeam, Team computerTeam){
        this.user = new User(playerName, userTeam);
        this.computer = new User(computer, computerTeam);
        this.draftPool = new DraftPool(new ArrayList<Card>());
        this.users = new ArrayList<User>();
        this.history = new History();
    }


    public void setUpGame() {
        users.add(user);
        users.add(computer);

        draftPool.setUpDraft();

        draftPool.dealCard(user);
        draftPool.dealCard(computer);
        draftPool.dealCard(user);
        draftPool.dealCard(computer);
        deal();
    }

    public void deal(){
        Card card;
        for (User user: users) {
            history.add(user.getUserName());

            card = draftPool.dealCard(user);
            history.add(card.toString());

            card = draftPool.dealCard(computer);
            history.add(card.toString());

            card = draftPool.dealCard(user);
            history.add(card.toString());

            card = draftPool.dealCard(computer);
            history.add(card.toString());

            System.out.println(user.getUserName() + "Received" + card.getPlayerDisplay() + "");
            System.out.println(computer.getUserName() + "Received" + card.getPlayerDisplay() + "");

        }
    }

    private void findWinner () {
        if (user.getTotalValue() >= computer.getTotalValue()){
            System.out.println("You win!");
        }
        else {
            System.out.println("Computer wins!");
        };

    }

    public void play(){
        deal();
        findWinner();
        history.showResults();
    }



}