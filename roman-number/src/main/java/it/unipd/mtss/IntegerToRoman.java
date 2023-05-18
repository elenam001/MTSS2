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

    /**
     * <p>Assegna ad ogni cella di un array la cifra corrispondente
     * @param num
     * @return null
    */
    public static void scomponi(int num) {
        int var = 10;
        int dim = 4;
        for(int i = dim-1; i >= 0; i--) {
            if(num/var != 0) { 
                a[i] = num%var;
            } else {
                a[i] = num;
            }
            num/=var;
        }
    }

    /**
     * <p>Associa alla cifra e al valore (unita', decine, centinaia, migliaia)
     *    la/e corrispettiva/e lettera/e della numerazione romana 
     * @param n cifra da convertire
     * @param dim odg della cifra da convertire
     * @return lettera/e della cifra in versione romana
    */
    public static String convNumLett(int n, int dim) {
        String s = "";
        if(n >= 5) {
            if(n == 9) { s += alfabeto[dim]; s += alfabeto[dim+2]; }
            else {
                s += alfabeto[dim+1];
                for(int i = 5; i < n; i++) s += alfabeto[dim];
            }
        } else {
            if(n == 4) { s += alfabeto[dim]; s += alfabeto[dim+1]; }
            else {
                for(int i = 0; i < n; i++) s += alfabeto[dim];
            }
        }
        return s;
    }

    /**
     * <p>Converte un numero da integer [1,3999] a numerazione romana  
     * @param number numero da convertire
     * @return number come Stringa in numerazione romana
    */
    public static String convert(int number) {
        String s = "";
        if(number == 0) { 
            throw new IllegalArgumentException("0 non è convertibile in numerazione romana.");
        }
        else if(number < 0) { 
            throw new IllegalArgumentException("Non e' possibile convertire un numero negativo.");
        }
        else if(number > 3999) { 
            throw new IllegalArgumentException("Massimo numero convertibile: 3999.");
        }
        else {
            //scomporre numero
            scomponi(number);
            //associare ad ogni cifra la lettera corrispondente
            for(int i = 0; i < 4; i++) {
                switch(i) {
                    case 0: //caso migliaia: 1000
                        s += convNumLett(a[i], MIGLIAIA);
                        break;
                    case 1: //caso centinaia: 100-999
                        s += convNumLett(a[i], CENTINAIA);
                        break;
                    case 2: //caso decine: 10-99
                        s += convNumLett(a[i], DECINE);
                        break;
                    case 3: //caso unita': 0-9
                        s += convNumLett(a[i], UNITA);
                        break;
                }
            }
        }
        return s;
    }

}
