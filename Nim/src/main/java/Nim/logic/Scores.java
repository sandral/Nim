/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim.logic;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author reipas
 */
public class Scores {
    private static Map<String, Integer> scoreList;
    private static final String scoresFile = "scores.txt";

    public Scores() {
        scoreList = new TreeMap();
    }
    
    static Scores initScorelist() {
        return new Scores();
    }
    
    public boolean isOnList(String player) throws IOException {
        boolean ret = false;
        BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line1 = br.readLine();
            
            while (line1 != null) {
                sb.append(line1);
                sb.append(System.lineSeparator());
                line1 = br.readLine();
                if (line1.toLowerCase().equals(player.toLowerCase())) {
                    ret = true;
                    break;
                }
            }
            String everything = sb.toString();
        } finally {
            
            br.close();
            return ret;
        }
        
    }
    
    
    public Player getPlayer(String p) throws IOException {
        Player player = null;
        BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line1 = br.readLine();
            
            while (line1 != null) {
                sb.append(line1);
                sb.append(System.lineSeparator());
                line1 = br.readLine();
                if (line1.toLowerCase().equals(p.toLowerCase())) {
                    int line2 = Integer.parseInt(br.readLine());
                    player = new Player(line1, line2);
                    break;
                }
            }
            String everything = sb.toString();
        } finally {
            
            br.close();
            
        }
        return player;
    }
    
    public void addScore(Player sp) {
        scoreList.put(sp.name, sp.score);
        }
    
    public String toString() {
        String s = "";
        for(Entry<String, Integer> entry: scoreList.entrySet()) {
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
