package com.company.Character;

import com.company.DataValues.Feature;

import java.util.HashMap;
import java.util.Map;

public class Features {
    //Uses classes from BaseDetails.
    private Map<String, Feature> classFeatures;
    private Map<String, Feature> raceFeatures;
    private Map<String, Feature> backgroundFeatures;
    private Map<String, Feature> customFeatures;

    public Features(BaseDetails baseDetails)
    {
        classFeatures = baseDetails.getCharacterClass().getFeatures();
        raceFeatures = baseDetails.getRace().getFeatures();
        backgroundFeatures = baseDetails.getBackground().getFeatures();
        customFeatures = new HashMap<>();
    }

    public void addClassFeature(Feature newFeature)
    {
        if(classFeatures.get(newFeature.getName()) != null)
            classFeatures.put(newFeature.getName(), newFeature);
    }
    public void removeClassFeature(String featureName)
    {
        if(classFeatures.get(featureName) != null)
            classFeatures.remove(featureName);
    }

    public void addRaceFeature(Feature newFeature)
    {
        if(raceFeatures.get(newFeature.getName()) != null)
            raceFeatures.put(newFeature.getName(), newFeature);
    }
    public void removeRaceFeature(String featureName)
    {
        if(raceFeatures.get(featureName) != null)
            raceFeatures.remove(featureName);
    }

    public void addBackgroundFeature(Feature newFeature)
    {
        if(backgroundFeatures.get(newFeature.getName()) != null)
            backgroundFeatures.put(newFeature.getName(), newFeature);
    }
    public void removeBackgroundFeature(String featureName)
    {
        if(backgroundFeatures.get(featureName) != null)
            backgroundFeatures.remove(featureName);
    }

    public void addCustomFeature(Feature newFeature)
    {
        if(customFeatures.get(newFeature.getName()) != null)
            customFeatures.put(newFeature.getName(), newFeature);
    }
    public void removeCustomFeature(String featureName)
    {
        if(customFeatures.get(featureName) != null)
            customFeatures.remove(featureName);
    }

    public Map<String, Feature> getClassFeatures() {
        return classFeatures;
    }
    public void setClassFeatures(Map<String, Feature> classFeatures) {
        this.classFeatures = classFeatures;
    }

    public Map<String, Feature> getRaceFeatures() {
        return raceFeatures;
    }
    public void setRaceFeatures(Map<String, Feature> raceFeatures) {
        this.raceFeatures = raceFeatures;
    }

    public Map<String, Feature> getBackgroundFeatures() {
        return backgroundFeatures;
    }
    public void setBackgroundFeatures(Map<String, Feature> backgroundFeatures) {
        this.backgroundFeatures = backgroundFeatures;
    }

    public Map<String, Feature> getCustomFeatures() {
        return customFeatures;
    }
    public void setCustomFeatures(Map<String, Feature> customFeatures) {
        this.customFeatures = customFeatures;
    }
}
