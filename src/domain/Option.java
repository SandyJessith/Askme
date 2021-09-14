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
public class Option {

    char option;

    public Option(char option) {
        this.option = option;
    }

    public char getOption() {
        return option;
    }

    public void setOption(char option) {
        this.option = option;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Option{option=").append(option);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.option;
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
        final Option other = (Option) obj;
        if (this.option != other.option) {
            return false;
        }
        return true;
    }

}
