package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for IntegerToRoman
*/
public class TestIntToRoman {

    /**
     * Test conversione
    */
    @Test
    public void testScomposizione() {
        int[] prova = {0,2,3,1};
        IntegerToRoman.scomponi(231);
        int[] res = IntegerToRoman.a; 
        assertArrayEquals(prova, res);
    }
}
