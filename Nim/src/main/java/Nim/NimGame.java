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
    int winner;
    Stack[] stacks;

    /**
     * Konstruktori.
     */
    public NimGame() {
        turn = 1;
        winner = 0;
        stacks = new Stack[5];
        createStacks();
    }

    /**
     * Luo taulukon, joka sisältää pelilaudalla olevat tikkukasat. Kasojen
     * sisältämien tikkujen määrät luodaan satunnaisesti.
     *
     * @return Taulukko, joka sisältää Stack-olioita.
     */
    public Stack[] createStacks() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int r = random.nextInt(10) + 1;
            Stack s = new Stack(r);
            stacks[i] = s;
        }
        return stacks;
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
        turn = 3 - turn;
    }

    public int getTurn() {
        return turn;
    }
    

    boolean ended() {
        return winner != 0;
    }
    
}


