package com.company;

import java.util.List;

public class Skill {
    private String name;
    private Ability baseAbility;
    private boolean isCharacterProficient = false;

    private int value; //Calculated from baseAbility.Modifier and proficiency if proficient.

    private List<ValueModifier> modifierList;
    private boolean characterUsesOverriddenValue;
    private int overriddenValue;

    public Skill(String skillName, Ability skillBaseAbility, boolean isCharacterProficient, List<ValueModifier> customModifierList, boolean characterUsesOverriddenValue, int overriddenValue)
    {
        this.name = skillName;
        this.baseAbility = skillBaseAbility;
        this.isCharacterProficient = isCharacterProficient;

        this.modifierList = customModifierList;
        this.characterUsesOverriddenValue = characterUsesOverriddenValue;
        this.overriddenValue = overriddenValue;
    }

    /**
     * Calculates the value of this skill, based on if the character is proficient in the skill and if there is any custom modifiers.
     * @param characterProficiencyBonus the proficiency value of the character.
     */
    public void calculateSkillValue(int characterProficiencyBonus)
    {
        if(isCharacterProficient)
            value = baseAbility.getModifierValue() + characterProficiencyBonus;
        else
            value = baseAbility.getModifierValue();

        if(modifierList != null)
        {
            for (ValueModifier modifier:
                 modifierList) {
                value += modifier.getModifierValue();
            }
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Ability getBaseAbility() {
        return baseAbility;
    }
    public void setBaseAbility(Ability baseAbility) {
        this.baseAbility = baseAbility;
    }

    public boolean isCharacterProficient() {
        return isCharacterProficient;
    }
    public void setCharacterProficient(boolean characterProficient) {
        this.isCharacterProficient = characterProficient;
    }

    public int getValue() {
        if(characterUsesOverriddenValue)
            return overriddenValue;
        else
            return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public List<ValueModifier> getModifierList() {
        return modifierList;
    }
    public void setModifierList(List<ValueModifier> modifierList) {
        this.modifierList = modifierList;
    }

    public boolean isCharacterUsesOverriddenValue() {
        return characterUsesOverriddenValue;
    }
    public void setCharacterUsesOverriddenValue(boolean characterUsesOverriddenValue) {
        this.characterUsesOverriddenValue = characterUsesOverriddenValue;
    }

    public int getOverriddenValue() {
        return overriddenValue;
    }
    public void setOverriddenValue(int overriddenValue) {
        this.overriddenValue = overriddenValue;
    }
}
