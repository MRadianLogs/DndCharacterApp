package com.company.Classes;

import com.company.DataValues.Feature;
import com.company.DataValues.Item;

import java.util.List;

public class CharacterClass {
    //TODO: Make this class represent the DB column in a CharacterClasses table.
    private String name;
    private List<Feature> relatedFeatures; //Features for character brought by this class.

    private String hitDiceType;
    private List<Item> startingEquipmentList; //TODO: Incorporate equipment options for starting equipment.
}
