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

    Scores s = new Scores();
    
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
            p.setScore(i);
            s.addScore(p);
        }
        assertFalse(s.toString().isEmpty());

        System.out.println(s.toString());

        s.saveToFile();

    }
    
    @Test
    public void testReadScoreList() throws FileNotFoundException, IOException {
        String aakkoset = "abcdefghijklmnopqrstuvxyz";
        String string = "";
        for (Entry<String, Integer> entry : s.readScoreList().entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            string += key + " " + value + " ";
        }
        assertEquals("a 0 b 1 c 2 d 3 e 4 f 5 g 6 h 7 i 8 j 9 ", string);
        
        }
        
    }

    



