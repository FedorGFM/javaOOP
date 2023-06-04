package homeWorkSem2.animals.base;

import homeWorkSem2.animals.base.Animal;

public abstract class Predator extends Animal {
    public Predator(String name) {
        super(name);
    }
    @Override
    public String feed(){
        return "";
    }
}