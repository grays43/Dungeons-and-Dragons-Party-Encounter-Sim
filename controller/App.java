package controller;

import model.character.AbilityScores;
import model.character.Combatant;
import model.character.DefenseStats;
import model.character.HitPoints;
import model.weapons.Weapon;

public class App {

    static public void main(String[] args) {
        int roll;
        AbilityScores pcScores = new AbilityScores(10, 10, 10, 10, 10, 10);
        HitPoints pcHitPoints = new HitPoints(20, 0);
        DefenseStats pcDefenseStats = new DefenseStats(0, 0, 0, 0, 0, 0, 0);
        Weapon weapon = new model.weapons.melee.LongSword();
        
        Combatant pc = new Combatant(pcScores, pcHitPoints, pcDefenseStats, weapon);

        for (int i = 0; i < 1000; i++) {
            roll = pc.getD20().roll();
            System.out.println("Roll: " + roll);
        }        
    }
}
