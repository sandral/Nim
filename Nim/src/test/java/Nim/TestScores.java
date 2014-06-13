/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

import Nim.logic.Player;
import Nim.logic.Scores;
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

        }
        
        
    }
    

