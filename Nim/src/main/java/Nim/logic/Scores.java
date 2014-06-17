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
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * Tuloslista-luokka.
 *
 */
public class Scores {

    private Map<String, Player> scoreList;
    private static String sf;

    /**
     * Konstruktori.
     */
    public Scores(String sf) {
        scoreList = new TreeMap();
        this.sf = sf;
    }

    /**
     * Getteri.
     *
     * @return TreeMap, jonka avain on pelaajan nimi ja arvo pelaajan pistemäärä
     */
    public Map<String, Player> getScoreList() {
        return scoreList;
    }

    /**
     * Hakee tiedostosta pelaajien nimet ja pistemäärät, luo nimeä ja 
     * pistemäärää vastaavat pelaajat, ja sijoittaa ne treemappiin.
     * 
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void readScoreList() throws FileNotFoundException, IOException {
        String line1 = "";
        int line2 = 0;
        File file = new File(sf);
        BufferedReader br = new BufferedReader(new FileReader(file));
        line1 = br.readLine();
        while (line1 != null) {
            line2 = Integer.parseInt(br.readLine());
            Player p = new Player(line1);
            p.setScore(line2);
            scoreList.put(line1, p);
            line1 = br.readLine();
        }
    }

    /**
     * Etsii listasta pelaajan nimen perusteella.
     * Jos pelaajaa ei löydy, luodaan uusi samalla nimellä varustettu
     * pelaaja, jonka pistemäärä on 0.
     * @param sp Pelaajan nimi
     * @return Pelaaja, jonka nimi ja pistemäärä vastaa haetun pelaajan nimeä ja
     * pistemäärää.
     */
    public Player getPlayer(String sp) {
        if (scoreList.containsKey(sp)) {
            return scoreList.get(sp);
        } else {
            Player p = new Player(sp);
            scoreList.put(sp, p);
            return p;
        }
    }

    public String toString() {
        String s = "";
        for (Entry<String, Player> entry : scoreList.entrySet()) {
            String key = entry.getKey();
            Player value = entry.getValue();
            s = key + " " + value.getScore() + "\n" + s;
        }
        return s;
    }
    /**
     * Luo listan, jossa pelaajat on järjestetty pistemäärän perusteella
     * laskevaan suuruusjärjestykseen.
     * @return Merkkijono, joka sisältää pistelistalla olevien pelaajien 
     * nimet ja pistemäärät omilla riveillään.
     */
    public String toRankingString() {
        PriorityQueue<Player> q = new PriorityQueue<Player>(10);
        q.addAll(scoreList.values());
        String s = "";
        while (!q.isEmpty()) {
            Player p = q.poll();
            s += p.getName() + " " + p.getScore() + "\n";
        }
        return s;
    }

    /**
     * Tallentaa pistelistan sisältämien pelaajien nimet ja pisteet 
     * tiedostoon.
     */
    public void saveToFile() {
        String s = "";
        for (Entry<String, Player> entry : scoreList.entrySet()) {
            String key = entry.getKey();
            Player value = entry.getValue();
            s = key + "\n" + value.getScore() + "\n" + s;
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
