/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim.ui;

import Nim.logic.NimApplication;
import Nim.logic.Scores;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Tekstikäyttöliittymä -luokka
 */
public class NimText {

    static Scanner scanner;
    static NimApplication application;

    public static void main(String[] args) throws FileNotFoundException, IOException {
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

    /**
     * Metodi, joka hallinnoi pelin pelaamista.
     */
    private static void playGame() throws FileNotFoundException, IOException {
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
            p2 = scanner.nextLine();
            if (p2.trim().equals("")) {
                System.out.println("Nimi ei voi olla tyhjä");
            }
        }

        application.startGame(p1, p2);
        System.out.println("Peli alkaa!");
        System.out.println("");


        while (application.gameStarted()) {
            int[] ss = application.stackSizes();
            for (int i = 0; i < ss.length; i++) {
                for (int j = 0; j < ss[i]; j++) {
                    System.out.print("|");
                }
                System.out.println("");
            }
            System.out.println();
            if (application.gameEnded()) {
                application.increaseWinnerScore();
                break;
            }
            System.out.println("Pelaaja " + application.currentPlayer().getName()
                    + ", mistä kasasta haluat poistaa tikkuja?");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("Kuinka monta tikkua haluat poistaa?");
            int amount = Integer.parseInt(scanner.nextLine());

            if (!application.makeMove(index - 1, amount)) {
                System.out.println("Laiton siirto!");
            }
        }

        if (application.getLastWinner().getName().equals(p1)) {
            System.out.println("Voittaja on " + p1);
        } else {
            System.out.println("Voittaja on " + p2);
        }
                
    }

    /**
     * Metodi, joka näyttää pelaajien pistesaldon.
     */
    
    private static void showScores() throws FileNotFoundException, IOException {
        application.getScorelist().readScoreList();
        System.out.println("");
        System.out.println(application.getScorelist().toString());
    }
}
