package homeWorkSem1;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.addProduct(new Volume("эспрессо", 10, 170, "маленький", 0.3, 80))
                .addProduct(new Volume("капучино", 10, 125, "маленький", 0.3, 90))
                .addProduct(new Volume("капучино", 15, 155, "средний", 0.4, 90))
                .addProduct(new Volume("латтэ", 10, 160, "маленький", 0.3, 100))
                .addProduct(new Volume("латтэ", 14, 195, "средний", 0.4, 100))
                .addProduct(new Volume("латтэ", 18, 235, "большой", 0.5, 100))
                .addProduct(new Volume("американо", 25, 140, "маленький", 0.2, 95));

        System.out.println(coffeeMachine);

        System.out.println("---Кофе продано---");
        Volume saleProduct1 = coffeeMachine.saleProduct("латтэ", "средний");
        System.out.println(saleProduct1);

        Volume saleProduct2 = coffeeMachine.saleProduct("американо", "маленький");
        System.out.println(saleProduct2);

        Volume saleProduct3 = coffeeMachine.saleProduct("эспрессо", "маленький");
        System.out.println(saleProduct3);

        Volume saleProduct4 = coffeeMachine.saleProduct("капучино", "средний");
        System.out.println(saleProduct4);
        System.out.println("\n");

        System.out.println("------------------------------------------------Еще есть----------------------------------------------------------");

        System.out.println(coffeeMachine);


    }
}
