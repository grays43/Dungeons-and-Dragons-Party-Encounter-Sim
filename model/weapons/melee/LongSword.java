package model.weapons.melee;

import model.dice.Dice;
import model.weapons.DamageType;
import model.weapons.Weapon;
import model.weapons.WeaponType;

public class LongSword extends Weapon {
    public LongSword() {
        super(WeaponType.MELEE, new Dice(8), DamageType.SLASHING);
    }
}
