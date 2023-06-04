package lesson2.animals;

import lesson2.FlySpeed;
import lesson2.RunSpeed;
import lesson2.SwimSpeed;
import lesson2.animals.base.Bird;

public class Owl extends Bird implements RunSpeed, FlySpeed {
    public Owl(String name) {
        super(name);
    }

    @Override
    public String sound(){
        return "Ух Ух";
    }

    @Override
    public String feed(){
        return "Грызуны";
    }

    @Override
    public int getRunSpeed(){
        return 2;
    }

    @Override
    public String toString() {
        return String.format("Owl: %s, Speed: %d, FlySpeed: %d", super.toString(), getRunSpeed(), getFlySpeed());
    }

    @Override
    public int getFlySpeed() {
        return 90;
    }

}
