package tests;

import com.company.Finder;
import static org.junit.Assert.*;

public class FinderTest {

    private Finder finder1 = new Finder("src/tests/test1.txt");
    private Finder finder2 = new Finder("src/tests/test2.txt");
    private Finder finder3 = new Finder("src/tests/test3.txt");
    private Finder finder4 = new Finder("src/tests/test4.txt");
    private Finder finder5 = new Finder("src/tests/test5.txt");

    @org.junit.Test
    public void testFirstFile() {
        assertEquals("C", finder1.returnResult());
    }
    @org.junit.Test
    public void testSecondFile() {
        assertEquals("3", finder2.returnResult());
    }
    @org.junit.Test
    public void testThirdFile() {
        assertEquals("3", finder3.returnResult());
    }
    @org.junit.Test
    public void testFourthFile() {
        assertEquals("B", finder4.returnResult());
    }
    @org.junit.Test
    public void testFiveFile() {
        assertEquals("", finder5.returnResult());
    }
}