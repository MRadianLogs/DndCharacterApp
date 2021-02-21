package com.company.Races;

import com.company.DataValues.Feature;

import java.util.Map;

/**
 * This class represents the players chosen race and attributes.
 */
public class Race {

    private String name;
    private String description;
    private float speed;

    private Map<String, Feature> features;

    public Race(String name, String description, float speed, Map<String, Feature> features) {
        this.name = name;
        this.description = description;
        this.speed = speed;
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

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public Map<String, Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Map<String, Feature> features) {
        this.features = features;
    }
}
