/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim.logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Scores {

    private Map<String, Integer> scoreList;
    private String sf;

    public Scores() {
        scoreList = new TreeMap();
        sf = "scores.txt";
    }

    static Scores initScorelist() {
        return new Scores();

    }
    
    public Map<String, Integer> readScoreList() throws FileNotFoundException, IOException {
        String line1 = "";
        int line2 = 0;
        File file = new File(sf);
        BufferedReader br = new BufferedReader(new FileReader(file));
        line1 = br.readLine();
        while (line1 != null) {
            line2 = Integer.parseInt(br.readLine());
            scoreList.put(line1, line2);
            line1 = br.readLine(); 
        }
        return scoreList;
    }

    
    public Player getPlayer(String sp) {
        return new Player(sp);
    }

    public void addScore(Player sp) {
        scoreList.put(sp.name, sp.score);
    }

    public String toString() {
        String s = "";
        for (Entry<String, Integer> entry : scoreList.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            s = key + " " + value + "\n" + s;
        }
        return s;
    }

    public void saveToFile() {
        String s = "";
        for (Entry<String, Integer> entry : scoreList.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            s = key + "\n" + value + "\n" + s;
        }
        try {
            File file = new File(sf);
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(s);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
