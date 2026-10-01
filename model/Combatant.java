package model;

public class Combatant implements CombatActions { 
    AbilityScores abilityScores;
    HitPoints hitPoints;

    public Combatant(AbilityScores abilityScores, HitPoints hitPoints) {                    
        this.abilityScores = abilityScores;
        this.hitPoints = hitPoints;
    }

    public void takeDamage(int damage) {
        this.hitPoints.takeDamage(damage);
    }


    @Override
    public boolean isHit(int enemyRoll) {
        if (enemyRoll >= this.abilityScores.getAC()) {
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


    
}