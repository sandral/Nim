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

    int gameLength;
    NimGame game;
    boolean turnEnded;
    
    public NimApplication() {
        gameLength = 3;
        game = null;
        turnEnded = false;
    }
    
    public void makeMove(int n) {
        game.chooseStack(n);
        while (!turnEnded) {
            game.removeStick(n);
        }
        
    }
}
