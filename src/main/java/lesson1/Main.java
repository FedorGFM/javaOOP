package lesson1;

public class Main {
    public static void main(String[] args) {
        VendingMachine apparat = new VendingMachine();
        apparat.addProduct(new Chocolate("Alpen gold", 10, "Темный", "С орехом", 100))
                .addProduct(new Product("Яблоко", 30))
                .addProduct(new Product("Кола", 20))
                .addProduct(new Cheese("Российский", 10, "Твердый", 1000));

        System.out.println(apparat);

        Product product = apparat.findProduct("Яблоко");
        System.out.println(product);

        System.out.println("---------------------");
        System.out.println("---Продано---");
        Product saleProduct = apparat.saleProduct("Яблоко");
        System.out.println(saleProduct);

        Product saleProduct2 = apparat.saleProduct("Кола");
        System.out.println(saleProduct2);

        System.out.println(apparat);
    }
}
