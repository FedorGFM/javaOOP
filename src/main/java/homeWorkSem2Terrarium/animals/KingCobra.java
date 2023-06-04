package homeWorkSem2Terrarium.animals;

import homeWorkSem2Terrarium.animals.base.Snake;
import homeWorkSem2Terrarium.RunSpeed;
import homeWorkSem2Terrarium.SwimSpeed;

public class KingCobra extends Snake implements RunSpeed, SwimSpeed {
    public KingCobra(String name) {
        super(name);
    }

    @Override
    public String sound(){
        return "щщщщщ";
    }

    @Override
    public String feed(){
        return "Грызуны и другие виды змей";
    }

    @Override
    public String toString() {
        return String.format("Snake: %s, Speed: %s, SwimSpeed: %d", super.toString(), getRunSpeed(), getSwimSpeed());
    }

    @Override
    public int getRunSpeed() {
        return 15;
    }

    @Override
    public int getSwimSpeed() {
        return 15;
    }
}
