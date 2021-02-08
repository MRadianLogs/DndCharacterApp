package com.company.Classes;


import com.company.DataValues.Feature;

import java.util.List;

public class ArchetypeData {
    private String name;
    private String description;
    private List<Feature> features; //Features for character brought by this Archetype.

    public ArchetypeData(String name, String description, List<Feature> features) {
        this.name = name;
        this.description = description;
        this.features = features;
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
}
