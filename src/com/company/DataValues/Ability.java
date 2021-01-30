package com.company.DataValues;

import com.company.Util.ModifierCalculator;

import java.util.List;

public class Ability {
    private String name;

    private int baseValue;
    private int modifierValue;

    private int initialValue; //The starting value before any modifiers.
    private List<ValueModifier> modifierList;
    private boolean characterUsesOverriddenBaseValue;
    private int overriddenBaseValue;

    public Ability(String abilityName, int abilityInitialValue, List<ValueModifier> modifiersList, boolean characterUsesOverriddenBaseValue, int overriddenBaseValue)
    {
        name = abilityName;
        initialValue = abilityInitialValue;
        this.modifierList = modifiersList;

        this.characterUsesOverriddenBaseValue = characterUsesOverriddenBaseValue;
        this.overriddenBaseValue = overriddenBaseValue;

        calculateBaseValue();
        calculateModifierValue();
    }

    /**
     * Calculates the base Ability value by adding the list of modifiers to the initial value.
     */
    public void calculateBaseValue() {
        baseValue = initialValue;
        if(modifierList != null)
            for (ValueModifier modifier:
                 modifierList) {
                baseValue += modifier.getModifierValue();
            }
    }

    /**
     * Calculates the modifier value for this ability, based on the current base value.
     */
    public void calculateModifierValue()
    {
        modifierValue = ModifierCalculator.getModifierValue(getBaseValue());
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getBaseValue() {
        if(characterUsesOverriddenBaseValue)
            return overriddenBaseValue;
        else
            return baseValue;
    }
    public void setBaseValue(int baseValue) {
        this.baseValue = baseValue;

    }

    public int getModifierValue() {
        return modifierValue;
    }
    public void setModifierValue(int modifierValue) {
        this.modifierValue = modifierValue;
    }

    public int getInitialValue() {
        return initialValue;
    }
    public void setInitialValue(int initialValue) {
        this.initialValue = initialValue;
    }

    public List<ValueModifier> getModifierList() {
        return modifierList;
    }
    public void setModifierList(List<ValueModifier> modifierList) {
        this.modifierList = modifierList;
    }

    public boolean isCharacterUsesOverriddenBaseValue() {
        return characterUsesOverriddenBaseValue;
    }
    public void setCharacterUsesOverriddenBaseValue(boolean characterUsesOverriddenBaseValue) {
        this.characterUsesOverriddenBaseValue = characterUsesOverriddenBaseValue;
    }

    public int getOverriddenBaseValue() {
        return overriddenBaseValue;
    }
    public void setOverriddenBaseValue(int overriddenBaseValue) {
        this.overriddenBaseValue = overriddenBaseValue;
    }
}
