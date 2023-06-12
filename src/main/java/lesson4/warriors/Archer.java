package lesson4.warriors;

import lesson4.shield.Shields;
import lesson4.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged, Shields>{
    public Archer(String name, int healthPoint, Ranged weapon) {
        super(name, healthPoint, weapon);
    }

    public Archer(String name, int healthPoint, Ranged weapon, Shields shields) {
        super(name, healthPoint, weapon, shields);
    }

    public int distance() {
        return (super.getWeapon()).distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %s",super.toString(), distance());
    }
}
