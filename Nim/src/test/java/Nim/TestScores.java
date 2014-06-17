/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

import Nim.logic.NimApplication;
import Nim.logic.Player;
import Nim.logic.Scores;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 *
 */
public class TestScores {

    Scores s = new Scores("testfile.txt");

    public TestScores() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAddScore() {
        String aakkoset = "abcdefghijklmnopqrstuvxyz";
        for (int i = 0; i < 10; i++) {
            Player p = new Player("" + aakkoset.charAt(i));
            s.getPlayer(p.getName());
            p.setScore(i);
            s.getScoreList().put(p.getName(), p);
            s.saveToFile();
            assertEquals(aakkoset.charAt(i) + "", p.getName());
            assertEquals(i, p.getScore());
        }
    }

    @Test
    public void testReadScoreList() throws FileNotFoundException, IOException {
        s.readScoreList();
        String aakkoset = "abcdefghijklmnopqrstuvxyz";
        String string = "";
        for (Entry<String, Player> entry : s.getScoreList().entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue().getScore();
            string += key + " " + value + " ";
        }
        System.out.println(string);
        assertEquals("a 0 b 1 c 2 d 3 e 4 f 5 g 6 h 7 i 8 j 9 ", string);

    }

    @Test
    public void testGetPlayer() throws FileNotFoundException, IOException {
        s.readScoreList();
        String aakkoset = "abcdefghijklmnopqrstuvxyz";
        for (int i = 0; i < 10; i++) {
            Player p = new Player("" + aakkoset.charAt(i));
            p.setScore(i);
            assertEquals(p.getName(), s.getPlayer(aakkoset.charAt(i) + "").getName());
            assertEquals(p.getScore(), s.getPlayer(aakkoset.charAt(i) + "").getScore());
        }
    }

    @Test
    public void testGetPlayer2() {
        String aakkoset = "klmnopqrstuvxyz";
        for (int i = 0; i < 10; i++) {
            Player p = new Player("" + aakkoset.charAt(i));
            s.getPlayer(p.getName());
            assertEquals(p.getName(), s.getPlayer(aakkoset.charAt(i) + "").getName());
            assertEquals(0, s.getPlayer(aakkoset.charAt(i) + "").getScore());
        }
    }

    @Test
    public void testIncreaseAndAddScores() throws FileNotFoundException, IOException {
        String aakkoset = "klmnopqrstuvxyz";
        for (int i = 0; i < 10; i++) {
            Player p = s.getPlayer(aakkoset.charAt(i) + "");
            p.setScore(i);
        }
        s.saveToFile();
        s.readScoreList();
        for (int i = 0; i < 10; i++) {
            assertEquals(aakkoset.charAt(i) + "", s.getPlayer(aakkoset.charAt(i) + "").getName());
            assertEquals(i, s.getPlayer(aakkoset.charAt(i) + "").getScore());
        }
    }
}
