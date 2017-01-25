package example.codeclan.com.sports_cards;


import android.util.Log;

import java.util.ArrayList;

/**
 * Created by user on 21/01/2017.
 */

public class Game {

    private DraftPool draftPool;
    private ArrayList<User> users;
    public User user1;
    public User computer;
//    private History history;


    public Game(String playerName, String computer, Team userTeam, Team computerTeam){
        this.user1 = new User(playerName, userTeam);
        this.computer = new User(computer, computerTeam);
        this.draftPool = new DraftPool(new ArrayList<Card>());
        this.users = new ArrayList<User>();
//        this.history = new History();
    }


    public void setUpGame() {
        users.add(user1);
        users.add(computer);

//        draftPool.setUpDraft();

    }

    public String deal(){ //turn to string and put in the players picked
        Card card;
        for (User user: users) {
            user.getTeam().getCards().clear();

//            history.add(user.getUserName());

            card = draftPool.dealCard(user);
//            history.add(card.toString());
            System.out.println(user.getUserName() + " received " + card.getPlayerDisplay() + "");

//            card = draftPool.dealCard(computer);
//            history.add(card.toString());
//            System.out.println(computer.getUserName() + " received " + card.getPlayerDisplay() + "");

//            card = draftPool.dealCard(user1);
//            history.add(card.toString());
//            System.out.println(user1.getUserName() + " received " + card.getPlayerDisplay() + "");
//
//            card = draftPool.dealCard(computer);
//            history.add(card.toString());
//            System.out.println(computer.getUserName() + " received " + card.getPlayerDisplay() + "");
        }
        return ("" + user1.getUserName() + " received: " + "\r\n" + user1.getTeam().getCardStringified() + "\r\n " + "\r\n" + "" + computer.getUserName() + " received: " + "\r\n" + computer.getTeam().getCardStringified() + "").replaceAll("\\[|\\]", "");
    }


    private String findWinner () {
        if (user1.getTotalValue() - computer.getTotalValue() >= 0){
            System.out.println("Huzzah!!!");
            return("You win!");
        }
        else {
            System.out.println("Boo!!!");
            return("You lose!");
        }

    }

    public String play(){
        findWinner();
//        history.showResults();
        String result = findWinner();
        Log.d(getClass().toString(), result.toString());
        return result;
    }






}