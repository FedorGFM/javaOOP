package lesson4.shield;

public class Shield implements Shields{
    @Override
    public int getProtection() {
        return 7;
    }
    @Override
    public String toString() {
        return String.format("Shield: %d ", getProtection());
    }
}
