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
import org.omg.CORBA.portable.ApplicationException;

/**
 *
 * @author reipas
 */
public class TestNimApplication {

    NimApplication application = new NimApplication();

    public TestNimApplication() {
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
        assertEquals("", application.winner);
    }

    @Test
    public void testStartGame() {
        application.startGame("p1", "p2");
        assertFalse(application.currentGame == null);
        assertTrue(application.gameStarted());

    }
}
