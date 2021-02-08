package com.company.Classes;

import com.company.DataValues.Feature;
import com.company.DataValues.Item;

import java.util.List;
import java.util.Map;

/**
 * This class represents the players chosen class and related features in Dnd.
 */
public class CharacterClass {

    private String name;
    private String description;

    private Map<String, Feature> features; //Features for character brought by this class.

    private Archetype archetype; //The players chosen archetype.

    private String hitDiceType;
    private List<Item> startingEquipmentList;

    public CharacterClass(String name, String description, Map<String, Feature> features, Archetype archetype, String hitDiceType, List<Item> startingEquipmentList) {
        this.name = name;
        this.description = description;
        this.features = features;
        this.archetype = archetype;
        this.hitDiceType = hitDiceType;
        this.startingEquipmentList = startingEquipmentList;
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

    public List<Item> getStartingEquipmentList() {
        return startingEquipmentList;
    }

    public void setStartingEquipmentList(List<Item> startingEquipmentList) {
        this.startingEquipmentList = startingEquipmentList;
    }
}
