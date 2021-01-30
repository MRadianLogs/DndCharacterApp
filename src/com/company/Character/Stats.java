package com.company.Character;

import com.company.DataValues.Ability;
import com.company.Constants;
import com.company.DataValues.Skill;
import com.company.Util.ProficiencyBonusCalculator;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class Stats {

    //Stats
    private boolean hasInspiration;
    private int proficiencyBonus;
    private Dictionary<String, Ability> abilityList;
    private Dictionary<String, Skill> savingThrowSkillList;
    private Dictionary<String, Skill> skillList;
    private int passiveWisdomPerception;

    public Stats() {
        this.hasInspiration = false;
        this.proficiencyBonus = -1;
        this.abilityList = new Hashtable<>();
        this.savingThrowSkillList = new Hashtable<>();
        this.skillList = new Hashtable<>();
        this.passiveWisdomPerception = -1;
    }

    public void setupStats(int level, List<Integer> abilityScores, List<String> listProficientSavingThrows, List<String> listProficientSkills)
    {
        calculateProficiencyBonus(level);
        setupAbilityScores(abilityScores);
        setupSavingThrows(listProficientSavingThrows);
        setupSkills(listProficientSkills);
    }

    private void setupAbilityScores(List<Integer> abilityScores) {
        //Read ability scores in order: Str, Dex, Con, Int, Wis, Cha
        abilityList = new Hashtable<>();
        abilityList.put(Constants.STRENGTH_ABILITY_NAME, new Ability(Constants.STRENGTH_ABILITY_NAME, abilityScores.get(0), null, false, 0));
        abilityList.put(Constants.DEXTERITY_ABILITY_NAME, new Ability(Constants.DEXTERITY_ABILITY_NAME, abilityScores.get(1), null, false, 0));
        abilityList.put(Constants.CONSTITUTION_ABILITY_NAME, new Ability(Constants.CONSTITUTION_ABILITY_NAME, abilityScores.get(2), null, false, 0));
        abilityList.put(Constants.INTELLIGENCE_ABILITY_NAME, new Ability(Constants.INTELLIGENCE_ABILITY_NAME, abilityScores.get(3), null, false, 0));
        abilityList.put(Constants.WISDOM_ABILITY_NAME, new Ability(Constants.WISDOM_ABILITY_NAME, abilityScores.get(4), null, false, 0));
        abilityList.put(Constants.CHARISMA_ABILITY_NAME, new Ability(Constants.CHARISMA_ABILITY_NAME, abilityScores.get(5), null, false, 0));
    }

    private void setupSavingThrows(List<String> listProficientSavingThrows) {
        //Create list of saving throws. Str, Dex, Con, Int, Wis, Cha.
        savingThrowSkillList = new Hashtable<>();

        String skillName = Constants.STRENGTH_ABILITY_NAME;
        Skill newSkill = new Skill(skillName, abilityList.get(skillName), false, null, false, 0);
        savingThrowSkillList.put(skillName, newSkill);

        skillName = Constants.DEXTERITY_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(skillName), false, null, false, 0);
        savingThrowSkillList.put(skillName, newSkill);

        skillName = Constants.CONSTITUTION_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(skillName), false, null, false, 0);
        savingThrowSkillList.put(skillName, newSkill);

        skillName = Constants.INTELLIGENCE_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(skillName), false, null, false, 0);
        savingThrowSkillList.put(skillName, newSkill);

        skillName = Constants.WISDOM_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(skillName), false, null, false, 0);
        savingThrowSkillList.put(skillName, newSkill);

        skillName = Constants.CHARISMA_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(skillName), false, null, false, 0);
        savingThrowSkillList.put(skillName, newSkill);

        //Add proficiencies.
        for (String proficiencyName:
                listProficientSavingThrows) {
            Skill desiredSkill = savingThrowSkillList.get(proficiencyName);
            if(desiredSkill != null)
                desiredSkill.setCharacterProficient(true);
        }

        //Calculate values of skills.
        int proficiencyBonusToCalc = getProficiencyBonus();
        Enumeration<Skill> skills = savingThrowSkillList.elements();
        while(skills.hasMoreElements()) {
            Skill skillToCalculate = skills.nextElement();
            skillToCalculate.calculateSkillValue(proficiencyBonusToCalc);
        }
    }

    private void setupSkills(List<String> listProficientSkills) {
        //Create list of skills.
        skillList = new Hashtable<>();

        String skillName = Constants.ACROBATICS_SKILL_NAME;
        String connectedAbilityName = Constants.DEXTERITY_ABILITY_NAME;
        Skill newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.ANIMAL_HANDLING_SKILL_NAME;
        connectedAbilityName = Constants.WISDOM_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.ARCANA_SKILL_NAME;
        connectedAbilityName = Constants.INTELLIGENCE_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.ATHLETICS_SKILL_NAME;
        connectedAbilityName = Constants.STRENGTH_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.DECEPTION_SKILL_NAME;
        connectedAbilityName = Constants.CHARISMA_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.HISTORY_SKILL_NAME;
        connectedAbilityName = Constants.INTELLIGENCE_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.INSIGHT_SKILL_NAME;
        connectedAbilityName = Constants.WISDOM_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.INTIMIDATION_SKILL_NAME;
        connectedAbilityName = Constants.CHARISMA_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.INVESTIGATION_SKILL_NAME;
        connectedAbilityName = Constants.INTELLIGENCE_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.MEDICINE_SKILL_NAME;
        connectedAbilityName = Constants.WISDOM_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.NATURE_SKILL_NAME;
        connectedAbilityName = Constants.INTELLIGENCE_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.PERCEPTION_SKILL_NAME;
        connectedAbilityName = Constants.WISDOM_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.PERFORMANCE_SKILL_NAME;
        connectedAbilityName = Constants.CHARISMA_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.PERSUASION_SKILL_NAME;
        connectedAbilityName = Constants.CHARISMA_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.RELIGION_SKILL_NAME;
        connectedAbilityName = Constants.INTELLIGENCE_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.SLEIGHT_OF_HAND_SKILL_NAME;
        connectedAbilityName = Constants.DEXTERITY_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.STEALTH_SKILL_NAME;
        connectedAbilityName = Constants.DEXTERITY_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        skillName = Constants.SURVIVAL_SKILL_NAME;
        connectedAbilityName = Constants.WISDOM_ABILITY_NAME;
        newSkill = new Skill(skillName, abilityList.get(connectedAbilityName), false, null, false, 0);
        skillList.put(skillName, newSkill);

        //Add proficiencies.
        for (String proficiencyName:
                listProficientSkills) {
            Skill desiredSkill = skillList.get(proficiencyName);
            if(desiredSkill != null)
                desiredSkill.setCharacterProficient(true);
        }

        //Calculate values of skills.
        int proficiencyBonusToCalc = getProficiencyBonus();
        Enumeration<Skill> skills = skillList.elements();
        while(skills.hasMoreElements()) {
            Skill skillToCalculate = skills.nextElement();
            skillToCalculate.calculateSkillValue(proficiencyBonusToCalc);
        }
    }

    public void calculateProficiencyBonus(int level)
    {
        proficiencyBonus = ProficiencyBonusCalculator.getProficiencyBonus(level);
    }

    public void calculatePassiveWisdomPerception()
    {
        passiveWisdomPerception = 10 + skillList.get(Constants.PERCEPTION_SKILL_NAME).getValue();
    }

    public boolean hasInspiration() {
        return hasInspiration;
    }
    public void setHasInspiration(boolean hasInspiration) {
        this.hasInspiration = hasInspiration;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }
    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public Dictionary<String, Ability> getAbilityList() {
        return abilityList;
    }
    public void setAbilityList(Dictionary<String, Ability> abilityList) {
        this.abilityList = abilityList;
    }

    public Dictionary<String, Skill> getSavingThrowSkillList() {
        return savingThrowSkillList;
    }
    public void setSavingThrowSkillList(Dictionary<String, Skill> savingThrowSkillList) {
        this.savingThrowSkillList = savingThrowSkillList;
    }

    public Dictionary<String, Skill> getSkillList() {
        return skillList;
    }
    public void setSkillList(Dictionary<String, Skill> skillList) {
        this.skillList = skillList;
    }

    public int getPassiveWisdomPerception() {
        return passiveWisdomPerception;
    }
    public void setPassiveWisdomPerception(int passiveWisdomPerception) {
        this.passiveWisdomPerception = passiveWisdomPerception;
    }
}
