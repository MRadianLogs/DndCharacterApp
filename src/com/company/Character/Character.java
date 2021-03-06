package com.company.Character;

import com.company.Constants;

import java.util.*;

public class Character {
    //Core Page

    private BaseDetails baseDetails;

    private Stats stats;

    private EncounterDetails encounterDetails;

    //TODO: Create class for "Other Proficiencies and Languages", called Proficiencies

    //TODO: Create class for "Attacks & Spellcasting", called Actions

    //TODO: Create class for Equipment

    //TODO: Create class for "Top right box", called Personality

    //Class for "Features and Traits", called Features
    private Features features; //TODO: Finish setting up section.

    //TODO: Second page with backstory and stuff, called Biography

    //TODO: Continue creating impl for the other pages.

    public Character(String characterOwnerName, String race, String characterClass, String background, String alignment,
                     int level, int experiencePoints, String name, List<Integer> abilityScores,
                     List<String> listProficientSavingThrows, List<String> listProficientSkills) {
        this.baseDetails = new BaseDetails(characterOwnerName, race, characterClass,
                background, alignment, level, experiencePoints, name);

        setupCharacter(abilityScores, listProficientSavingThrows, listProficientSkills);
    }

    private void setupCharacter(List<Integer> abilityScores, List<String> listProficientSavingThrows, List<String> listProficientSkills) {
        stats = new Stats();
        stats.setupStats(baseDetails.getLevel(), abilityScores, listProficientSavingThrows, listProficientSkills);

        encounterDetails = new EncounterDetails();
        encounterDetails.setupEncounterDetails();

        //Do calculations.
        stats.calculatePassiveWisdomPerception();
        encounterDetails.calculateArmorClass();
        encounterDetails.calculateInitiativeValue(stats.getAbilityList().get(Constants.DEXTERITY_ABILITY_NAME).getModifierValue());
        encounterDetails.calculateSpeedValue();
    }

    //TODO: Create a constructor or methods which allow overwriting values.

    //Getters and Setters ---------------------------------------------------------------------------------------
    public BaseDetails getBaseDetails() {
        return baseDetails;
    }
    public void setBaseDetails(BaseDetails baseDetails) {
        this.baseDetails = baseDetails;
    }

    public Stats getStats() {
        return stats;
    }
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public EncounterDetails getEncounterDetails()
    {
        return encounterDetails;
    }
    public void setEncounterDetails(EncounterDetails encounterDetails)
    {
        this.encounterDetails = encounterDetails;
    }
}
