/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

import Nim.logic.NimApplication;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.omg.CORBA.portable.ApplicationException;

/**
 *
 * @author reipas
 */
public class TestNimApplication {

    NimApplication application;

    public TestNimApplication() throws FileNotFoundException, IOException {
        application = new NimApplication();
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
    public void test1() {
        assertEquals(null, application.currentGame);
        assertEquals(null, application.p1);
        assertEquals(null, application.p2);
        assertEquals(null, application.winner);
    }

    @Test
    public void testStartGame() throws FileNotFoundException, IOException {
        application.startGame("p1", "p2");
        assertFalse(application.currentGame == null);
        assertTrue(application.gameStarted());

    }

    @Test
    public void testStackSizes() throws FileNotFoundException, IOException {
        application.startGame("p1", "p2");
        assertFalse(application.stackSizes() == null);
        Random random = new Random();
        int length = application.stackSizes().length;
        for (int i = 0; i < length; i++) {
            assertTrue(application.stackSizes()[i] > 0);
            assertTrue(application.stackSizes()[i] <= 10);
        }
        for (int i = 0; i < length; i++) {
            int size = application.stackSizes()[i];
            application.makeMove(i, 1);
            assertEquals(size - 1, application.stackSizes()[i]);
        }
        for (int i = 0; i < length; i++) {
            int size = application.stackSizes()[i];
            int r = random.nextInt() + 100;
            application.makeMove(i, r);
            assertEquals(size, application.stackSizes()[i]);
        }
        for (int i = 0; i < length; i++) {
            int size = application.stackSizes().length;
            application.makeMove(i, 0);
            assertEquals(size, application.stackSizes().length);
        }
        for (int i = 0; i < length; i++) {
            int size = application.stackSizes().length;
            int r = random.nextInt() - 100;
            application.makeMove(i, r);
            assertEquals(size, application.stackSizes().length);
        }



    }

    @Test
    public void testCurrentPlayerName() throws FileNotFoundException, IOException {
        Random random = new Random();
        application.startGame("p1", "p2");
        assertEquals("p1", application.currentPlayer().getName());
        application.makeMove(0, 1);
        assertEquals("p2", application.currentPlayer().getName());
        application.makeMove(1, 1);
        assertEquals("p1", application.currentPlayer().getName());
        application.makeMove(2, 1);
        assertEquals("p2", application.currentPlayer().getName());
        application.makeMove(3, 1);
        assertEquals("p1", application.currentPlayer().getName());
        application.makeMove(4, 1);
        assertEquals("p2", application.currentPlayer().getName());
        application.makeMove(100, 100);
        assertEquals("p2", application.currentPlayer().getName());
        application.makeMove(0, 10);
        assertEquals("p2", application.currentPlayer().getName());
        application.makeMove(0, 0);
        assertEquals("p2", application.currentPlayer().getName());
        application.makeMove(1, 0);
        assertEquals("p2", application.currentPlayer().getName());
        application.makeMove(2, 0);
        assertEquals("p2", application.currentPlayer().getName());
        application.makeMove(3, 0);
        assertEquals("p2", application.currentPlayer().getName());
        application.makeMove(4, 0);
        assertEquals("p2", application.currentPlayer().getName());
        application.makeMove(0, 10);
        assertEquals("p2", application.currentPlayer().getName());
        application.makeMove(1, 10);
        assertEquals("p2", application.currentPlayer().getName());
        application.makeMove(2, 10);
        assertEquals("p2", application.currentPlayer().getName());
        application.makeMove(3, 10);
        assertEquals("p2", application.currentPlayer().getName());
        application.makeMove(4, 10);
        assertEquals("p2", application.currentPlayer().getName());
    }
}
