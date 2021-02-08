package com.company.Classes;

import com.company.DataValues.Item;

public class StartingEquipmentOption extends Item {

    private boolean isOpenWeaponChoice; //Ex: any two simple weapons.
    private int numWeaponsChooseable;
    private String weaponChoiceType;

    private boolean isAnAndOption; //Whether they get both options.
    private boolean isAnOrChoice; //Whether they have to choose between these two options.
    private Item firstOption;
    private Item secondOption;

    public StartingEquipmentOption(boolean isOpenWeaponChoice,
                                   int numWeaponsChooseable, String weaponChoiceType,
                                   boolean isAnAndOption, boolean isAnOrChoice,
                                   Item firstOption, Item secondOption) {
        this.isOpenWeaponChoice = isOpenWeaponChoice;
        this.numWeaponsChooseable = numWeaponsChooseable;
        this.weaponChoiceType = weaponChoiceType;
        this.isAnAndOption = isAnAndOption;
        this.isAnOrChoice = isAnOrChoice;
        this.firstOption = firstOption;
        this.secondOption = secondOption;
    }

    public boolean isOpenWeaponChoice() {
        return isOpenWeaponChoice;
    }
    public void setOpenWeaponChoice(boolean openWeaponChoice) {
        isOpenWeaponChoice = openWeaponChoice;
    }

    public int getNumWeaponsChooseable() {
        return numWeaponsChooseable;
    }
    public void setNumWeaponsChooseable(int numWeaponsChooseable) {
        this.numWeaponsChooseable = numWeaponsChooseable;
    }

    public String getWeaponChoiceType() {
        return weaponChoiceType;
    }
    public void setWeaponChoiceType(String weaponChoiceType) {
        this.weaponChoiceType = weaponChoiceType;
    }

    public boolean isAnAndOption() {
        return isAnAndOption;
    }
    public void setAnAndOption(boolean anAndOption) {
        isAnAndOption = anAndOption;
    }

    public boolean isAnOrChoice() {
        return isAnOrChoice;
    }
    public void setAnOrChoice(boolean anOrChoice) {
        isAnOrChoice = anOrChoice;
    }

    public Item getFirstOption() {
        return firstOption;
    }
    public void setFirstOption(Item firstOption) {
        this.firstOption = firstOption;
    }

    public Item getSecondOption() {
        return secondOption;
    }
    public void setSecondOption(Item secondOption) {
        this.secondOption = secondOption;
    }
}
