package homeWorkSem1;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.addProduct(new Volume("Эспрессо", 10, 170, "Маленький", 0.3, 80))
                .addProduct(new Volume("Капучино", 10, 125, "Маленький", 0.3, 90))
                .addProduct(new Volume("Капучино", 15, 155, "Средний", 0.4, 90))
                .addProduct(new Volume("Латтэ", 10, 160, "Маленький", 0.3, 100))
                .addProduct(new Volume("Латтэ", 14, 195, "Средний", 0.4, 100))
                .addProduct(new Volume("Латтэ", 18, 235, "Большой", 0.5, 100))
                .addProduct(new Volume("Американо", 25, 140, "Маленький", 0.2, 95));

        System.out.println(coffeeMachine);

        System.out.println("---Кофе продано---");
        Volume saleProduct1 = coffeeMachine.saleProduct("Латтэ", "Большой");
        System.out.println(saleProduct1);

        Volume saleProduct2 = coffeeMachine.saleProduct("Американо", "Маленький");
        System.out.println(saleProduct2);

        Volume saleProduct3 = coffeeMachine.saleProduct("Эспрессо", "Маленький");
        System.out.println(saleProduct3);

        Volume saleProduct4 = coffeeMachine.saleProduct("Капучино", "Средний");
        System.out.println(saleProduct4);
        System.out.println("\n");

        System.out.println("------------------------------------------------Еще есть----------------------------------------------------------");

        System.out.println(coffeeMachine);


    }
}
