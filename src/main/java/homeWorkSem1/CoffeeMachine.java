package homeWorkSem1;

import java.util.*;
public class CoffeeMachine {
    private List<CoffeeType> assortmentList = new ArrayList<>();
    private double cash = 0;
    private int coffeeBeansKG = 999;

    public CoffeeMachine addProduct(CoffeeType name) {
        assortmentList.add(name);
        return this;
    }

    public CoffeeType findProduct(String name) {
        //StringBuilder resultBuilder = new StringBuilder();

        for (CoffeeType type : assortmentList) {
            if (name.equals(type.getName())) {
                //resultBuilder.append(name).append("\n");
                return type;
            }
        }
        return null;
    }

    public Volume findByCupSize(String typeOfCup) {
        for (CoffeeType cup : assortmentList) {
            if (typeOfCup.equals(cup.getTypeOfCup())) {
                return (Volume) cup;
            }
        }
        return null;
    }

    public Volume saleProduct(String name, String typeOfCup) {
        Volume foundName = (Volume) findProduct(name);
        Volume foundCup = findByCupSize(typeOfCup);


        if (coffeeBeansKG > 10) {
            if (foundName != null && foundCup != null) {
                cash = cash + foundName.getPrice();
                coffeeBeansKG = coffeeBeansKG - foundName.getCupBeansWeight();
            }

        }
        return foundName;
    }

    public List<CoffeeType> getAssortmentList() {
        return assortmentList;
    }

    public double getCash() {
        return cash;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (CoffeeType name : assortmentList) {
            builder.append(name).append("\n");

        }
        builder.append("\n").append("Денег в автомате: ").append(cash).append("рублей").append("\n").append("Наличие зерен кофе в автомате: ")
                .append(coffeeBeansKG).append("гр").append("\n");
        return builder.toString();
    }
}
