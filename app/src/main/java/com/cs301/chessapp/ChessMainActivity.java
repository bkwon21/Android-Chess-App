package com.cs301.chessapp;

import static android.widget.TextView.*;

import android.widget.TextView;

import com.cs301.chessapp.gameframework.GameMainActivity;
import com.cs301.chessapp.gameframework.LocalGame;
import com.cs301.chessapp.gameframework.gameConfiguration.GameConfig;
import com.cs301.chessapp.gameframework.gameConfiguration.GamePlayerType;
import com.cs301.chessapp.gameframework.infoMessage.GameState;
import com.cs301.chessapp.gameframework.players.GamePlayer;
import com.cs301.chessapp.gamestate.players.ChessHumanPlayer;

import java.util.ArrayList;

public class ChessMainActivity extends GameMainActivity {
    private static final String TAG = "ChessMainActivity";
    private static final int PORT_NUMBER = 5213;

    @Override
    public GameConfig createDefaultConfig() {
        ArrayList<GamePlayerType> playerTypes = new ArrayList<>();

        playerTypes.add(new GamePlayerType("Local Human Player 1") {
            public GamePlayer createPlayer(String name) {
                return new ChessHumanPlayer(name, R.layout.activity_main);
            }
        });

        // todo: add 2nd local player
        // todo: add remote player
        // todo: add computer player normal
        // todo: add computer player smart
        GameConfig defaultConfig = new GameConfig(playerTypes, 1, 2, "Chess", PORT_NUMBER);
        defaultConfig.addPlayer("Hello Person", 0);
        return defaultConfig;
    }

    @Override
    public LocalGame createLocalGame(GameState gameState) {
        return new ChessLocalGame();
    }
}
