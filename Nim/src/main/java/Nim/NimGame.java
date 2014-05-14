 /
package Nim;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;



public class NimGame {

    public NimGame() {
    }

    public Player getP1() {
        return p1;
    }

    public void setP1(Player p1) {
        this.p1 = p1;
    }

    public Player getP2() {
        return p2;
    }

    public void setP2(Player p2) {
        this.p2 = p2;
    }
    Player p1;
    Player p2;

    public void beginGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pelaaja 1: ");
        String player1 = scanner.nextLine();
        Player p1 = new Player(player1);

        System.out.println("Pelaaja 2: ");
        String player2 = scanner.nextLine();
        Player p2 = new Player(player2);

        System.out.println("Peli alkaa!");

        createStacks();

        //tikkujen tulostus tekstiversiota varten.
        for (Stack s : createStacks()) {

            for (int i = 0; i < s.count; i++) {
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public Stack[] createStacks() {
        Random random = new Random();
        Stack[] stacks = new Stack[3];
        for (int i = 0; i < 3; i++) {
            Stack s = new Stack(random.nextInt(10) + 1);
            stacks[i] = s;
        }
        return stacks;
    }

    public int reduceStack(Stack stack, int i) {
        stack.setCount(i);
        return i;
    }

}
