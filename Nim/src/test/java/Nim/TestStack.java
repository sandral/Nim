/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

import Nim.logic.Stack;
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


    public TestStack() {
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
    public void testGetSize() {
        for (int i = 0; i < 10; i++) {
            Stack s = new Stack(i);
            assertEquals(i, s.getSize());
        }
    }

    @Test
    public void testSetSize() {
        Stack stack = new Stack(1);
        for (int i = 0; i < 10; i++) {
            stack.setSize(i);
            assertEquals(i, stack.getSize());
        }
    }

    @Test
    public void testDecrease() {
        Stack stack = new Stack(17);
        for (int i = 0; i < 17; i++) {
            stack.decrease();
            assertEquals(16 - i, stack.getSize());
        }
    }

    @Test
    public void testIsEmpty() {
        Stack stack = new Stack(17);
        for (int i = 0; i < 17; i++) {
            stack.decrease();
        }
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testDecreaseRandom() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int r1 = random.nextInt(10);
            int r2 = random.nextInt(10);
            int r3 = 0;
            if (r1 >= r2) {
                r3 = r1 - r2;
            }
            Stack s = new Stack(r1);
            for (int j = 0; j < r2; j++) {
                if (!s.isEmpty()) {
                    s.decrease();
                }
            }
            assertEquals(r3, s.getSize());
        }
    }
}
