/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim.logic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Scores {

    private Map<String, Integer> scoreList;
    private String scoreFile;

    public Scores() {
        scoreList = new TreeMap();
    }

    static Scores initScorelist() {
        return new Scores();

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
            s = key + "\n" + value + "\n" + s;
        }
        return s;
    }

    public void saveToFile() {
        String s = this.toString();
        try {
            File file = new File("scores.txt");
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(s);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
