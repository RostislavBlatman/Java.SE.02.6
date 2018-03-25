package test.java;

import main.java.NuclearSubmarine;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestNuclearSubmarine {

    NuclearSubmarine nuclSub = new NuclearSubmarine();

    @Test
    public void testForEngine() {
        nuclSub.move("e");
        assertEquals(nuclSub.getStateOfEngine(), true);
    }
    @Test
    public void testForRightMove() {
        nuclSub.changeStateOfEngine();
        nuclSub.move("d");
        assertEquals(nuclSub.getXcoordinate(), 7);
    }
    @Test
    public void testForForwardMove() {
        nuclSub.changeStateOfEngine();
        nuclSub.move("W");
        assertEquals(nuclSub.getYcoordinate(), 7);
    }
}
