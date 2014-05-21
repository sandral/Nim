/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

import java.util.Scanner;

public class NimText {

    static Scanner scanner;
    static NimApplication application;

    public static void main(String[] args) {
        application = new NimApplication();
        scanner = new Scanner(System.in);
        System.out.println("Pelaaja 1, anna nimesi: ");
        String n1 = scanner.nextLine();
        System.out.println("Pelaaja 2, anna nimesi: ");
        String n2 = scanner.nextLine();
        System.out.println("Peli alkaa!");
        
        while (application.gameOn) {
            System.out.println("Valitse mistä kasasta haluat poistaa tikun");
            
        }

    }
}
