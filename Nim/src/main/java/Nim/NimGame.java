package Nim;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class NimGame {

    Scanner scanner = new Scanner(System.in);
    int round;
    Player p1;
    Player p2;
    Player currentPlayer;
    boolean p1Wins;
    boolean p2Wins;
    Stack[] stacks;
    

    public NimGame(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        currentPlayer = new Player();
        round = 0;
        p1Wins = false;
        p2Wins = false;
        stacks = new Stack[round + 2];
    }

    public Stack[] createStacks(int n) {
        Random random = new Random();
        for (int i = 0; i < n + 1; i++) {
            int r = random.nextInt(10) + 1;
            Stack s = new Stack(r);
            stacks[i] = s;
        }
        return stacks;
    }

    public int round() {
        return round;
    }
            
    public boolean player1isWinner() {
        return p1Wins;
    }

    public boolean player2isWinner() {
        return p2Wins;
    }

    public Player currentPlayer() {
        return currentPlayer;
    }

    public int chooseStack(int index) {
        if (index <= 0) {
            return -1;
        } else if (index > stacks.length - 1) {
            return -1;
        }
        if (stacks[index].isEmpty()) {
            return -1;
        }
        return index;
    }

    public void removeStick(int index) {
        if (!stacks[index].isEmpty()) {
            stacks[index - 1].decrease();
        }
    }
    
    
}
