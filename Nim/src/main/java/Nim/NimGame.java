package Nim;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class NimGame {

    Scanner scanner = new Scanner(System.in);
    int turn;
    int winner;
    Stack[] stacks;

    public NimGame() {
        turn = 1;
        winner = 1;        
        stacks = new Stack[5];
    }
    
    
    public Stack[] createStacks() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int r = random.nextInt(10) + 1;
            Stack s = new Stack(r);
            stacks[i] = s;
        }
        return stacks;
    }


    public Stack[] getStacks() {
        return stacks;
    }

    public void removeSticks(int index, int number) {
        if (number > 0 && number <= stacks[index].getSize() && !stacks[index].isEmpty()) {
            stacks[index - 1].decrease();
        }
        turn = 3 - turn;
    }
}
