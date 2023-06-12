package lesson4;

import lesson4.warriors.Archer;
import lesson4.warriors.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Team<T extends Warrior> implements Iterable<T> {
    private List<T> team = new ArrayList<>();
    public void add(T element) {
        team.add(element);

    }

    @Override
    public Iterator<T> iterator() {
        return team.iterator();
    }

    public int getTeamHealth() {
        int teamHealth = 0;
        for (T t: this) {
            teamHealth += t.getHealthPoint();
        }
        return teamHealth;
    }

    public int maxAttackDistance() {
        int maxDistance = 0;
        for (T t: this) {
            if (!(t instanceof Archer)) {
                continue;
            }
            int currentDistance = ((Archer) t).distance();
            if (maxDistance <  currentDistance ) {
                maxDistance = currentDistance;
            }
        }
        return maxDistance;
    }

    public int getTeamAttack() {
        int teamAttack = 0;
        for (T t: this) {
            teamAttack += t.getWeapon().damage();
        }
        return teamAttack;
    }

    public int getMitTeamProtection() {
        int minTeamProtection = Integer.MIN_VALUE;
        for (T t: this) {
            int currentProtection = 0;
            if (t.getShields() != null) {
                currentProtection = t.getShields().getProtection();
            }
            if (currentProtection < minTeamProtection) {
                minTeamProtection = currentProtection;
            }
        }
        return minTeamProtection;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T t: this) {
            builder.append(t).append("\n");
        }
        builder.append(String.format("Team Attack: %d ", getTeamAttack()));
        builder.append(String.format("Team Protection: %d ", getMitTeamProtection()));
        builder.append(String.format("Team Health: %d ", getTeamHealth()));
        builder.append(String.format("Team Range: %d ", maxAttackDistance()));
        return builder.toString();
    }
}
