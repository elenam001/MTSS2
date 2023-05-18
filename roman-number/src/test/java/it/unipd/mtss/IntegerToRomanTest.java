package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for IntegerToRoman
*/
public class IntegerToRomanTest {

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
    /**
     * Test per input n = 0
     */
    @Test
    public void testCasoInputZero() {
        try {
            assertEquals("", IntegerToRoman.convert(0));
            fail( "Lanciata eccezione" );
        } 
        catch (Exception e) {
            String expectedMessage = "0 non è convertibile in numerazione romana.";
            assertEquals( expectedMessage, e.getMessage() );
        } 
    }
    /** 
     * test per n < 0
     */
    @Test
    public void testCasoInputNegativo() {
        try {
        assertEquals("", IntegerToRoman.convert(-1));
        fail( "Lanciata eccezione" );
        } 
        catch (Exception e) {
            String expectedMessage = "Non e' possibile convertire un numero negativo.";
            assertEquals( expectedMessage, e.getMessage() );
        }
    }
    /** 
     * test per input n = 3999 
    */
    @Test
    public void testCasoInputMax() {
        assertEquals("MMMCMXCIX", IntegerToRoman.convert(3999));
    }
    /** 
     * test per n > 3999
    */
    @Test
    public void testCasoInputOltreIlMax() {
        try {
            assertEquals("", IntegerToRoman.convert(4000));
            fail( "Lanciata eccezione" );
        } 
        catch (Exception e) {
            String expectedMessage = "Massimo numero convertibile: 3999.";
            assertEquals( expectedMessage, e.getMessage() );
        }
    }

    /*
     * Test singole lettere
    */
    @Test
    public void testConvNumLett_I() {
        assertEquals("I", IntegerToRoman.convNumLett(1, IntegerToRoman.UNITA));
    }
    @Test
    public void testConvNumLett_V() {
        assertEquals("V", IntegerToRoman.convNumLett(5, IntegerToRoman.UNITA));
    }
    @Test
    public void testConvNumLett_X() {
        assertEquals("X", IntegerToRoman.convNumLett(1, IntegerToRoman.DECINE));
    }
    @Test
    public void testConvNumLett_L() {
        assertEquals("L", IntegerToRoman.convNumLett(5, IntegerToRoman.DECINE));
    }
    @Test
    public void testConvNumLett_C() {
        assertEquals("C", IntegerToRoman.convNumLett(1, IntegerToRoman.CENTINAIA));
    }
    @Test
    public void testConvNumLett_D() {
        assertEquals("D", IntegerToRoman.convNumLett(5, IntegerToRoman.CENTINAIA));
    }
    @Test
    public void testConvNumLett_M() {
        assertEquals("M", IntegerToRoman.convNumLett(1, IntegerToRoman.MIGLIAIA));
    }

    /**
     * Test per casi particolari: 4, 9, 40, 90, 400, 900
    */
    @Test
    public void testConvNumLett_4Unita() {
        assertEquals("IV", IntegerToRoman.convNumLett(4, IntegerToRoman.UNITA));
    }
    @Test
    public void testConvNumLett_9Unita() {
        assertEquals("IX", IntegerToRoman.convNumLett(9, IntegerToRoman.UNITA));
    }
    @Test
    public void testConvNumLett_4Decine() {
        assertEquals("XL", IntegerToRoman.convNumLett(4, IntegerToRoman.DECINE));
    }
    @Test
    public void testConvNumLett_9Decine() {
        assertEquals("XC", IntegerToRoman.convNumLett(9, IntegerToRoman.DECINE));
    }
    @Test
    public void testConvNumLett_4Centinaia() {
        assertEquals("CD", IntegerToRoman.convNumLett(4, IntegerToRoman.CENTINAIA));
    }
    @Test
    public void testConvNumLett_9Centinaia() {
        assertEquals("CM", IntegerToRoman.convNumLett(9, IntegerToRoman.CENTINAIA));
    }

    /**
     * Test conversione completa
    */
    @Test
    public void testConversione() {
        assertEquals("CCLVI", IntegerToRoman.convert(256));
    }
}
