package homeWorkSem2.animals.base;

import homeWorkSem2.terrarium.Soundable;

public abstract class Animal implements Soundable {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String sound();

    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name: %s, Feed: %s", name, feed());
    }
}