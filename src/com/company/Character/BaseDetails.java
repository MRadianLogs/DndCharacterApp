package com.company.Character;

public class BaseDetails {
    //Base Character Details

    private String ownerName;
    private String race; //TODO: DESIGN/OPTIMIZATION: Consider changing this type to the class. There may not be a need though.
    private String characterClass; //TODO: DESIGN/OPTIMIZATION: Consider changing this type to the class. There may not be a need though.
    private String background; //TODO: DESIGN/OPTIMIZATION: Consider changing this type to the class. There may not be a need though.
    private String alignment;
    private int level;
    private int experiencePoints;
    private String name;

    public BaseDetails(String ownerName, String race, String characterClass,
                       String background, String alignment, int level,
                       int experiencePoints, String name) {
        this.ownerName = ownerName;
        this.race = race;
        this.characterClass = characterClass;
        this.background = background;
        this.alignment = alignment;
        this.level = level;
        this.experiencePoints = experiencePoints;
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }

    public String getCharacterClass() {
        return characterClass;
    }
    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String getBackground() {
        return background;
    }
    public void setBackground(String background) {
        this.background = background;
    }

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
