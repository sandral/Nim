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
public class NimGameTest {

    public NimGameTest() {
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
    public void testCreateStacks() {
        NimGame nim = new NimGame();
        nim.createStacks();
        Stack[] s = nim.getStacks();
        assertEquals(5, s.length);
    }

    @Test
    public void stacksAreNotEmpty() {
        NimGame nim = new NimGame();
        nim.createStacks();
        Stack[] s = nim.getStacks();
        assertFalse(nim.stacksAreEmpty());
        assertFalse(nim.ended());
    }

    @Test
    public void testRemoveOne() {
        NimGame nim = new NimGame();
        nim.createStacks();
        Stack[] s = nim.getStacks();
        int size = s[0].getSize();
        nim.removeSticks(0, 1);
        assertEquals(size - 1, s[0].getSize());
        assertFalse(nim.stacksAreEmpty());
        assertFalse(nim.ended());
        assertEquals(2, nim.getTurn());
    }

    @Test
    public void testRemoveAll() {
        NimGame nim = new NimGame();
        nim.createStacks();
        Stack[] s = nim.getStacks();
        for (int i = 0; i < 5; i++) {
            int size = s[i].getSize();
            System.out.println("i: " + i);
            System.out.println("turn before move: " + nim.getTurn());
            nim.removeSticks(i, size);
            System.out.println("size: " + s[i].getSize());
            System.out.println("turn after move: " + nim.getTurn());
            if (i % 2 == 0 && !nim.ended()) {
                assertEquals(2, nim.getTurn());
            } else if (i % 2 != 0 && nim.ended()) {
                assertEquals(1, nim.getTurn());
            }
        }
        assertTrue(nim.stacksAreEmpty());
        assertTrue(nim.ended());
    }

    @Test
    public void testRemoveRandom() {
        NimGame nim = new NimGame();
        nim.createStacks();
        Stack[] s = nim.getStacks();
        Random random = new Random();
        int size = s[0].getSize();
        int r = random.nextInt(size) + 1;
        nim.removeSticks(0, r);

        assertEquals(size - r, s[0].getSize());
    }

    @Test
    public void testRemoveRandom2() {
        NimGame nim = new NimGame();
        nim.createStacks();
        Stack[] s = nim.getStacks();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int size = s[i].getSize();
            int r = random.nextInt(size) + 1;
            nim.removeSticks(i, r);
            assertEquals(size - r, s[i].getSize());
        }

    }
}
