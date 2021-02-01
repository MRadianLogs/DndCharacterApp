package com.company.DataValues;

import java.util.HashMap;
import java.util.Map;

public class Feature {
    private String name;
    private String description;
    private String origin; //Ex: Race, Background, Etc.
    private int levelCap; // -1 if not applicable.

    //TODO: Need to account for features affecting skills, abilities, proficiencies, tools, health, temp health,
    // additional actions, bonus actions, etc..

    private boolean hasLimitedUsages; //Used "once per short/long rest" "3 times per short/long rest"
    private int maxNumUsages;
    private int numUsagesLeft;
    private String maxUsageDuration; //Long rest, short rest, etc.

    private boolean hasSubFeatures;
    private Map<String, Feature> subFeatures;

    public Feature(String name, String description, String origin, int levelCap, boolean hasLimitedUsages,
                   int maxNumUsages, int numUsagesLeft, String maxUsageDuration, boolean hasSubFeatures) {
        this.name = name;
        this.description = description;
        this.origin = origin;
        this.levelCap = levelCap;
        this.hasLimitedUsages = hasLimitedUsages;
        this.maxNumUsages = maxNumUsages;
        this.numUsagesLeft = numUsagesLeft;
        this.maxUsageDuration = maxUsageDuration;
        this.hasSubFeatures = hasSubFeatures;

        if(hasSubFeatures)
            this.subFeatures = new HashMap<>();
    }

    public void addSubFeature(Feature newSubFeature)
    {
        if(subFeatures == null)
        {
            subFeatures = new HashMap<>();
            hasSubFeatures = true;
            subFeatures.put(newSubFeature.getName(), newSubFeature);
        }
        else if(!subFeatures.containsKey(newSubFeature.getName()))
        {
            subFeatures.put(newSubFeature.getName(), newSubFeature);
        }
    }
    public void removeSubFeature(String featureName)
    {
        if(subFeatures != null && subFeatures.containsKey(featureName))
        {
            subFeatures.remove(featureName);

            int subFeaturesSizeLeftover = subFeatures.size();
            if(subFeaturesSizeLeftover <= 0)
            {
                subFeatures = null;
                hasSubFeatures = false;
            }
        }
    }

    //Getters and Setters.
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

    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getLevelCap() {
        return levelCap;
    }
    public void setLevelCap(int levelCap) {
        this.levelCap = levelCap;
    }

    public boolean hasLimitedUsages() {
        return hasLimitedUsages;
    }
    public void setHasLimitedUsages(boolean hasLimitedUsages) {
        this.hasLimitedUsages = hasLimitedUsages;
    }

    public int getMaxNumUsages() {
        return maxNumUsages;
    }
    public void setMaxNumUsages(int maxNumUsages) {
        this.maxNumUsages = maxNumUsages;
    }

    public int getNumUsagesLeft() {
        return numUsagesLeft;
    }
    public void setNumUsagesLeft(int numUsagesLeft) {
        this.numUsagesLeft = numUsagesLeft;
    }

    public String getMaxUsageDuration() {
        return maxUsageDuration;
    }
    public void setMaxUsageDuration(String maxUsageDuration) {
        this.maxUsageDuration = maxUsageDuration;
    }

    public boolean hasSubFeatures() {
        return hasSubFeatures;
    }
    public void setHasSubFeatures(boolean hasSubFeatures) {
        this.hasSubFeatures = hasSubFeatures;
    }

    public Map<String, Feature> getSubFeatures() {
        return subFeatures;
    }
    public void setSubFeatures(Map<String, Feature> subFeatures) {
        this.subFeatures = subFeatures;
    }

}
