package com.company;

import com.company.Character.Character;
import com.company.Character.EncounterDetails;
import com.company.DataValues.Ability;
import com.company.DataValues.Skill;

import java.util.*;

public class Main {

    private static void printAbilityScore(Ability ability)
    {
        System.out.println("Ability: " + ability.getName() + ": Value: " + ability.getBaseValue() + ": Modifier: " + ability.getModifierValue());
    }

    public static void printAbilityValues(Character testCharacter)
    {
        Dictionary<String, Ability> abilities = testCharacter.getStats().getAbilityList();
        Ability ability = abilities.get(Constants.STRENGTH_ABILITY_NAME);
        printAbilityScore(ability);

        ability = abilities.get(Constants.DEXTERITY_ABILITY_NAME);
        printAbilityScore(ability);

        ability = abilities.get(Constants.CONSTITUTION_ABILITY_NAME);
        printAbilityScore(ability);

        ability = abilities.get(Constants.INTELLIGENCE_ABILITY_NAME);
        printAbilityScore(ability);

        ability = abilities.get(Constants.WISDOM_ABILITY_NAME);
        printAbilityScore(ability);

        ability = abilities.get(Constants.CHARISMA_ABILITY_NAME);
        printAbilityScore(ability);
    }

    public static void printSavingThrowValues(Character testCharacter)
    {
        Dictionary<String, Skill> savingThrowSkillsDictionary = testCharacter.getStats().getSavingThrowSkillList();

        Skill skill = savingThrowSkillsDictionary.get(Constants.STRENGTH_ABILITY_NAME);
        printSkillValue(skill);

        skill = savingThrowSkillsDictionary.get(Constants.DEXTERITY_ABILITY_NAME);
        printSkillValue(skill);

        skill = savingThrowSkillsDictionary.get(Constants.CONSTITUTION_ABILITY_NAME);
        printSkillValue(skill);

        skill = savingThrowSkillsDictionary.get(Constants.INTELLIGENCE_ABILITY_NAME);
        printSkillValue(skill);

        skill = savingThrowSkillsDictionary.get(Constants.WISDOM_ABILITY_NAME);
        printSkillValue(skill);

        skill = savingThrowSkillsDictionary.get(Constants.CHARISMA_ABILITY_NAME);
        printSkillValue(skill);
    }

    private static void printSkillValue(Skill skill)
    {
        System.out.println("Skill: " + skill.getName() + " : isProficient: " + skill.isCharacterProficient() + " : Value: " + skill.getValue());
    }

    private static void printSkillValues(Character testCharacter) {
        Dictionary<String, Skill> skills = testCharacter.getStats().getSkillList();

        Skill skill = skills.get(Constants.ACROBATICS_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.ANIMAL_HANDLING_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.ARCANA_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.ATHLETICS_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.DECEPTION_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.HISTORY_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.INSIGHT_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.INTIMIDATION_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.INVESTIGATION_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.MEDICINE_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.NATURE_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.PERCEPTION_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.PERFORMANCE_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.PERSUASION_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.RELIGION_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.SLEIGHT_OF_HAND_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.STEALTH_SKILL_NAME);
        printSkillValue(skill);

        skill = skills.get(Constants.SURVIVAL_SKILL_NAME);
        printSkillValue(skill);
    }

    private static void printEncounterDetails(Character testCharacter) {
        //Print AC, initiative mod, speed, Max hit points, current hit points, temp hit points,
        //num available hit dice, hit dice type, successful death saves, failed death saves.
        EncounterDetails characterEncounterDetails = testCharacter.getEncounterDetails();

        System.out.println("AC: " + characterEncounterDetails.getArmorClassValue());
        System.out.println("Initiative Mod.: " + characterEncounterDetails.getInitiativeValue());
        System.out.println("Speed: " + characterEncounterDetails.getSpeedValue());
        System.out.println("Max Hit Points:" + characterEncounterDetails.getMaxHitPoints());
        System.out.println("Current Hit Points: " + characterEncounterDetails.getCurrentHitPoints());
        System.out.println("Num. Hit Dice: " + characterEncounterDetails.getMaxHitDice());
        System.out.println("Hit dice: " + characterEncounterDetails.getHitDiceType());
        System.out.println("Success Death saves: " + characterEncounterDetails.getNumSuccessDeathSaves());
        System.out.println("Failed Death saves: " + characterEncounterDetails.getNumFailedDeathSaves());
    }

    public static void main(String[] args) {
        Character testCharacter = new Character("Michael", "Human", "Fighter",
                "Folk hero", "Neutral Good", 5, 14477, "Metro Aran",
                new ArrayList<>(Arrays.asList(17, 11, 14, 17, 10, 13)),
                new ArrayList<>(Arrays.asList(Constants.STRENGTH_ABILITY_NAME, Constants.CONSTITUTION_ABILITY_NAME)),
                new ArrayList<>(Arrays.asList(Constants.ATHLETICS_SKILL_NAME, Constants.INSIGHT_SKILL_NAME, Constants.PERCEPTION_SKILL_NAME, Constants.PERSUASION_SKILL_NAME)));
        System.out.println("Character Name: " + testCharacter.getBaseDetails().getName());
        System.out.println("Race: " + testCharacter.getBaseDetails().getRace());
        System.out.println("Class: " + testCharacter.getBaseDetails().getCharacterClass());
        System.out.println("Background: " + testCharacter.getBaseDetails().getBackground());
        System.out.println("Level: " + testCharacter.getBaseDetails().getLevel());
        System.out.println();
        System.out.println("Proficiency Bonus: " + testCharacter.getStats().getProficiencyBonus());
        System.out.println();
        printAbilityValues(testCharacter);
        System.out.println();
        printSavingThrowValues(testCharacter);
        System.out.println();
        printSkillValues(testCharacter);
        System.out.println();
        printEncounterDetails(testCharacter);

//        Character testCharacter = new Character("Ann", "Human", "Fighter",
//                "Folk hero", "Neutral Good", 1, 200, "Commander Shepard",
//                new ArrayList<>(Arrays.asList(16, 18, 14, 11, 10, 9)),
//                new ArrayList<>(Arrays.asList(Constants.STRENGTH_ABILITY_NAME, Constants.CONSTITUTION_ABILITY_NAME)),
//                new ArrayList<>(Arrays.asList(Constants.ATHLETICS_SKILL_NAME, Constants.INSIGHT_SKILL_NAME, Constants.PERCEPTION_SKILL_NAME, Constants.PERSUASION_SKILL_NAME)));
//        System.out.println("Character Name: " + testCharacter.getName());
//        System.out.println("Race: " + testCharacter.getRace());
//        System.out.println("Class: " + testCharacter.getCharacterClass());
//        System.out.println("Background: " + testCharacter.getBackground());
//        System.out.println("Level: " + testCharacter.getLevel());
//        System.out.println();
//        System.out.println("Proficiency Bonus: " + testCharacter.getProficiencyBonus());
//        System.out.println();
//        printAbilityValues(testCharacter);
//        System.out.println();
//        printSavingThrowValues(testCharacter);
//        System.out.println();
//        printSkillValues(testCharacter);

    }
}
