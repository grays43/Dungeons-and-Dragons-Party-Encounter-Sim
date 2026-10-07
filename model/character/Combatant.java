package model.character;

import model.combat.CombatActions;
import model.dice.Dice;
import model.weapons.Weapon;

public class Combatant implements CombatActions { 
    private AbilityScores abilityScores;
    private DefenseStats defenseStats;
    private HitPoints hitPoints;
    private Weapon weapon;
    private Dice d20;

    public Combatant(AbilityScores abilityScores, HitPoints hitPoints, 
            DefenseStats defenseStats, Weapon weapon) {

        this.abilityScores = abilityScores;
        this.hitPoints = hitPoints;
        this.defenseStats = defenseStats;
        this.weapon = weapon;
        this.d20 = new Dice(20);
    }

    public void takeDamage(int damage) {
        this.hitPoints.takeDamage(damage);
    }


    @Override
    public boolean isHit(int enemyRoll) {
        if (enemyRoll >= this.defenseStats.getAC()) {
            return true;
        }
        return false;
    }

    @Override
    public int hitRoll() { // TODO: implement hitroll system
        return 0;
    }

    @Override
    public int damageRoll() { // TODO: implement damage roll system
        return 0;
    }

    public AbilityScores getAbilityScores() {
        return abilityScores;
    }

    public HitPoints getHitPoints() {
        return hitPoints;
    }

    public Dice getD20() {
        return d20;
    }
    
    public DefenseStats getDefenseStats() {
        return defenseStats;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    
}