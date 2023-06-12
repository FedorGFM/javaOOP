package lesson4.protection;

public class Cuirasse implements Shields {
    @Override
    public int getProtection() {
        return 4;
    }
    @Override
    public String toString() {
        return String.format("Cuirasse: %d ", getProtection());
    }
}
