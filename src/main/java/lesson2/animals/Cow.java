package lesson2.animals;

import lesson2.RunSpeed;
import lesson2.animals.base.Herbivores;

public class Cow extends Herbivores implements RunSpeed {
    public Cow(String name) {
        super(name);
    }

    @Override
    public String sound(){
        return "Moo";
    }

    @Override
    public String toString() {
        return String.format("Cow: %s, Speed: %s", super.toString(), getRunSpeed());
    }

    @Override
    public int getRunSpeed() {
        return 3;
    }
}
