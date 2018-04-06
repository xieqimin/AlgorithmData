import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DomeTest {
    @Test
    void doTest(){
        int[][] a={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        assertTrue(Dome.findNum(a,7));
        assertTrue(Dome.findNum(a,2));
        assertFalse(Dome.findNum(a,5));
        assertFalse(Dome.findNum(a,17));

    }
    @Test
    void doTest1(){
        assertEquals(1,Dome.NumberOf1(8));
        assertEquals(2,Dome.NumberOf1(9));
        assertEquals(1,Dome.NumberOf1(64));
        assertEquals(3,Dome.NumberOf1(13));
        assertEquals(1,Dome.NumberOf1(1));
        assertEquals(0,Dome.NumberOf1(0));

    }

}