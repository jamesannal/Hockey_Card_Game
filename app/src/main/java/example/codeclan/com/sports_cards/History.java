package example.codeclan.com.sports_cards;

import java.util.ArrayList;

/**
 * Created by user on 21/01/2017.
 */

public class History {
    private ArrayList<String> results;

    public History() {
        this.results = new ArrayList<String>();
    }

    public void add(String string) {
        results.add(string);
    }

    public void showResults() {
        for (String result : results) {
            System.out.println(result);
        }

    }
}

