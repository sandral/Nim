/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim.logic;

import java.util.ArrayList;

/**
 *
 * @author reipas
 */
public class Scores {
    
    private static ArrayList<Player> scores;
    private static final String scoreFile = "tiedosto.txt";

    public Scores() {
        
    }
    

    static Scores initScorelist() {
       return new Scores();
    }

    
    
    Player getPlayer(String sp) {
        return new Player(sp);
        //throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public void addScore(String name, int score) {
                
    }
    
}
