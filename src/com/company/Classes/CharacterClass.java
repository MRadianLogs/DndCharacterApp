package com.company.Classes;

import com.company.DataValues.Feature;

import java.util.Map;

/**
 * This class represents the players chosen class and related features in Dnd.
 */
public class CharacterClass {

    private String name;
    private String description;
    private int level;

    private Map<String, Feature> features; //Features for character brought by this class.

    private Archetype archetype; //The players chosen archetype.

    private String hitDiceType;

    public CharacterClass(String name, String description, int level, Map<String, Feature> features, Archetype archetype, String hitDiceType) {
        this.name = name;
        this.description = description;
        this.level = level;
        this.features = features;
        this.archetype = archetype;
        this.hitDiceType = hitDiceType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Map<String, Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Map<String, Feature> features) {
        this.features = features;
    }

    public Archetype getArchetype() {
        return archetype;
    }

    public void setArchetype(Archetype archetype) {
        this.archetype = archetype;
    }

    public String getHitDiceType() {
        return hitDiceType;
    }

    public void setHitDiceType(String hitDiceType) {
        this.hitDiceType = hitDiceType;
    }
}
