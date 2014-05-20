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
public class TestStack {

    static Stack stack1;
    static Stack stack2;
    static Stack stack3;

    public TestStack() {
    }

    @BeforeClass
    public static void setUpClass() {
        stack1 = new Stack(1, 1);
        stack2 = new Stack(1, 17);
        stack3 = new Stack(1, 3);
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
    public void testGetSize() {
        for (int i = 0; i < 10; i++) {
            Stack s = new Stack(i, i);
            assertEquals(i, s.getSize());
        }
    }

    @Test
    public void testSetSize() {
        for (int i = 0; i < 10; i++) {
            stack1.setSize(i);
            assertEquals(i, stack1.getSize());
        }
    }

    @Test
    public void testGetIndex() {
        for (int i = 0; i < 10; i++) {
            Stack s = new Stack(i, i);
            assertEquals(i, s.getIndex());
        }
    }

    @Test
    public void testDecrease() {
        for (int i = 0; i < 17; i++) {
            stack2.decrease(1);
            assertEquals(16 - i, stack2.getSize());
        }
    }

    @Test
    public void testIsEmpty() {
        for (int i = 0; i < 17; i++) {
            stack2.decrease(1);
        }
        assertTrue(stack2.isEmpty());
    }
   
    
    @Test
    public void testDecrease2() {
            stack3.decrease(3);
            assertTrue(stack3.isEmpty());
        }
    
    @Test
    public void testDecreaseRandom() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int r1 = random.nextInt(10);
            int r2 = random.nextInt(10);
            int r3 = 0;
            if (r1-r2 > 0) {
                r3 = r1-r2;
            }
            Stack s = new Stack(i, r1);
            s.decrease(r2);
            assertEquals(r3, s.getSize());            
        }
    }
    
}
