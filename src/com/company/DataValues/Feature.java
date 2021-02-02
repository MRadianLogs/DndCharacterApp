package com.company.DataValues;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Feature {
    //TODO: Need to redesign for easier use affecting character with less variables.

    private int levelCap; // -1 if not applicable.
    private String name;
    private String description;
    private String origin; //Ex: Race, Background, Etc.

    private boolean affectsStatValues;
    private List<ValueModifier> valueModifierList;

    private boolean givesProficiencies;
    private List<String> proficiencyList;

    private boolean givesHealthOnUse;
    private int healthGivenOnUse;

    private boolean givesTempHealthOnUse;
    private int tempHealthGivenOnUse;

    private boolean givesActionsOnUse;
    private int numberActionsGivenOnUse;

    private boolean givesBonusActionsOnUse;
    private int numberBonusActionsGivenOnUse;

    private boolean hasLimitedUsages; //Used "once per short/long rest" "3 times per short/long rest"
    private int maxNumUsages;
    private int numUsagesLeft;
    private String maxUsageDuration; //Long rest, short rest, etc.

    private boolean hasSubFeatures;
    private Map<String, Feature> subFeatures;

    public Feature(int levelCap, String name, String description, String origin, boolean affectsStatValues,
                   List<ValueModifier> valueModifierList, boolean givesProficiencies, List<String> proficiencyList,
                   boolean givesHealthOnUse, int healthGivenOnUse, boolean givesTempHealthOnUse,
                   int tempHealthGivenOnUse, boolean givesActionsOnUse, int numberActionsGivenOnUse,
                   boolean givesBonusActionsOnUse, int numberBonusActionsGivenOnUse, boolean hasLimitedUsages,
                   int maxNumUsages, int numUsagesLeft, String maxUsageDuration, boolean hasSubFeatures,
                   Map<String, Feature> subFeatures) {
        this.levelCap = levelCap;
        this.name = name;
        this.description = description;
        this.origin = origin;
        this.affectsStatValues = affectsStatValues;
        this.valueModifierList = valueModifierList;
        this.givesProficiencies = givesProficiencies;
        this.proficiencyList = proficiencyList;
        this.givesHealthOnUse = givesHealthOnUse;
        this.healthGivenOnUse = healthGivenOnUse;
        this.givesTempHealthOnUse = givesTempHealthOnUse;
        this.tempHealthGivenOnUse = tempHealthGivenOnUse;
        this.givesActionsOnUse = givesActionsOnUse;
        this.numberActionsGivenOnUse = numberActionsGivenOnUse;
        this.givesBonusActionsOnUse = givesBonusActionsOnUse;
        this.numberBonusActionsGivenOnUse = numberBonusActionsGivenOnUse;
        this.hasLimitedUsages = hasLimitedUsages;
        this.maxNumUsages = maxNumUsages;
        this.numUsagesLeft = numUsagesLeft;
        this.maxUsageDuration = maxUsageDuration;
        this.hasSubFeatures = hasSubFeatures;
        this.subFeatures = subFeatures;
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

    public boolean affectsStatValues() {
        return affectsStatValues;
    }
    public void setAffectsStatValues(boolean affectsStatValues) {
        this.affectsStatValues = affectsStatValues;
    }

    public List<ValueModifier> getValueModifierList() {
        return valueModifierList;
    }
    public void setValueModifierList(List<ValueModifier> valueModifierList) {
        this.valueModifierList = valueModifierList;
    }

    public boolean givesProficiencies() {
        return givesProficiencies;
    }
    public void setGivesProficiencies(boolean givesProficiencies) {
        this.givesProficiencies = givesProficiencies;
    }

    public List<String> getProficiencyList() {
        return proficiencyList;
    }
    public void setProficiencyList(List<String> proficiencyList) {
        this.proficiencyList = proficiencyList;
    }

    public boolean givesHealthOnUse() {
        return givesHealthOnUse;
    }
    public void setGivesHealthOnUse(boolean givesHealthOnUse) {
        this.givesHealthOnUse = givesHealthOnUse;
    }

    public int getHealthGivenOnUse() {
        return healthGivenOnUse;
    }
    public void setHealthGivenOnUse(int healthGivenOnUse) {
        this.healthGivenOnUse = healthGivenOnUse;
    }

    public boolean givesTempHealthOnUse() {
        return givesTempHealthOnUse;
    }
    public void setGivesTempHealthOnUse(boolean givesTempHealthOnUse) {
        this.givesTempHealthOnUse = givesTempHealthOnUse;
    }

    public int getTempHealthGivenOnUse() {
        return tempHealthGivenOnUse;
    }
    public void setTempHealthGivenOnUse(int tempHealthGivenOnUse) {
        this.tempHealthGivenOnUse = tempHealthGivenOnUse;
    }

    public boolean givesActionsOnUse() {
        return givesActionsOnUse;
    }
    public void setGivesActionsOnUse(boolean givesActionsOnUse) {
        this.givesActionsOnUse = givesActionsOnUse;
    }

    public int getNumberActionsGivenOnUse() {
        return numberActionsGivenOnUse;
    }
    public void setNumberActionsGivenOnUse(int numberActionsGivenOnUse) {
        this.numberActionsGivenOnUse = numberActionsGivenOnUse;
    }

    public boolean givesBonusActionsOnUse() {
        return givesBonusActionsOnUse;
    }
    public void setGivesBonusActionsOnUse(boolean givesBonusActionsOnUse) {
        this.givesBonusActionsOnUse = givesBonusActionsOnUse;
    }

    public int getNumberBonusActionsGivenOnUse() {
        return numberBonusActionsGivenOnUse;
    }
    public void setNumberBonusActionsGivenOnUse(int numberBonusActionsGivenOnUse) {
        this.numberBonusActionsGivenOnUse = numberBonusActionsGivenOnUse;
    }
}
