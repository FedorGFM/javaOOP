package homeWorkSem2.animals;

import homeWorkSem2.RunSpeed;
import homeWorkSem2.animals.base.Spider;

public class BlackWidow extends Spider implements RunSpeed {
    public BlackWidow(String name) {
        super(name);
    }

    @Override
    public String sound(){
        return "---";
    }

    @Override
    public String feed(){
        return "Насекомые и другие пауки";
    }

    @Override
    public String toString() {
        return String.format("Spider: %s, Speed: %s", super.toString(), getRunSpeed());
    }

    @Override
    public int getRunSpeed() {
        return 1;
    }
}
