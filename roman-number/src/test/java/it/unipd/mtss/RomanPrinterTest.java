package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanPrinterTest {
    /** 
     * Test singola lettera I
    */
    @Test
    public void test_I() {
        String i = "  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n";
        assertEquals(i, RomanPrinter.print(1));
    }
    /** 
     * Test singola lettera V
    */
    @Test
    public void test_V() {
        String v = " __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n";
        assertEquals(v, RomanPrinter.print(5));
    }
    /** 
     * Test singola lettera X
    */
    @Test
    public void test_X() {
        String x = " __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n";
        assertEquals(x, RomanPrinter.print(10));
    }
    /** 
     * Test singola lettera L
    */
    @Test
    public void test_L() {
        String l = "  _      \n | |     \n | |     \n | |     \n | |____ \n |______|\n";
        assertEquals(l, RomanPrinter.print(50));
    }
    /** 
     * Test singola lettera C
    */
    @Test
    public void test_C() {
        String c = "   _____ \n  / ____|\n | |     \n | |     \n | |____ \n  \\_____|\n";
        assertEquals(c, RomanPrinter.print(100));
    }
    /** 
     * Test singola lettera D
    */
    @Test
    public void test_D() {
        String d = "  _____  \n |  __ \\ \n | |  | |\n | |  | |\n | |__| |\n |_____/ \n";
        assertEquals(d, RomanPrinter.print(500));
    }
    /** 
     * Test singola lettera M
    */
    @Test
    public void test_M() {
        String m = "  __  __ \n |  \\/  |\n | \\  / |\n | |\\/| |\n | |  | |\n |_|  |_|\n";
        assertEquals(m, RomanPrinter.print(1000));
    }
}
