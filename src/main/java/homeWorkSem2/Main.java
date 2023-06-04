package homeWorkSem2;

import homeWorkSem2.animals.BlackWidow;
import homeWorkSem2.animals.HornedViper;
import homeWorkSem2.animals.KingCobra;
import homeWorkSem2.animals.RattleSnake;
import homeWorkSem2.animals.Turtle;
import homeWorkSem2.animals.base.Snake;
import homeWorkSem2.terrarium.Terrarium;

public class Main {
    public static void main(String[] args) {
        Terrarium terrarium = new Terrarium();
        terrarium.addAnimal(new BlackWidow("BlackWidow"))
                .addAnimal(new HornedViper("HornedViper"))
                .addAnimal(new KingCobra("KingCobra"))
                .addAnimal(new RattleSnake("RattleSnake"))
                .addAnimal(new Turtle("Дашка"));


//        zoo.addAnimal(bear).addAnimal(cow).addAnimal(new Duck("Donald")).addAnimal(new Owl("Савунья"));
//        System.out.println(zoo);

        System.out.println(terrarium.getSound());

        System.out.println("---Runners---");
        for (RunSpeed runner : terrarium.runners()) {
            System.out.println(runner);
        }
        System.out.println("\n");

        System.out.println("---Swimmers---");
        for (SwimSpeed swimmer : terrarium.swimmers()) {
            System.out.println(swimmer);
        }
        System.out.println("\n");


        System.out.println("---Champions Runners---");
        System.out.println(terrarium.getRunnerChampion());
        System.out.println("\n");

        System.out.println("---Champion Swimmer---");
        System.out.println(terrarium.getSwimmerChampion());
        System.out.println("\n");
    }
}
