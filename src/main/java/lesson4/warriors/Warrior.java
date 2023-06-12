package lesson4.warriors;

import lesson4.protection.Shields;
import lesson4.weapons.Weapon;

import java.util.Random;

public abstract class Warrior<W extends  Weapon, S extends Shields> {
    private final String name;
    private int healthPoint;
    private W weapon;
    private S shields;

    public Warrior(String name, int healthPoint, W weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shields = null;
    }

    public Warrior(String name, int healthPoint, W weapon, S shields) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shields = shields;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public S getShields() {
        return shields;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public void setShields(S shields) {
        this.shields = shields;
    }

    public int hit() {
        Random rnd = new Random();
        return rnd.nextInt(0, weapon.damage() + 1);
    }

    public void reduceHealth(int damage) {
        int protection = 0;
        if (shields != null) {
            protection = shields.getProtection();
        }
        damage -= protection;
        if (damage < 0) {
            damage = 0;
        }
        healthPoint -= damage;
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ").append(name).append(",");
        builder.append(" Weapon: ").append(weapon).append(",");
        if (shields != null){
            builder.append(" Protection: ").append(shields).append(",");
        }
        builder.append(" HealthPoint: ").append(healthPoint);
        return builder.toString();
    }
}
