/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

/**
 *
 * @author sandra
 */
public class NimApplication {
    NimGame currentGame;
    Scores scorelist;
    Player p1;
    Player p2;
    
    public NimApplication() {
        currentGame = null;
        p1 = null;
        p2 = null;
        scorelist = Scores.initScorelist();
    }

    public void startGame(String sp1, String sp2) {
        p1 = scorelist.getPlayer(sp1);
        p2 = scorelist.getPlayer(sp2);
        currentGame = new NimGame();
    }

}
