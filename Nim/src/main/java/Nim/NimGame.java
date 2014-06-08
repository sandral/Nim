package Nim;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * Luokka joka sisältää tiedot yhdestä meneillään olevasta pelistä.
 *
 */
public class NimGame {

    Scanner scanner = new Scanner(System.in);
    int turn;
    Stack[] stacks;

    /**
     * Konstruktori.
     */
    public NimGame() {
        turn = 1;
        stacks = new Stack[5];
        createStacks();
    }

    /**
     * Luo taulukon, joka sisältää pelilaudalla olevat tikkukasat. Kasojen
     * sisältämien tikkujen määrät luodaan satunnaisesti.
     */
    public void createStacks() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int r = random.nextInt(10) + 1;
            Stack s = new Stack(r);
            stacks[i] = s;
        }
    }

    /**
     * Palauttaa taulukon, joka sisältää pelilaudalla parhaillaan olevat
     * tikkukasat.
     *
     * @return Taulukko, joka sisältää kasat.
     */
    public Stack[] getStacks() {
        return stacks;
    }

    /**
     * Metodi, joka poistaa halutusta tikkukasasta halutun määrän tikkuja.
     *
     * @param index Se tikkukasa, josta tikkuja halutaan poistaa.
     * @param number Poistettavien tikkujen määrä.
     */
    public void removeSticks(int index, int number) {
        if (number > 0 && number <= stacks[index].getSize() && !stacks[index].isEmpty()) {
            for (int i = 0; i < number; i++) {
                stacks[index].decrease();
            }
        }
        if (!ended()) {
            turn = 3 - turn;
        }
    }

    /**
     *
     * @return
     */
    public int getTurn() {
        return turn;
    }

    /**
     * Palauttaa totuusarvon true, jos peli päättyi ja kasat
     * ovat tyhjiä.
     * @return totuusarvo, onko peli päättynyt.
     */
    boolean ended() {
        return stacksAreEmpty();
    }

    /**
     * Palauttaa totuusarvon true, jos kaikki kasat ovat tyhjiä
     * @return Totuusarvo, ovatko kasat tyhjiä.
     */
    public boolean stacksAreEmpty() {
        boolean ret = true;
        for (int i = 0; i < stacks.length; i++) {
            if (stacks[i].getSize() > 0) {
                ret = false;
            }
        }
        return ret;
    }
}
