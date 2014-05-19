/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

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
public class Test1 {
    NimGame game;
        
    
    public Test1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        game = new NimGame();
    
        
    
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void kasojaOnAlussaKaksi() {
        int round = 1;
        int[] stacks = game.createStacks(1);
        assertEquals(2, stacks.length);
    }
    
    @Test
    public void kasojenMaaraKasvaaKierrostenMukaan() {
        for (int i = 1; i < 10; i++) {
            int round = i;
            int[] stacks = game.createStacks(i);
            assertEquals(round+1, stacks.length);
        }
    }
    
    
        
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
