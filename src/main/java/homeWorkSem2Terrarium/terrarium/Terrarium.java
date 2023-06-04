package homeWorkSem2Terrarium.terrarium;

import homeWorkSem2Terrarium.RunSpeed;
import homeWorkSem2Terrarium.SwimSpeed;
import homeWorkSem2Terrarium.animals.base.Animal;

import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    List<Animal> terrarium = new ArrayList<>();

    public Terrarium addAnimal(Animal someAnimal){
        terrarium.add(someAnimal);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("В Террариуме:\n");
        for (Animal animal : terrarium) {
            builder.append(animal)
                    .append("\n");
        }
        return builder.toString();
    }

    private List<Soundable> getSoundable() {
        List<Soundable> result = new ArrayList<>(terrarium);
        return result ;
    }

    public String getSound(){
        StringBuilder builder = new StringBuilder();
        for (Soundable soundable: getSoundable()) {
            builder.append(soundable.sound()).append("\n");
        }
        return builder.toString();
    }

    public List<RunSpeed> runners() {
        List<RunSpeed> runners = new ArrayList<>();
        for (Animal animal : terrarium) {
            if (animal instanceof RunSpeed) {
                runners.add((RunSpeed) animal);
            }
        }
        return runners;
    }

    public RunSpeed getRunnerChampion(){
        List<RunSpeed> runners = runners();
        RunSpeed champ = runners.get(0);
        for (RunSpeed runner : runners) {
            if (champ.getRunSpeed() < runner.getRunSpeed()) {
                champ = runner;
            }
        }
        return champ;
    }


    public List<SwimSpeed> swimmers() {
        List<SwimSpeed> swimmer = new ArrayList<>();
        for (Animal animal : terrarium) {
            if (animal instanceof SwimSpeed){
                swimmer.add((SwimSpeed) animal);
            }
        }
        return swimmer;
    }

    public SwimSpeed getSwimmerChampion(){
        List<SwimSpeed> swimmers = swimmers();
        SwimSpeed champ = swimmers.get(0);
        for (SwimSpeed runner : swimmers) {
            if (champ.getSwimSpeed() < runner.getSwimSpeed()) {
                champ = runner;
            }
        }
        return champ;
    }

}
