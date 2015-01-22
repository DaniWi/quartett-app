package model;

import contracts.game.GameState;

import java.util.Queue;

/**
 * Created by Mark on 21.01.2015.
 */
public class GameStatus implements contracts.game.GameStatus{
    private GameState state;
    private int player1Cards;
    private int player2Cards;
    private int round;

    public GameStatus(int round, int player1Cards, int player2Cards, GameState state){
        this.round = round;
        this.player1Cards = player1Cards;
        this.player2Cards = player2Cards;
        this.state = state;
    }

    public void updateRound(){
        round = round++;
    }

    public void updatePlayer1Cards(int newPlayer1Cards){
        player1Cards = newPlayer1Cards;
    }

    public void updatePlayer2Cards(int newPlayer2Cards){
        player2Cards = newPlayer2Cards;
    }

    public void updateStatus (GameState newState){
        state = newState;
    }

    @Override
    public String getMessage() {
        return state.toString();
    }

    @Override
    public int getRound() {
        return round;
    }

    @Override
    public int getCardCount() {
        return player1Cards;
    }

    @Override
    public int getCardCountCompetitor() {
        return player2Cards;
    }
}