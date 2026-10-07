package model.weapons.melee;

import model.dice.Dice;
import model.weapons.Weapon;

public class LongSword extends Weapon {
    public LongSword() {
        super(model.weapons.WeaponType.MELEE, new Dice(8));
    }    
}
