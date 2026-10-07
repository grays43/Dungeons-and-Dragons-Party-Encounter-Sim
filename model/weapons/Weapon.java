package model.weapons;

import model.dice.Dice;

public class Weapon {

    private WeaponType weaponType;
    private Dice damageDie;

    public Weapon(WeaponType weaponType, Dice damageDie) {
        this.weaponType = weaponType;
        this.damageDie = damageDie;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public Dice getDamageDie() {
        return damageDie;
    }

    public void setDamageDie(Dice damageDie) {
        this.damageDie = damageDie;
    }
}
