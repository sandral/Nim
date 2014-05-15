/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

public class Player {
    
    String name;
    int score;
    
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void increaseScore() {
        score = score + 1;
    }
    
    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

}
