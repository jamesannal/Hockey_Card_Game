package example.codeclan.com.sports_cards;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView title;
    TextView explain;
    Button draftCard;
    TextView show;
    TextView playerShow;
    Button offTheGlass;
    Button takeThemOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextView)findViewById(R.id.title_text);
        Intent intent;
//        Bundle extras = intentent.getExtras();
        Game game;

        explain = (TextView)findViewById(R.id.game_explain);
        draftCard = (Button)findViewById(R.id.draft_card);
        show = (TextView)findViewById(R.id.result_box);
        playerShow = (TextView)findViewById(R.id.player_box);

        Log.d(getClass().toString(), "onCreate called");

    }

    public void onDraftButtonPressed(View button) {
        Log.d(getClass().toString(), draftCard.getText().toString());
        Team userTeam = new Team();
        Team computerTeam = new Team();
        Game game = new Game("You", "Opponent", userTeam, computerTeam);
        game.setUpGame();
        String result2 = game.deal();
        String result = game.play();
        Log.d("game.play result", result);

        Log.d("game.deal result", result2);
        show.setText(result);
        playerShow.setText(result2);
    }

//    public void onPlayButtonPressed(View button) {
//
//        String result = game.play();
//        Log.d("game.play result", result);
//        show.setText(result);
//
//    }
}