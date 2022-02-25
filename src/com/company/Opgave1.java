package com.company;

public class Opgave1 {

    /**
     *
     * @param tal
     * @return tal 1-4
     */
    public int f(int tal) {
        if (tal < 7)
            return 1;
        else if (tal < 9)
            return 2;
        else if (tal < 13)
            return 3;
        else
            return 4;
    }


    /**
     *
     * @param nr
     * @param besked
     * @return true, false, ja eller nej
     */
    public boolean udskriv(int nr, String besked) {


        if (nr < 100) {
            if (besked == "ja")
                return true;
            if (nr > 100) {
                if (besked == "ja")
                    return true;
            }
            if (nr < 100) {
                if (besked == "nej")
                    return false;
            }
            if (nr > 100) {
                if (besked == "nej")
                    return false;
            }
            if (nr == 100) {
                return true;
            }

        }
        return false;
    }
}
