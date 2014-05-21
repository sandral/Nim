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


        System.out.println("---------");
        System.out.println("Nim -peli");
        System.out.println("---------");
        System.out.println("");
        System.out.println("Anna jokin kirjain:");
        System.out.println("[A] Aloita peli");
        System.out.println("[P] Selaa pistelistaa");
        System.out.println("[L] Lopeta Nim");

        while (true) {
            System.out.print("> ");
            String s = scanner.nextLine();

            if (s.trim().toUpperCase().equals("A")) {
                playGame();
            } else if (s.trim().toUpperCase().equals("P")) {
                showScores();
            } else if (s.trim().toUpperCase().equals("L")) {
                System.exit(0);
            } else {
                System.out.println("Käskyä ei tunnistettu.");
            }
        }
    }

    private static void playGame() {
        String p1, p2;

        p1 = "";
        p2 = "";
        while (p1.trim().equals("")) {
            System.out.println("Anna pelaajan 1 nimi:");
            p1 = scanner.nextLine();
            if (p1.trim().equals("")) {
                System.out.println("Nimi ei voi olla tyhjä");
            }
        }
        while (p2.trim().equals("")) {
            System.out.println("Anna pelaajan 2 nimi:");
            p1 = scanner.nextLine();
            if (p1.trim().equals("")) {
                System.out.println("Nimi ei voi olla tyhjä");
            }
        }

        application.startGame(p1, p2);
    }

    private static void showScores() {
    }

}
