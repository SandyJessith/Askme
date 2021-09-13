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
public abstract class Person {
    
    protected String name;
    protected char playerType;

    public Person(String nombre, char tipoJugador) {
        this.name = nombre;
        this.playerType = tipoJugador;
    }

    public Person() {
    }
    
    public abstract void play();

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(name);
        sb.append(", tipoJugador=").append(playerType);
        sb.append('}');
        return sb.toString();
    }
    
    
}
