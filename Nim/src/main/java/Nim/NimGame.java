package Nim;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class NimGame {

    Scanner scanner = new Scanner(System.in);
    Player p1;
    Player p2;
    Player currentPlayer;
    int round;

    public NimGame(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void newMatch() {

        System.out.println("Peli alkaa!");

        round = 0;

        while (round <= 8) {
            round = round + 1;
            System.out.println(round + ". kierros");


            oneRound(round);


        }
    }

    public int[] oneTurn(int[] stacks) { //Yksi pelivuoro
        System.out.println("asdjflkasjdfölkajsdölkfja");
        for (int i = 0; i < stacks.length; i++) {
            for (int j = 0; j < stacks[i]; j++) {
                System.out.print("|");
            }
            System.out.println();
        }
        int amount = Integer.parseInt(scanner.nextLine());
        int whichStack = Integer.parseInt(scanner.nextLine());

        stacks[whichStack] = stacks[whichStack] - amount;

        return stacks; //palauttaa taulukon, joka sisältää kasojen tilanteet tämän vuoron jälkeen.
    }

    public void oneRound(int round) { //Yksi kierros peliä
        System.out.println("lallalllalla");
        int[] stacks = createStacks(round + 1);
        /*for (int i = 0; i < stacks.length; i++) {
         System.out.println(stacks[i]);
         }*/
        boolean kissa = false; //kertoo, ovatko kaikki kasat tyhjiä
        while (!kissa) { //silmukan suoritusta jatketaan niin kauan, kuin yhdestäkin kasasta löytyy tavaraa.
            kissa = true;
            oneTurn(stacks);
            
            for (int i = 0; i < stacks.length; i++) {
                if (stacks[i] > 0) {
                    kissa = false;
                }
            }
        }
        System.out.println("kissa");

    }

    public int[] createStacks(int n) {
        Random random = new Random();
        int[] stacks = new int[n];
        for (int i = 0; i < n; i++) {
            int stack = random.nextInt(10) + 1;
            stacks[i] = stack;
        }
        return stacks;
    }
}
