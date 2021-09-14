/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Sandy Jessith Chico
 */
public class Player extends Person {

    private int playerId;
    private int currentScore;
    private Prize prize;
    private static int playerCounter; 

    public Player() {
        this.playerId = ++playerCounter;
    }

    public Player(int playerId, String name, char playerType, int currentScore) {
        super(name, playerType);
        this.playerId = playerId;
        this.currentScore = currentScore;
    }

    @Override
    public void play() {
        System.out.println("Comenzó el juego");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jugador{idJugador=").append(playerId);
        sb.append(", puntosAcumulados=").append(currentScore);
        sb.append('}');
        
        return sb.toString();
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }
    
   
}
