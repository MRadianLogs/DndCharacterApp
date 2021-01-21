package com.company.Util;

public class ModifierCalculator {

    /**
     * Calculates the modifier value for a given base value.
     * @param baseValue the base value to get a modifier value for.
     * @return the modifier for the provided base value.
     */
    public static int getModifierValue(int baseValue)
    {
        if(baseValue < 2)
            return -5;
        else if(baseValue < 4)
            return -4;
        else if(baseValue < 6)
            return -3;
        else if(baseValue < 8)
            return -2;
        else if(baseValue < 10)
            return -1;
        else if(baseValue < 12)
            return 0;
        else if(baseValue < 14)
            return 1;
        else if(baseValue < 16)
            return 2;
        else if(baseValue < 18)
            return 3;
        else if(baseValue < 20)
            return 4;
        else if(baseValue < 22)
            return 5;
        else if(baseValue < 24)
            return 6;
        else if(baseValue < 26)
            return 7;
        else if(baseValue < 28)
            return 8;
        else if(baseValue < 30)
            return 9;
        else
            return 10;
    }
}
