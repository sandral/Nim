/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

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
 * @author reipas
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
        //assertEquals("a 1 b 2 c  d 0 e 0 f 0 g 0 h 0 i 0 j 0 ", string);
        
        }
        
    /*
    @Test
    public void testGetPlayer() throws FileNotFoundException, IOException {
        s.readScoreList();
        String aakkoset = "abcdefghijklmnopqrstuvxyz";
        for (int i = 0; i < 10; i++) {
            Player p = new Player(""+aakkoset.charAt(i));
            p.setScore(i);
            assertEquals(p.getName(), s.getPlayer(aakkoset.charAt(i) + "").getName());
            assertEquals(p.getScore(), s.getPlayer(aakkoset.charAt(i) + "").getScore());
        }
    }*/
    
    @Test
    public void testGetPlayer2() {
        String aakkoset = "klmnopqrstuvxyz";
        for (int i = 0; i < 10; i++) {
            Player p = new Player(""+aakkoset.charAt(i));
            assertEquals(p.getName(), s.getPlayer(aakkoset.charAt(i) + "").getName());
            assertEquals(0, s.getPlayer(aakkoset.charAt(i)+"").getScore());
        }
    }
    
    @Test
    public void testIncreaseAndAddScores() throws FileNotFoundException, IOException {
        String aakkoset = "klmnopqrstuvxyz";
        for (int i = 0; i < 10; i++) {
            Player p = s.getPlayer(aakkoset.charAt(i)+"");
            p.setScore(i);
        }
        s.saveToFile();
        s.readScoreList();
        for (int i = 0; i < 10; i++) {
            assertEquals(aakkoset.charAt(i)+"", s.getPlayer(aakkoset.charAt(i)+"").getName());
            assertEquals(i, s.getPlayer(aakkoset.charAt(i)+"").getScore());
        }
    }
   
            
    }

    



