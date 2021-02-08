package com.company.Backgrounds;

import com.company.DataValues.Feature;
import com.company.DataValues.Item;

import java.util.List;

public class BackgroundData {
    private String name;
    private String description;
    private List<Feature> features;

    private List<Item> startingEquipment;

    public BackgroundData(String name, String description, List<Feature> features, List<Item> startingEquipment) {
        this.name = name;
        this.description = description;
        this.features = features;
        this.startingEquipment = startingEquipment;
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

    public List<Item> getStartingEquipment() {
        return startingEquipment;
    }

    public void setStartingEquipment(List<Item> startingEquipment) {
        this.startingEquipment = startingEquipment;
    }
}
