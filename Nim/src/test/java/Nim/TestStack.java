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
public class TestStack {

    static Stack stack1;
    static Stack stack2;

    public TestStack() {
    }

    @BeforeClass
    public static void setUpClass() {
        stack1 = new Stack(1, 1);
        stack2 = new Stack(1, 17);
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
        for (int i =0; i < 17; i++) {
            stack2.decrease(1);
            assertEquals(16 - i, stack2.getSize());
        }
    }
    
    @Test 
    public void testIsEmpty() {
        for (int i =0; i < 17; i++) {
            stack2.decrease(1);
        }
        assertTrue(stack2.isEmpty());
    }
    

}
