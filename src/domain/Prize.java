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
public class Prize {
     
    private int [] prizes = {0,100,200,300,400,500};
        

    public Prize() {
    }

    public Prize(int[] prizes) {
        this.prizes = prizes;
    }

    public int[] getPrizes() {
        return prizes;
    }

    public void setPrizes(int[] prizes) {
        this.prizes = prizes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prize{prizes=").append(prizes);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
