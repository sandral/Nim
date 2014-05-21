/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

public class Player {
    
    String name;
    int score;
    
    public Player() {
        this.score = 0;
    }

    public String getName() {
        return name;
    }
    public void increaseScore() {
        score = (getScore() + 1);
    }
    
       public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "pelaajan nimi: " + name + ", pisteet: " + score;
    }
    
    

}
