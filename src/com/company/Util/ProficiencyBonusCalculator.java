package com.company.Util;

public class ProficiencyBonusCalculator {
    /**
     * Calculates a proficiency bonus for a given character level.
     * @param characterLevel the level to calculate the proficiency bonus with.
     * @return the proficiency bonus for a level.
     */
    public static int getProficiencyBonus(int characterLevel)
    {
        if(characterLevel < 5)
            return 2;
        else if(characterLevel < 9)
            return 3;
        else if(characterLevel < 13)
            return 4;
        else if(characterLevel < 17)
            return 5;
        else
            return 6;
    }
}
