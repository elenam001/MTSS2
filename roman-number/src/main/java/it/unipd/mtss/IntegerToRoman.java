////////////////////////////////////////////////////////////////////
// Elena Marchioro 2009099
// Marco Favaretto 2000556
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman  {
    /**
     * Variabili statiche per indicare la dimensione della cifra
     */
    public static final int UNITA = 0;
    public static final int DECINE = 2;
    public static final int CENTINAIA = 4;
    public static final int MIGLIAIA = 6;

    /**
     * Alfabeto numerazione romana
     */
    private static char[] alfabeto = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

    /**
     * array di interi per contenere le cifre del numero da convertire
     * [migliaia, centinaia, decine, unita]
     * [   0,         1,        3,     4  ]
     */
    public static int a[] = new int[4];

}
