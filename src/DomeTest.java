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

}