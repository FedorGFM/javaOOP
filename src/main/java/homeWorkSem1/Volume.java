package homeWorkSem1;

public class Volume extends CoffeeType{
    private String typeOfCup;



    private double volume;


    private int tempOfCoffee;

    public Volume (String name, int cupBeansWeight, int price, String typeOfCup, double volume){
        super(name, cupBeansWeight, price);
        this.typeOfCup = typeOfCup;
        this.volume = volume;
    }
    @Override
    public String toString(){
        return String.format("Кофе: %s, Размер стаканчика: %s, Объем стаканчика: %f", super.toString(), typeOfCup, volume);
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
