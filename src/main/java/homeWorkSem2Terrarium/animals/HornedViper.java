package homeWorkSem2Terrarium.animals;

import homeWorkSem2Terrarium.animals.base.Snake;
import homeWorkSem2Terrarium.RunSpeed;
import homeWorkSem2Terrarium.SwimSpeed;

public class HornedViper extends Snake implements RunSpeed, SwimSpeed {
    public HornedViper(String name) {
        super(name);
    }

    @Override
    public String sound(){
        return "щЩщЩщ";
    }

    @Override
    public String feed(){
        return "Грызуны";
    }

    @Override
    public String toString() {
        return String.format("Snake: %s, Speed: %s, SwimSpeed: %d", super.toString(), getRunSpeed(), getSwimSpeed());
    }

    @Override
    public int getRunSpeed() {
        return 12;
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }
}