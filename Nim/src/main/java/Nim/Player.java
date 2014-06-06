/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

/**
 * Luokka, joka kuvailee pelaaja-olion.
 */
public class Player {
    
    String name;
    int score;
    
/**
 * Konstruktori
 * @param Pelaajan nimi
 */
    public Player(String sp) {
        score = 0;
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
    
    @Override
    public String toString() {
        return "pelaajan nimi: " + name + ", pisteet: " + score;
    }
    
    

}
