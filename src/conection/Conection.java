/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;

import domain.Player;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Sandy Jessith Chico
 */
public class Conection implements IDataAccess{

    @Override
    public void save() {
         Player player = new Player();
         try{
            ObjectOutputStream writing_file = new ObjectOutputStream(new FileOutputStream("player.dat"));
            writing_file.writeObject(player);
            writing_file.close();
        } catch(Exception e){
            
        }
    }

    @Override
    public void restore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showResults() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
