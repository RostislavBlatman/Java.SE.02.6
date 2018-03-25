package test.java;

import main.java.NuclearSubmarine;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestNuclearSubmarine {

    NuclearSubmarine ns = new NuclearSubmarine();

    @Before
    public void setUp() {
        ns.move("e");
        ns.move("W");
        ns.move("d");
    }

    @Test

    public void testForEngine() {
        assertEquals(ns.getStateOfEngine(), true);
    }
    @Test
    public void testForRightMove() {
        assertEquals(ns.getX(), 7);
    }
    @Test
    public void testForForwardMove() {
        assertEquals(ns.getY(), 7);
    }
}
