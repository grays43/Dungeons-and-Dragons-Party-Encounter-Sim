package model.combat;

public interface CombatActions {    
    public int hitRoll();    
    public int damageRoll();
    public boolean isHit(int enemyRoll);
}
