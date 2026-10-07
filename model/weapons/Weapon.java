package model.weapons;

import model.dice.Dice;

public class Weapon {

    private WeaponType weaponType;
    private Dice damageDie;
    private DamageType mainDamage;

    public Weapon(WeaponType weaponType, Dice damageDie, DamageType mainDamage) {
        this.weaponType = weaponType;
        this.damageDie = damageDie;
        this.mainDamage = mainDamage;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public Dice getDamageDie() {
        return damageDie;
    }

    public DamageType getMainDamage() {
        return mainDamage;
    }
}
