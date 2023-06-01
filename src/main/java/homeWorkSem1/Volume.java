package homeWorkSem1;

public class Volume extends CoffeeType{
    private String typeOfCup;



    private double volume;


    private int tempOfCoffee;

    public Volume (String name, int cupBeansWeight, int price, String typeOfCup, double volume, int tempOfCoffee){
        super(name, cupBeansWeight, price);
        this.typeOfCup = typeOfCup;
        this.volume = volume;
        this.tempOfCoffee = tempOfCoffee;
    }
    @Override
    public String toString(){
        return String.format("Кофе: %s, Размер стаканчика: %s, Объем стаканчика: %f, Температура: %d", super.toString(), typeOfCup, volume, tempOfCoffee);
    }

    public String getTypeOfCup() {
        return typeOfCup;
    }
    public double getVolume() {
        return volume;
    }
    public int getTempOfCoffee() {
        return tempOfCoffee;
    }
}
