package com.company;

import java.util.ArrayList;
import java.util.List;

public class EncounterDetails {

    //Encounter Details
    private int armorClassValue;
    private List<ValueModifier> armorClassModifiers;
    private boolean characterUsesOverriddenArmorClassValue;
    private int overriddenArmorClassValue;
    private int initiativeValue;
    private List<ValueModifier> initiativeModifiers;
    private boolean characterUsesOverriddenInitiativeValue;
    private int overriddenInitiativeValue;
    private int speedValue;
    private List<ValueModifier> speedModifiers;
    private boolean characterUsesOverriddenSpeedValue;
    private int overriddenSpeedValue;
    private int maxHitPoints;
    private List<ValueModifier> maxHitPointsModifiers;
    private boolean characterUsesOverriddenMaxHitPoints;
    private int overriddenMaxHitPoints;
    private int currentHitPoints;
    private int currentTempHitPoints;
    private String hitDiceType; //TODO: Consider making dice classes.
    private boolean characterUsesOverriddenHitDiceType;
    private String overriddenHitDiceType;
    private int maxHitDice;
    private boolean characterUsesOverriddenMaxHitDice;
    private int overriddenMaxHitDice;
    private int currentHitDice;
    private int numSuccessDeathSaves;
    private int numFailedDeathSaves;

    public EncounterDetails()
    {
        armorClassValue = -1;
        armorClassModifiers = new ArrayList<>();
        characterUsesOverriddenArmorClassValue = false;
        overriddenArmorClassValue = -1;
        initiativeValue = -1;
        initiativeModifiers = new ArrayList<>();
        characterUsesOverriddenInitiativeValue = false;
        overriddenInitiativeValue = -1;
        speedValue = -1;
        speedModifiers = new ArrayList<>();
        characterUsesOverriddenSpeedValue = false;
        overriddenSpeedValue = -1;
        maxHitPoints = -1;
        maxHitPointsModifiers = new ArrayList<>();
        characterUsesOverriddenMaxHitPoints = false;
        overriddenMaxHitPoints = -1;
        currentHitPoints = -1;
        currentTempHitPoints = -1;
        hitDiceType = "";
        characterUsesOverriddenHitDiceType = false;
        overriddenHitDiceType = "";
        maxHitDice = -1;
        characterUsesOverriddenMaxHitDice = false;
        overriddenMaxHitDice = -1;
        currentHitDice = -1;
        numSuccessDeathSaves = -1;
        numFailedDeathSaves = -1;
    }

    public void setupEncounterDetails()
    {
        armorClassModifiers.clear();
        characterUsesOverriddenArmorClassValue = false;
        overriddenArmorClassValue = -1;
        initiativeValue = -1;
        initiativeModifiers.clear();
        characterUsesOverriddenInitiativeValue = false;
        overriddenInitiativeValue = -1;
        speedValue = -1;
        speedModifiers.clear();
        characterUsesOverriddenSpeedValue = false;
        overriddenSpeedValue = -1;
        maxHitPoints = -1;
        maxHitPointsModifiers.clear();
        characterUsesOverriddenMaxHitPoints = false;
        overriddenMaxHitPoints = -1;
        currentHitPoints = -1;
        currentTempHitPoints = -1;
        hitDiceType = "";
        characterUsesOverriddenHitDiceType = false;
        overriddenHitDiceType = "";
        maxHitDice = -1;
        characterUsesOverriddenMaxHitDice = false;
        overriddenMaxHitDice = -1;
        currentHitDice = -1;
        numSuccessDeathSaves = 0;
        numFailedDeathSaves = 0;
    }

    public void calculateArmorClass()
    {
        if(characterUsesOverriddenArmorClassValue) {
            armorClassValue = overriddenArmorClassValue;
        }
        else
        {
            //TODO: Create a system for calculated AC.
            //Sometimes you take the Armors static AC. Othertimes you take a base value + DEX, etc.
            armorClassValue = 10;
            if(armorClassModifiers != null)
                for (ValueModifier modifier:
                        armorClassModifiers) {
                    armorClassValue += modifier.getModifierValue();
                }
        }
    }

    public void calculateInitiativeValue(int dexModifierValue)
    {
        if(characterUsesOverriddenInitiativeValue)
            initiativeValue = overriddenInitiativeValue;
        else {
            initiativeValue = dexModifierValue;
            if(initiativeModifiers != null)
                for (ValueModifier modifier:
                        initiativeModifiers) {
                    initiativeValue += modifier.getModifierValue();
                }
        }
    }

    public void calculateSpeedValue()
    {
        if(characterUsesOverriddenSpeedValue) {
            speedValue = overriddenSpeedValue;
        }
        else {
            //TODO: Calculate speed value from race and modifiers.
            speedValue = 30;
            if(speedModifiers != null)
                for (ValueModifier modifier:
                        speedModifiers) {
                    speedValue += modifier.getModifierValue();
                }
        }
    }

    public int getArmorClassValue() {
        if(characterUsesOverriddenArmorClassValue)
            return overriddenArmorClassValue;
        else
            return armorClassValue;
    }
    public void setArmorClassValue(int armorClassValue) {
        this.armorClassValue = armorClassValue;
    }

    public List<ValueModifier> getArmorClassModifiers() {
        return armorClassModifiers;
    }
    public void setArmorClassModifiers(List<ValueModifier> armorClassModifiers) {
        this.armorClassModifiers = armorClassModifiers;
    }

    public boolean characterUsesOverriddenArmorClassValue() {
        return characterUsesOverriddenArmorClassValue;
    }
    public void setCharacterUsesOverriddenArmorClassValue(boolean characterUsesOverriddenArmorClassValue) {
        this.characterUsesOverriddenArmorClassValue = characterUsesOverriddenArmorClassValue;
    }

    public int getOverriddenArmorClassValue() {
        return overriddenArmorClassValue;
    }
    public void setOverriddenArmorClassValue(int overriddenArmorClassValue) {
        this.overriddenArmorClassValue = overriddenArmorClassValue;
    }

    public int getInitiativeValue() {
        if(characterUsesOverriddenInitiativeValue)
            return overriddenInitiativeValue;
        else
            return initiativeValue;
    }
    public void setInitiativeValue(int initiativeValue) {
        this.initiativeValue = initiativeValue;
    }

    public List<ValueModifier> getInitiativeModifiers() {
        return initiativeModifiers;
    }
    public void setInitiativeModifiers(List<ValueModifier> initiativeModifiers) {
        this.initiativeModifiers = initiativeModifiers;
    }

    public boolean characterUsesOverriddenInitiativeValue() {
        return characterUsesOverriddenInitiativeValue;
    }
    public void setCharacterUsesOverriddenInitiativeValue(boolean characterUsesOverriddenInitiativeValue) {
        this.characterUsesOverriddenInitiativeValue = characterUsesOverriddenInitiativeValue;
    }

    public int getOverriddenInitiativeValue() {
        return overriddenInitiativeValue;
    }
    public void setOverriddenInitiativeValue(int overriddenInitiativeValue) {
        this.overriddenInitiativeValue = overriddenInitiativeValue;
    }

    public int getSpeedValue() {
        if(characterUsesOverriddenSpeedValue)
            return overriddenSpeedValue;
        else
            return speedValue;
    }
    public void setSpeedValue(int speedValue) {
        this.speedValue = speedValue;
    }

    public List<ValueModifier> getSpeedModifiers() {
        return speedModifiers;
    }
    public void setSpeedModifiers(List<ValueModifier> speedModifiers) {
        this.speedModifiers = speedModifiers;
    }

    public boolean characterUsesOverriddenSpeedValue() {
        return characterUsesOverriddenSpeedValue;
    }
    public void setCharacterUsesOverriddenSpeedValue(boolean characterUsesOverriddenSpeedValue) {
        this.characterUsesOverriddenSpeedValue = characterUsesOverriddenSpeedValue;
    }

    public int getOverriddenSpeedValue() {
        return overriddenSpeedValue;
    }
    public void setOverriddenSpeedValue(int overriddenSpeedValue) {
        this.overriddenSpeedValue = overriddenSpeedValue;
    }

    public int getMaxHitPoints() {
        if(characterUsesOverriddenMaxHitPoints)
            return overriddenMaxHitPoints;
        else
            return maxHitPoints;
    }
    public void setMaxHitPoints(int maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
    }

    public List<ValueModifier> getMaxHitPointsModifiers() {
        return maxHitPointsModifiers;
    }
    public void setMaxHitPointsModifiers(List<ValueModifier> maxHitPointsModifiers) {
        this.maxHitPointsModifiers = maxHitPointsModifiers;
    }

    public boolean characterUsesOverriddenMaxHitPoints() {
        return characterUsesOverriddenMaxHitPoints;
    }
    public void setCharacterUsesOverriddenMaxHitPoints(boolean characterUsesOverriddenMaxHitPoints) {
        this.characterUsesOverriddenMaxHitPoints = characterUsesOverriddenMaxHitPoints;
    }

    public int getOverriddenMaxHitPoints() {
        return overriddenMaxHitPoints;
    }
    public void setOverriddenMaxHitPoints(int overriddenMaxHitPoints) {
        this.overriddenMaxHitPoints = overriddenMaxHitPoints;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }
    public void setCurrentHitPoints(int currentHitPoints) {
        this.currentHitPoints = currentHitPoints;
    }

    public int getCurrentTempHitPoints() {
        return currentTempHitPoints;
    }
    public void setCurrentTempHitPoints(int currentTempHitPoints) {
        this.currentTempHitPoints = currentTempHitPoints;
    }

    public String getHitDiceType() {
        if(characterUsesOverriddenHitDiceType)
            return overriddenHitDiceType;
        else
            return hitDiceType;
    }
    public void setHitDiceType(String hitDiceType) {
        this.hitDiceType = hitDiceType;
    }

    public boolean characterUsesOverriddenHitDiceType() {
        return characterUsesOverriddenHitDiceType;
    }
    public void setCharacterUsesOverriddenHitDiceType(boolean characterUsesOverriddenHitDiceType) {
        this.characterUsesOverriddenHitDiceType = characterUsesOverriddenHitDiceType;
    }

    public String getOverriddenHitDiceType() {
        return overriddenHitDiceType;
    }
    public void setOverriddenHitDiceType(String overriddenHitDiceType) {
        this.overriddenHitDiceType = overriddenHitDiceType;
    }

    public int getMaxHitDice() {
        if(characterUsesOverriddenMaxHitDice)
            return overriddenMaxHitDice;
        else
            return maxHitDice;
    }
    public void setMaxHitDice(int maxHitDice) {
        this.maxHitDice = maxHitDice;
    }

    public boolean characterUsesOverriddenMaxHitDice() {
        return characterUsesOverriddenMaxHitDice;
    }
    public void setCharacterUsesOverriddenMaxHitDice(boolean characterUsesOverriddenMaxHitDice) {
        this.characterUsesOverriddenMaxHitDice = characterUsesOverriddenMaxHitDice;
    }

    public int getOverriddenMaxHitDice() {
        return overriddenMaxHitDice;
    }
    public void setOverriddenMaxHitDice(int overriddenMaxHitDice) {
        this.overriddenMaxHitDice = overriddenMaxHitDice;
    }

    public int getCurrentHitDice() {
        return currentHitDice;
    }
    public void setCurrentHitDice(int currentHitDice) {
        this.currentHitDice = currentHitDice;
    }

    public int getNumSuccessDeathSaves() {
        return numSuccessDeathSaves;
    }
    public void setNumSuccessDeathSaves(int numSuccessDeathSaves) {
        this.numSuccessDeathSaves = numSuccessDeathSaves;
    }

    public int getNumFailedDeathSaves() {
        return numFailedDeathSaves;
    }
    public void setNumFailedDeathSaves(int numFailedDeathSaves) {
        this.numFailedDeathSaves = numFailedDeathSaves;
    }

}
