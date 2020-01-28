package com.kodilla.testing2.config;

class FirstFactorial {


    /* metoda rekurencyjna */
    public String silnia1(String n) {
        char[] rev = n.toCharArray();
        char[] rev2 = new char[rev.length];
        int b = 0;
        for(int i = rev.length -1; i >= 0; i--){
            rev2[b++]= rev[i];
        }

        return new String(rev2);
    }

    public String silnia2(String n) {
        char[] rev = n.toCharArray();
        char[] rev2 = new char[rev.length];

        for(int i = rev.length - 1; i >= 0; i--){
            rev2[rev.length - i - 1]= rev[i];
        }

        return new String(rev2);
    }

    public String silnia(String n) {
        char[] rev = n.toCharArray();
        String res = "";

        for(int i = rev.length - 1; i >= 0; i--){
            res += rev[i];
        }

        return res;
    }


    static public void main(String argv[])
    {
        /* deklaracja zmiennej wraz z utworzeniem jej wartosci */
        FirstFactorial s = new FirstFactorial();
        FirstFactorial firstFactorial = new FirstFactorial();
        FirstFactorial firstFactorial1 = new FirstFactorial();


        /* wywolanie zdefiniowanej metody */
        System.out.println(s.silnia("jajo"));
        System.out.println(firstFactorial.silnia1("jajko"));
        System.out.println(firstFactorial1.silnia2("jajeczko"));
    }
}
