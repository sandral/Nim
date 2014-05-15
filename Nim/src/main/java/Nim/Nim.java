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
                   
         NimGame game = new NimGame();
         
         game.newMatch();
     }
}
