package com.company.Character;

import com.company.DataValues.Feature;

import java.util.ArrayList;
import java.util.List;

public class Features {
    private List<Feature> classFeatures;
    private List<Feature> raceFeatures;
    private List<Feature> backgroundFeatures;
    private List<Feature> customFeatures;

    public Features()
    {
        classFeatures = new ArrayList<>();
        raceFeatures = new ArrayList<>();
        backgroundFeatures = new ArrayList<>();
        customFeatures = new ArrayList<>();
    }

    public List<Feature> getClassFeatures() {
        return classFeatures;
    }
    public void setClassFeatures(List<Feature> classFeatures) {
        this.classFeatures = classFeatures;
    }

    public List<Feature> getRaceFeatures() {
        return raceFeatures;
    }
    public void setRaceFeatures(List<Feature> raceFeatures) {
        this.raceFeatures = raceFeatures;
    }

    public List<Feature> getBackgroundFeatures() {
        return backgroundFeatures;
    }
    public void setBackgroundFeatures(List<Feature> backgroundFeatures) {
        this.backgroundFeatures = backgroundFeatures;
    }

    public List<Feature> getCustomFeatures() {
        return customFeatures;
    }
    public void setCustomFeatures(List<Feature> customFeatures) {
        this.customFeatures = customFeatures;
    }
}
