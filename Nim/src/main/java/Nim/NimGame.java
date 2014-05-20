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


        System.out.println("Pelaaja 2, anna nimesi: ");
        String player2 = scanner.nextLine();
        p2 = new Player(player2);


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
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

    public Stack[] oneTurn(Stack[] stacks) { //Yksi pelivuoro
        System.out.println(currentPlayer.getName() + ", mistä kasasta haluat poistaa tikun?");
        for (int i = 0; i < stacks.length; i++) {
            System.out.println(stacks[i].toString());
        }

        int whichStack = Integer.parseInt(scanner.nextLine());

        while (whichStack <= 0 || whichStack > stacks.length || stacks[whichStack - 1].isEmpty()) {

            if (whichStack <= 0) {
                System.out.println("Valitse jokin nollaa suurempi luku.");
            } else if (whichStack > stacks.length) {
                System.out.println("Kasoja on vähemmän kuin " + whichStack + ", anna jokin muu luku.");
            }

            if (whichStack > 0 && whichStack <= stacks.length && stacks[whichStack - 1].isEmpty()) {
                System.out.println("Valitsemasi kasa on tyhjä, valitse jokin muu kasa.");
            }

            whichStack = Integer.parseInt(scanner.nextLine());

        }

        System.out.println("Kuinka monta tikkua haluat poistaa?");

        int amount = Integer.parseInt(scanner.nextLine());

        while (amount > stacks[whichStack - 1].getSize() || amount <= 0) {

            if (amount > stacks[whichStack - 1].getSize()) {
                System.out.println("Kasassa ei ole noin montaa tikkua, anna jokin muu luku.");
            } else if (amount <= 0) {
                System.out.println("Sinun on otettava vähintään yksi tikku");
            }
            amount = Integer.parseInt(scanner.nextLine());

        }
        stacks[whichStack - 1].decrease(amount);

        return stacks; //palauttaa taulukon, joka sisältää kasojen tilanteet tämän vuoron jälkeen.
    }

    public void oneRound(int round) { //Yksi kierros peliä

        Stack[] stacks = createStacks(round);

        boolean allStacksEmpty = false; //kertoo, ovatko kaikki kasat tyhjiä
        while (!allStacksEmpty) { //silmukan suoritusta jatketaan niin kauan, kuin yhdestäkin kasasta löytyy tavaraa.
            allStacksEmpty = true;
            if (currentPlayer == p1) { //Pelivuoro vaihtuu.
                currentPlayer = p2;
            } else {
                currentPlayer = p1;
            }
            oneTurn(stacks);

            for (int i = 0; i < stacks.length; i++) {
                if (!stacks[i].isEmpty()) {
                    allStacksEmpty = false;
                }
            }
        }
        if (currentPlayer == p1) {
            p1.increaseScore();
        } else {
            p2.increaseScore();
        }

        System.out.println("Kierroksen " + round + " voittaja: " + currentPlayer.toString());
        System.out.println();
    }

    public Stack[] createStacks(int n) {
        Random random = new Random();
        Stack[] stacks = new Stack[n + 1];
        for (int i = 0; i < n + 1; i++) {
            int r = random.nextInt(10) + 1;
            Stack s = new Stack(r);
            stacks[i] = s;
        }
        return stacks;
    }
}
