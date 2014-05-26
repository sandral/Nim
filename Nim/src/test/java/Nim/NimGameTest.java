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

    static NimGame nim;

    public NimGameTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        nim = new NimGame();

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
        Stack[] s = nim.createStacks();
        assertEquals(5, s.length);
    }

    @Test
    public void stacksAreNotEmpty() {
        Stack[] s = nim.createStacks();
        for (int i = 0; i < 5; i++) {
            assertFalse(s[i].isEmpty());
        }
    }

    @Test
    public void testRemoveOne() {
        Stack[] s = nim.createStacks();
        int size = s[0].getSize();
        nim.removeSticks(0, 1);
        assertEquals(size - 1, s[0].getSize());
    }

    @Test
    public void testRemoveAll() {
        Stack[] s = nim.createStacks();
        for (int i = 0; i < 5; i++) {
            int size = s[i].getSize();
            System.out.println(size);
            nim.removeSticks(i, size);
            System.out.println(s[i].getSize());
            assertTrue(s[i].isEmpty());
        }
        System.out.println("");
        System.out.println("");
    }

    @Test
    public void testRemoveRandom() {
        Stack[] s = nim.createStacks();
        Random random = new Random();
        int size = s[0].getSize();
        int r = random.nextInt(size) + 1;
        nim.removeSticks(0, r);

        assertEquals(size - r, s[0].getSize());
    }

    @Test
    public void testRemoveRandom2() {
        Stack[] s = nim.createStacks();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int size = s[i].getSize();
            int r = random.nextInt(size) + 1;
            nim.removeSticks(i, r);
            assertEquals(size - r, s[i].getSize());
        }

    }
}
