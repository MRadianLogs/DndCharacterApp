package com.company.Backgrounds;

import com.company.DataValues.Feature;
import com.company.DataValues.Item;

import java.util.List;
import java.util.Map;

public class Background {
    private String name;
    private String description;
    private Map<String, Feature> features;

    private List<Item> startingEquipment;

    public Background(String name, String description, Map<String, Feature> features, List<Item> startingEquipment) {
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

    public Map<String, Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Map<String, Feature> features) {
        this.features = features;
    }

    public List<Item> getStartingEquipment() {
        return startingEquipment;
    }

    public void setStartingEquipment(List<Item> startingEquipment) {
        this.startingEquipment = startingEquipment;
    }
}
