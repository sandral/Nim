/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nim;

import java.util.Scanner;

public class Nim {
     
    static Scanner scanner = new Scanner(System.in);
    
     public static void main(String[] args) {
         System.out.println("Pelaaja 1:");
         String player1 = scanner.nextLine();
         
         System.out.println("Pelaaja 2:");
         String player2 = scanner.nextLine();
         
         Player p1 = new Player(player1);
         Player p2 = new Player(player2);
          
         NimGame game = new NimGame(p1, p2);
         
         game.newMatch();
     }
}
