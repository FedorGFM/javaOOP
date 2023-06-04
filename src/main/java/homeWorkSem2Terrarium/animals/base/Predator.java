package homeWorkSem2Terrarium.animals.base;

public abstract class Predator extends Animal {
    public Predator(String name) {
        super(name);
    }
    @Override
    public String feed(){
        return "";
    }
}