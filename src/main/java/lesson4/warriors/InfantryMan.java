package lesson4.warriors;

import lesson4.protection.Shields;
import lesson4.weapons.meleeWeapon.Melee;

public class InfantryMan extends Warrior<Melee, Shields> {
    public InfantryMan(String name, int healthPoint, Melee weapon) {
        super(name, healthPoint, weapon);
    }

    public InfantryMan(String name, int healthPoint, Melee weapon, Shields shields) {
        super(name, healthPoint, weapon, shields);
    }

    @Override
    public String toString() {
        return String.format("InfantryMan: %s", super.toString());
    }
}
