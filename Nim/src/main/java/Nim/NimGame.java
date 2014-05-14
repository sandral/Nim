package Nim;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class NimGame {

    public NimGame() {
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

        int round = 0;
        boolean continueGame = true;

        Player currentPlayer = p1;

        while (continueGame) {
            round = round + 1;
            System.out.println(round + ". kierros");
            int[] stacks = createStacks(round + 1);

                        
            System.out.println(currentPlayer.getName() + ", valitse kuinka monta tikkua haluat poistaa ja mistä kasasta.");

            for (int i = 0; i < stacks.length; i++) {
                for (int j = 0; j < stacks[i]; j++) {
                    System.out.print("|");
                }
                System.out.println();
            }
            int amount = Integer.parseInt(scanner.nextLine());
            int whichStack = Integer.parseInt(scanner.nextLine());
            
            stacks[whichStack] = stacks[whichStack] - amount;
            
            

            System.out.println("Jatketaanko? k/e");
            String answer = scanner.nextLine();
            if (answer.equals("e")) {
                continueGame = false;
            }
        }
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
