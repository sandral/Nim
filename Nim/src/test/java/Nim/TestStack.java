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

    static Stack stack1;
    static Stack stack2;
    static Stack stack3;

    public TestStack() {
    }

    @BeforeClass
    public static void setUpClass() {
        stack1 = new Stack(1);
        stack2 = new Stack(17);
        stack3 = new Stack(3);
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
        for (int i = 0; i < 10; i++) {
            stack1.setSize(i);
            assertEquals(i, stack1.getSize());
        }
    }

    @Test
    public void testDecrease() {
        for (int i = 0; i < 17; i++) {
            stack2.decrease();
            assertEquals(16 - i, stack2.getSize());
        }
    }

    @Test
    public void testIsEmpty() {
        for (int i = 0; i < 17; i++) {
            stack2.decrease();
        }
        assertTrue(stack2.isEmpty());
    }

    @Test
    public void testDecrease2() {
        for (int i = 0; i < 3; i++) {
            stack3.decrease();
        }
        assertTrue(stack3.isEmpty());
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
