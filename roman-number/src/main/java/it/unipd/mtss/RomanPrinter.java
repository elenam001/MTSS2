////////////////////////////////////////////////////////////////////
// Elena Marchioro 2009099
// Marco Favaretto 2000556
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    /**
     * ASCII-ART per lettera I
     */
    private static String[] lettera_I = { 
        "  _____ ", 
        " |_   _|", 
        "   | |  ", 
        "   | |  ", 
        "  _| |_ ", 
        " |_____|" 
    };
    /**
     * ASCII-ART per lettera V
     */
    private static String[] lettera_V = {
        " __      __",
        " \\ \\    / /",
        "  \\ \\  / / ",
        "   \\ \\/ /  ",
        "    \\  /   ",
        "     \\/    "
    };
    /**
     * ASCII-ART per lettera X
     */
    private static String[] lettera_X = {
        " __   __",
        " \\ \\ / /",
        "  \\ V / ",
        "   > <  ",
        "  / . \\ ",
        " /_/ \\_\\"
    };
    /**
     * ASCII-ART per lettera L
     */
    private static String[] lettera_L = {
        "  _      ",
        " | |     ",
        " | |     ",
        " | |     ",
        " | |____ ",
        " |______|"
    };
    /**
     * ASCII-ART per lettera C
     */
    private static String[] lettera_C = {
        "   _____ ",
        "  / ____|",
        " | |     ",
        " | |     ",
        " | |____ ",
        "  \\_____|"
    };
    /**
     * ASCII-ART per lettera D
     */
    private static String[] lettera_D = {
        "  _____  ",
        " |  __ \\ ",
        " | |  | |",
        " | |  | |",
        " | |__| |",
        " |_____/ "
    };
    /**
     * ASCII-ART per lettera M
     */
    private static String[] lettera_M = {
        "  __  __ ",
        " |  \\/  |",
        " | \\  / |",
        " | |\\/| |",
        " | |  | |",
        " |_|  |_|"
    };

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    
    private static String printAsciiArt(String romanNumber){
        //TODO
        return null;
    }
}
