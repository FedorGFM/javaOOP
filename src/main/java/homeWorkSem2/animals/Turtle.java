package homeWorkSem2.animals;

import homeWorkSem2.animals.base.Herbivores;
import homeWorkSem2.RunSpeed;
import homeWorkSem2.SwimSpeed;

public class Turtle extends Herbivores implements RunSpeed, SwimSpeed {
    public Turtle(String name) {
        super(name);
    }

    @Override
    public String sound(){
        return "---";
    }

    @Override
    public String feed(){
        return "Фрукты, Зелень, Ягоды, Овощи";
    }

    @Override
    public String toString() {
        return String.format("Turtle: %s, Speed: %d, SwimSpeed: %d", super.toString(), getRunSpeed(), getSwimSpeed());
    }


    @Override
    public int getRunSpeed(){
        return 1;
    }
    @Override
    public int getSwimSpeed() {
        return 13;
    }
}
