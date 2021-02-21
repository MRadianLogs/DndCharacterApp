package com.company.Character;

import com.company.Backgrounds.Background;
import com.company.Classes.CharacterClass;
import com.company.Races.Race;

public class BaseDetails {
    //Base Character Details

    private String ownerName;
    private Race race;
    private CharacterClass characterClass;
    private Background background;
    private String alignment;
    private int level;
    private int experiencePoints;
    private String name;

    public BaseDetails(String ownerName, String race, String characterClass,
                       String background, String alignment, int level,
                       int experiencePoints, String name) {
        this.ownerName = ownerName;

        this.race = setupRace(race);

        this.characterClass = setupCharacterClass(characterClass);

        this.background = setupBackground(background);
        this.alignment = alignment;
        this.level = level;
        this.experiencePoints = experiencePoints;
        this.name = name;
    }

    private Race setupRace(String selectedRace)
    {
        //TODO:Get race from DB, if it exists.
        Race newRace = null;
        return newRace;
    }

    private CharacterClass setupCharacterClass(String selectedCharacterClass)
    {
        //TODO:Get characterClass from DB, if it exists.
        CharacterClass characterClass = null;
        return characterClass;
    }

    private Background setupBackground(String selectedBackground)
    {
        //TODO:Get background from DB, if it exists.
        Background background = null;
        return background;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Race getRace() { return race; }
    public void setRace(Race race) { this.race = race; }

    public CharacterClass getCharacterClass() { return characterClass; }
    public void setCharacterClass(CharacterClass characterClass) { this.characterClass = characterClass; }

    public Background getBackground() { return background; }
    public void setBackground(Background background) { this.background = background; }

    public String getAlignment() {
        return alignment;
    }
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }
    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
