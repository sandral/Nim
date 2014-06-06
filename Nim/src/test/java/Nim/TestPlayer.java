/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

import java.util.Random;
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
public class TestPlayer {

    static Random random;
    static String s;
    static Player p1;
    static Player p2;
    
    public TestPlayer() {
    }

    @BeforeClass
    public static void setUpClass() {
        random = new Random();
        s = "abcdefghijklmnopqrstuvxyzåäö";
        p1 = new Player("p");
        p2 = new Player("p");
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
    public void scoreOnAlussaNolla() {
        assertEquals(0, p2.getScore());
    }
    
    @Test
    public void testIncreaseScore() {
        for (int i = 0; i < 10; i++) {
            p1.increaseScore();
            assertEquals(i+1, p1.getScore());
        }
    }
    
    @Test
    public void testIncreaseScoreRandom() {
        for (int i = 0; i < 5; i++) {
            Player p = new Player("p");
            int r = random.nextInt(10);
            for (int j = 0; j < r; j++) {
                p.increaseScore();
            }
            assertEquals(r, p.getScore());
        }
    }
    

}
