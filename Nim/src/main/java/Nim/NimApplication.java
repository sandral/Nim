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

    public int[] stackSizes() {
        int[] sizes = new int[currentGame.getStacks().length];
        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = currentGame.getStacks()[i].getSize();
        }
        return sizes;
    }

    public String currentPlayerName() {
        if (currentGame.getTurn() == 1) {
            return p1.getName();
        } else {
            return p2.getName();
        }
    }

    boolean legalMove(int i, int amount) {
        if (i<0) { return false; }
        if (i>=currentGame.getStacks().length) { return false; }
        if (amount < 1) { return false;}
        if (amount > currentGame.getStacks()[i].getSize()) { return false; }
        return true;
    }

    boolean makeMove(int i, int amount) {
        if (legalMove(i, amount)) {
            currentGame.removeSticks(i, amount);
            if (currentGame.ended()) {
                currentGame = null;
            }
            return true;
        } else {
            return false;
        }
    }

    boolean gameStarted() {
        return currentGame != null;
    }

    int getLastWinner() {
       
    }
}
