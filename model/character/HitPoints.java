package model.character;

public class HitPoints {
    private int maxHP, currHP, tempHP;

    public HitPoints(int maxHP, int tempHP) {
        this.maxHP = maxHP;
        this.currHP = maxHP;
        this.tempHP = tempHP;
    }

    public void heal(int amount) {
        this.currHP += amount;
        if (this.currHP > this.maxHP) {
            this.currHP = this.maxHP;
        }
    }

    // public void takeDamage(int damage) {
    // if (hasTempHP()) {
    // tempHpDamage(damage);
    // }

    // this.currHP -= damage;
    // if (this.currHP < 0) {
    // this.currHP = 0;
    // }
    // }

    public void takeDamage(int damage) {
        if (damage < 0) {
            throw new IllegalArgumentException("Damage cannot be negative");
        }

        int absorbed = Math.min(tempHP, damage);
        tempHP -= absorbed;

        int remainingDamage = damage - absorbed;
        currHP = Math.max(0, currHP - remainingDamage);
    }

    // gets and sets
    public int getMaxHP() {
        return maxHP;
    }

    public int getCurrHP() {
        return currHP;
    }

    public int getTempHP() {
        return tempHP;
    }

    public void setTempHP(int tempHP) {
        this.tempHP = tempHP;
    }

    public boolean hasTempHP() {
        return tempHP > 0;
    }
}
