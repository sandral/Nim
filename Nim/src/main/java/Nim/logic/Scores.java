/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim.logic;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author reipas
 */
public class Scores {
    private static Map<String, Integer> scoreList;
    private static final String scoresFile = "tiedosto.txt";

    public Scores() {
        scoreList = new TreeMap();
    }
    
    static Scores initScorelist() {
        return new Scores();
    }
    
    
    public void addScore(Player sp) {
        scoreList.put(sp.name, sp.score);
        }
    
    public String toString() {
        String s = "";
        for(Entry<String, Integer> entry: scoreList.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            s = key + " " + value + "\n" + s;
        }
        return s;
    }
    
    
        
    }
