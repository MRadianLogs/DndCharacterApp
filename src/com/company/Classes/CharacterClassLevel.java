package com.company.Classes;

import com.company.DataValues.Feature;

import java.util.Map;

public class CharacterClassLevel {

    private int level;
    private int proficiencyBonus;
    private Map<String, Feature> features; //The features this level brings to the character.

    private Map<String, Integer> listsOfCounts; //infusions known, infused items, cantrips known, 1st level spell slots, 2nd level spell slots, ...

    public CharacterClassLevel(int level, int proficiencyBonus, Map<String, Feature> features, Map<String, Integer> listsOfCounts) {
        this.level = level;
        this.proficiencyBonus = proficiencyBonus;
        this.features = features;
        this.listsOfCounts = listsOfCounts;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public Map<String, Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Map<String, Feature> features) {
        this.features = features;
    }

    public Map<String, Integer> getListsOfCounts() {
        return listsOfCounts;
    }

    public void setListsOfCounts(Map<String, Integer> listsOfCounts) {
        this.listsOfCounts = listsOfCounts;
    }
}
