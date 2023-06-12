package lesson4;

import lesson4.protection.Cuirasse;
import lesson4.protection.Shield;
import lesson4.warriors.Archer;
import lesson4.warriors.InfantryMan;
import lesson4.warriors.Warrior;
import lesson4.weapons.meleeWeapon.Axe;
import lesson4.weapons.meleeWeapon.Sword;
import lesson4.weapons.rangedWeapon.Bow;
import lesson4.weapons.rangedWeapon.CrossBow;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow(), new Cuirasse()));
        team1.add(new InfantryMan("John", 150, new Axe(), new Shield()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 80, new CrossBow()));
        teamArchers.add(new Archer("Piter", 100, new Bow()));

        Team<InfantryMan> teamInfantryMan = new Team<>();
        teamInfantryMan.add(new InfantryMan("James", 150, new Sword(), new Cuirasse()));

        System.out.println("--------------");
        System.out.println(team1);
        System.out.println("--------------");
        System.out.println(teamArchers);
        System.out.println("--------------");
        System.out.println(teamInfantryMan);
        System.out.println("\n");

        Battle battle1 = new Battle(new InfantryMan("John", 150, new Axe(), new Shield()), (new Archer("Robin", 100, new Bow(), new Cuirasse())));

        battle1.fight();
    }
}
