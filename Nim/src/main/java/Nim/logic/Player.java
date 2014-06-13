package Nim.logic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Luokka, joka kuvailee pelaaja-olion.
 */
public class Player implements Comparable<Player> {
    
    String name;
    int score;
    
/**
 * Konstruktori
 * @param sp 
 */
    public Player(String sp, int score) {
        this.score = score;;
        name = sp;
    }
    
/**
 * Getteri, palauttaa pelaajan nimen.
 * @return pelaajan nimi.
 */
    public String getName() {
        return name;
    }
    
    /**
     * Kasvattaa pelaajan pistesaldoa
     */
    public void increaseScore() {
        score = (getScore() + 1);
    }
    
    /**
     * Getteri, palauttaa pelaajan pistesaldon.
     * @return pelaajan pistesaldo.
     */
       public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
    @Override
    public String toString() {
        return name + " " + score;
    }

    @Override
    public int compareTo(Player other) {
        return other.getScore() - this.score;
    }
    
    

}
