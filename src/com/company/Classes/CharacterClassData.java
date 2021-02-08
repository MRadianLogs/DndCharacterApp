package com.company.Classes;

import com.company.DataValues.Feature;
import com.company.DataValues.Item;

import java.util.List;

/**
 * This class represents a class in Dnd. This object represents a row/data object in a database CharacterClass table.
 */
public class CharacterClassData {
    private String name;
    private String description;

    private List<Feature> features; //Features for character brought by this class.

    private List<ArchetypeData> archetypes; //A list of possible archetypes for this class.

    private String hitDiceType;
    private List<Item> startingEquipmentList;

    public CharacterClassData(String name, String description, List<Feature> features, List<ArchetypeData> archetypes, String hitDiceType, List<Item> startingEquipmentList) {
        this.name = name;
        this.description = description;
        this.features = features;
        this.archetypes = archetypes;
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

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<ArchetypeData> getArchetypes() {
        return archetypes;
    }

    public void setArchetypes(List<ArchetypeData> archetypes) {
        this.archetypes = archetypes;
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
