package lesson2;

import lesson2.animals.Duck;
import lesson2.animals.Owl;
import lesson2.animals.base.Animal;
import lesson2.animals.Bear;
import lesson2.animals.Cow;
import lesson2.zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Animal bear = new Bear("Потапыч");
        Animal cow = new Cow("Мурка");

        Zoo zoo = new Zoo();
        zoo.addAnimal(bear).addAnimal(cow).addAnimal(new Duck("Donald")).addAnimal(new Owl("Савунья"));
        System.out.println(zoo);

        System.out.println(zoo.getSound());

        RunSpeed champ = zoo.getRunnerChampion();

        System.out.println("---Runners---");
        for (RunSpeed runner : zoo.runners()) {
            System.out.println(runner);
        }
        System.out.println("\n");

        System.out.println("---Flyers---");
        for (FlySpeed flyer : zoo.flyers()) {
            System.out.println(flyer);
        }
        System.out.println("\n");

        System.out.println("---Swimmers---");
        for (SwimSpeed swimmer : zoo.swimmers()) {
            System.out.println(swimmer);
        }
        System.out.println("\n");


        System.out.println("---Champions Runners---");
        System.out.println(champ);
        System.out.println("\n");

        System.out.println("---Champion Swimmer---");
        System.out.println(zoo.getSwimmerChampion());
        System.out.println("\n");

        System.out.println("---Champion Flyer---");
        System.out.println(zoo.getFlyChampion());
    }
}
