package Nim;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class NimGame {

    Scanner scanner = new Scanner(System.in);
    int round;
    Player currentPlayer;
    Player p1;
    Player p2;

    public NimGame() {
    }

    public void newMatch() {
        currentPlayer = new Player("player"); //kulloinkin vuorossa oleva pelaaja
        System.out.println("Pelaaja 1, anna nimesi: ");
        String player1 = scanner.nextLine();
        p1 = new Player(player1);
        p1.setScore(0);

        System.out.println("Pelaaja 2, anna nimesi: ");
        String player2 = scanner.nextLine();
        p2 = new Player(player2);
        p2.setScore(0);

        System.out.println("Peli alkaa!");
        round = 0;

        while (round <= 2) { //pelissä kolme kierrosta
            round = round + 1;
            System.out.println(round + ". kierros");
            if (round % 2 == 0) {
                currentPlayer = p1;
            } else {
                currentPlayer = p2;
            }

            oneRound(round);

        }
        System.out.println("Pelaajan " + p1.getName() + " pisteet: " + p1.getScore());
        System.out.println("Pelaajan " + p2.getName() + " pisteet: " + p2.getScore());
    }

    public int[] oneTurn(int[] stacks) { //Yksi pelivuoro
        System.out.println(currentPlayer.getName() + ", mistä kasasta haluat poistaa tikun?");
        for (int i = 0; i < stacks.length; i++) {
            for (int j = 0; j < stacks[i]; j++) {
                System.out.print("|");
            }
            System.out.println();
        }

        int whichStack = Integer.parseInt(scanner.nextLine());

        while (whichStack > stacks.length || stacks[whichStack-1] == 0) {

            if (whichStack > stacks.length) {
                System.out.println("Kasoja on vähemmän kuin " + whichStack + ", anna jokin muu luku.");
            } else {
                System.out.println("Valitsemasi kasa on tyhjä, valitse jokin muu kasa.");
            }

            whichStack = Integer.parseInt(scanner.nextLine());

        }

        System.out.println("Kuinka monta tikkua haluat poistaa?");

        int amount = Integer.parseInt(scanner.nextLine());

        while (amount > stacks[whichStack-1]) {
            System.out.println("Kasassa ei ole noin montaa tikkua, anna jokin muu luku.");
            amount = Integer.parseInt(scanner.nextLine());

        }

        stacks[whichStack - 1] = stacks[whichStack - 1] - amount;



        return stacks; //palauttaa taulukon, joka sisältää kasojen tilanteet tämän vuoron jälkeen.
    }

    public void oneRound(int round) { //Yksi kierros peliä

        int[] stacks = createStacks(round + 1);
        /*for (int i = 0; i < stacks.length; i++) {
         System.out.println(stacks[i]);
         }*/
        boolean kissa = false; //kertoo, ovatko kaikki kasat tyhjiä
        while (!kissa) { //silmukan suoritusta jatketaan niin kauan, kuin yhdestäkin kasasta löytyy tavaraa.
            kissa = true;
            if (currentPlayer == p1) { //Pelivuoro vaihtuu.
                currentPlayer = p2;
            } else {
                currentPlayer = p1;
            }
            oneTurn(stacks);

            for (int i = 0; i < stacks.length; i++) {
                if (stacks[i] > 0) {
                    kissa = false;
                }
            }
        }
        if (currentPlayer == p1) {
            p1.increaseScore();
        } else {
            p2.increaseScore();
        }

        System.out.println("Peli päättyi, kierroksen " + round + " voittaja on: " + currentPlayer.getName());
        System.out.println();
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
