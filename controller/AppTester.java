package controller;

import model.character.AbilityScores;
import model.character.Combatant;
import model.character.DefenseStats;
import model.character.HitPoints;
import model.weapons.Weapon;

public class AppTester {
    
    public static void main(String[] args) {
        int pcRoll, monsterRoll;        
        
        Combatant pc = pcCreation();
        Combatant monster = monsterCreation();

        for (int i = 0; i < 1000; i++) {
            pcRoll = pc.getD20().roll();
            monsterRoll = monster.getD20().roll();

            System.out.println("PC Roll: " + pcRoll);
            System.out.println("Monster Roll: " + monsterRoll);
        }        
        // test comment
    }

    public static Combatant pcCreation() {
        AbilityScores pcScores = new AbilityScores(10, 10, 10, 10, 10, 10);
        HitPoints pcHitPoints = new HitPoints(20, 0);
        DefenseStats pcDefenseStats = new DefenseStats(0, 0, 0, 0, 0, 0, 0);
        Weapon weapon = new model.weapons.melee.LongSword();

        return new Combatant(pcScores, pcHitPoints, pcDefenseStats, weapon);
    }
    
    public static Combatant monsterCreation() {
        AbilityScores monsterScores = new AbilityScores(10, 10, 10, 10, 10, 10);
        HitPoints monsterHitPoints = new HitPoints(20, 0);
        DefenseStats monsterDefenseStats = new DefenseStats(0, 0, 0, 0, 0, 0, 0);
        Weapon weapon = new model.weapons.melee.LongSword();

        
        return new Combatant(monsterScores, monsterHitPoints, monsterDefenseStats, weapon);
    }
    public static int randomStat(int max) {
        return (int) (Math.random() * max) + 1;
    }
    
}
