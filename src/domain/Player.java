/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Objects;

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

    public Prize getPrize() {
        return prize;
    }

    public void setPrize(Prize prize) {
        this.prize = prize;
    }

    public static int getPlayerCounter() {
        return playerCounter;
    }

    public static void setPlayerCounter(int playerCounter) {
        Player.playerCounter = playerCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getPlayerType() {
        return playerType;
    }

    public void setPlayerType(char playerType) {
        this.playerType = playerType;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Player{playerId=").append(playerId);
        sb.append(", currentScore=").append(currentScore);
        sb.append(", prize=").append(prize);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.playerId;
        hash = 67 * hash + this.currentScore;
        hash = 67 * hash + Objects.hashCode(this.prize);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.playerId != other.playerId) {
            return false;
        }
        if (this.currentScore != other.currentScore) {
            return false;
        }
        if (!Objects.equals(this.prize, other.prize)) {
            return false;
        }
        return true;
    }

}
