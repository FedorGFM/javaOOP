package homeWorkSem2Terrarium.animals;

import homeWorkSem2Terrarium.animals.base.Snake;
import homeWorkSem2Terrarium.RunSpeed;
import homeWorkSem2Terrarium.SwimSpeed;

public class RattleSnake extends Snake implements RunSpeed, SwimSpeed {
    public RattleSnake(String name) {
        super(name);
    }

    @Override
    public String sound(){
        return "ChrChrChrChr";
    }

    @Override
    public String feed(){
        return "birds, fish, frogs, small snakes, lizards, rodents";
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
